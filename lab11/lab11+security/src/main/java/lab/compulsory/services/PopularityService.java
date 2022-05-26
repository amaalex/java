package lab.compulsory.services;

import lab.compulsory.model.Friends;
import lab.compulsory.model.User;
import lab.compulsory.repository.FriendsRepository;
import lab.compulsory.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PopularityService {

    private UserRepository userRepository;
    private FriendsRepository friendsRepository;

    @Autowired
    public PopularityService(UserRepository userRepository, FriendsRepository friendsRepository) {
        this.userRepository = userRepository;
        this.friendsRepository = friendsRepository;
    }

    public List<User> getCelebrities(int k){
        List<User> users = userRepository.findAll();
        List<Integer> friendsNumber = new ArrayList<>();
        for (User user : users) {
            List<Friends> friendsRelationship1 = friendsRepository.findUserByFriendId1(user.getId());
            List<Friends> friendsRelationship2 = friendsRepository.findUserByFriendId2(user.getId());
            int count = friendsRelationship1.size() + friendsRelationship2.size();
            friendsNumber.add(count);
        }
        /*sorting after the number of friends*/
        for (int i = 0; i < friendsNumber.size() - 1; i++) {
            for (int j = i + 1; j < friendsNumber.size(); j++) {
                if (friendsNumber.get(i) < friendsNumber.get(j)) {
                    int aux = friendsNumber.get(i);
                    friendsNumber.set(i, friendsNumber.get(j));
                    friendsNumber.set(j, aux);

                    User auxUser = users.get(i);
                    users.set(i, users.get(j));
                    users.set(j, auxUser);
                }
            }
        }
        users = users.stream().limit(k).toList();
        return users;
    }
}
