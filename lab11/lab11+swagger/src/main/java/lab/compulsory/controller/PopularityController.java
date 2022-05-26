package lab.compulsory.controller;

import lab.compulsory.model.User;
import lab.compulsory.repository.FriendsRepository;
import lab.compulsory.repository.UserRepository;
import lab.compulsory.services.PopularityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/celebrities")
public class PopularityController {

    private UserRepository userRepository;
    private FriendsRepository friendsRepository;
    private PopularityService popularityService;

    @Autowired
    public PopularityController(UserRepository userRepository, FriendsRepository friendsRepository,
                                PopularityService popularityService) {
        this.userRepository = userRepository;
        this.friendsRepository = friendsRepository;
        this.popularityService = popularityService;
    }

    @GetMapping()
    public List<User> getMostKPopularUsers(@RequestParam Integer k){
        return popularityService.getCelebrities(k);
    }
}
