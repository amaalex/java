package lab.compulsory.controller;

import lab.compulsory.model.User;
import lab.compulsory.repository.FriendsRepository;
import lab.compulsory.repository.UserRepository;
import lab.compulsory.services.ArticulationPointService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/artPoints")
public class ArticulationPointsController {

    private UserRepository userRepository;
    private FriendsRepository friendsRepository;
    private ArticulationPointService articulationPointService;

    @Autowired
    public ArticulationPointsController(UserRepository userRepository, FriendsRepository friendsRepository,
                                        ArticulationPointService articulationPointService) {
        this.userRepository = userRepository;
        this.friendsRepository = friendsRepository;
        this.articulationPointService = articulationPointService;
    }

    @GetMapping
    public List<User> getArtPoint() {
        articulationPointService.getNetworkFromDB();
        List<Integer> ids = articulationPointService.getArtPoint();
        List<User> users = new ArrayList<>();
        for (Integer i : ids) {
            users.add(userRepository.findUserById(i));
        }
        return users;
    }
}
