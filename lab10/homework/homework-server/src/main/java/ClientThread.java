import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientThread extends Thread {
    private Socket socket = null;
    private Person person = null;
    private final NetworkServer server;

    ClientThread(Socket socket, NetworkServer server) {
        this.socket = socket;
        this.server = server;
    }

    private PrintWriter out;

    /**
     * this method is used for running a connection thread
     */
    public void run() {
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new PrintWriter(socket.getOutputStream()); //server -> client stream
            while (true) {
                String request = in.readLine();
                if (request == null)
                    break;
                String response = null;
                System.out.println("Server received the request..." + request);
                if (request.equals("stop")) {
                    System.out.println("Server stopped");
                    try {
                        in.close();
                        out.close();
                        socket.close();
                        break;
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if (request.contains("register")){
                    boolean personAlreadyExists = false;
                    for (Person person : SocialNetwork.getNetwork()){
                        if(person.getName().equals(request.substring(9))){
                            response = "This name already exists in our Network.";
                            personAlreadyExists = true;
                        }
                    }
                    if(!personAlreadyExists) {
                        SocialNetwork.addPersonToNetwork(new Person(request.substring(9)));
                            response = "Register ok";
                    }
                }
                else if (request.contains("login")){
                    boolean connected = false;
                    for (Person person : SocialNetwork.getNetwork()){
                        if(person.getName().equals(request.substring(6))){
                            this.person = person;
                            response = ("Client connected as person: " + person.getName());
                            connected = true;
                        }
                    }
                    if(!connected){
                        response = "Login failed. The account may not exist or something was wrong.";
                    }
                }
                else if (request.contains("friend")){
                    if(this.person != null) {
                        boolean personExists = false;
                        for (Person person : SocialNetwork.getNetwork()) {
                            if (person.getName().equals(request.substring(7))) {
                                response = "Person successfully added to friends list";
                                this.person.addFriend(person);
                                personExists = true;
                            }
                        }
                        if (!personExists) {
                           response = "The person requested is not registered in our Network";
                        }
                    }
                    else {
                        response = "You should be logged for adding new friends";
                    }
                }
                else if (request.equals("displaymylist")){
                    System.out.println(this.person.getFriends());
                }
                else if (request.contains("send")){
                    String message = request.substring(5);
                    for(Person person : this.person.getFriends()){
                        person.addMessage(message);
                    }
                    response = "Message successfully sent";
                }
                else if (request.contains("read")){
                    for(String message : this.person.getMessages()){
                        response = message;
                        out.println(response);
                    }
                }
                if(response == null){
                    response = "Nothing from server at this moment";
                }
                out.println(response);
                out.flush();
            }
        } catch (IOException e) {
            System.err.println("Communication error... " + e);
        }

    }
}
