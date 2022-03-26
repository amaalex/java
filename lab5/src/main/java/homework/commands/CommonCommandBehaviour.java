package homework.commands;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public abstract class CommonCommandBehaviour implements Command {
    public static final String path = "C:/Users/alexa/Desktop/catalog.json";
    List<Object> obj;

    public void execute(Object... objects) throws IOException {
        this.obj = Arrays.stream(objects).toList();
        run();
    }

    abstract void run() throws IOException;

}
