package lab.compulsory.services;

import lab.compulsory.model.Friends;
import lab.compulsory.model.User;
import lab.compulsory.repository.FriendsRepository;
import lab.compulsory.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class ArticulationPointService {

    private HashMap<Integer, List<Integer>> adjList = new HashMap<>();

    private UserRepository userRepository;
    private FriendsRepository friendsRepository;

    private int time = 0;

    @Autowired
    public ArticulationPointService(UserRepository userRepository, FriendsRepository friendsRepository) {
        this.userRepository = userRepository;
        this.friendsRepository = friendsRepository;
    }

    public void getNetworkFromDB() {
        List<User> users = userRepository.findAll();
        for (User user : users) {
            adjList.put(user.getId(), new ArrayList<>());
            List<Friends> friendsRelationship1 = friendsRepository.findUserByFriendId1(user.getId());
            for (Friends friends : friendsRelationship1) {
                adjList.get(user.getId()).add(friends.getFriendId2());
            }
            List<Friends> friendsRelationship2 = friendsRepository.findUserByFriendId2(user.getId());
            for (Friends friends : friendsRelationship2) {
                adjList.get(user.getId()).add(friends.getFriendId1());
            }
        }
    }

    private void apUtil(int u, HashMap<Integer, Boolean> visited, HashMap<Integer, Integer> low, HashMap<Integer, Integer> disc,
                        int parent, HashMap<Integer, Boolean> isArtPoint) {
        int children = 0;
        visited.put(u,true);
        int t =  ++time;
        disc.put(u,t);
        low.put(u,t);

        for(Integer v: adjList.get(u)) {
            if (!visited.get(v)) {
                children++;
                apUtil(v, visited, low, disc, u, isArtPoint);
            }

            low.put(u, (Math.min(low.get(u), low.get(v))));
            if (parent != -1 && low.get(v) >= disc.get(u))
                isArtPoint.put(u, true);
        }

        if (parent == -1 && children > 1)
            isArtPoint.put(u, true);
    }

    public List<Integer> getArtPoint() {

        HashMap<Integer, Boolean> visited = new HashMap<>();
        HashMap<Integer, Integer> disc = new HashMap<>();
        HashMap<Integer, Integer> low = new HashMap<>();
        HashMap<Integer, Boolean> isArtPoint = new HashMap<>();

        for (Integer key : adjList.keySet()) {
            visited.put(key, false);
            disc.put(key, 0);
            low.put(key, 0);
            isArtPoint.put(key, false);
        }
        int parent = -1;

        for (Integer u : adjList.keySet()) {
            if (visited.get(u) == false) {
                apUtil(u, visited, low, disc , parent, isArtPoint);
            }
        }

        List<Integer> artPoints = new ArrayList<>();
        for (Integer u : adjList.keySet()) {
            if(isArtPoint.get(u) == true)
                artPoints.add(u);
        }
        return artPoints;
    }

}
