package com.example.onlyairmensearchserver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping("/")
public class Controller {

    private final UserRepository userRepo;
    private final LocationRepository locationRepo;
    private final HobbyRepository hobbyRepo;
    private final UserHobbyRepository userHobbyRepo;

    public Controller(
            UserRepository userRepo,
            LocationRepository locationRepo,
            HobbyRepository hobbyRepo,
            UserHobbyRepository userHobbyRepo) {
        this.userRepo = userRepo;
        this.locationRepo = locationRepo;
        this.hobbyRepo = hobbyRepo;
        this.userHobbyRepo = userHobbyRepo;
    }

    @CrossOrigin
    @GetMapping("/users")
    public Iterable<User> allUsers() {
        return this.userRepo.findAll();
    }

    @CrossOrigin
    @GetMapping("/locations")
    public Iterable<Location> allLocations() {
        return this.locationRepo.findAll();
    }

    @CrossOrigin
    @GetMapping("/hobbies")
    public Iterable<Hobby> allHobbies() {
        return this.hobbyRepo.findAll();
    }

    @CrossOrigin
    @GetMapping("/user-hobbies")
    public Iterable<UserHobby> allUserHobbies() {
        return this.userHobbyRepo.findAll();
    }
}
