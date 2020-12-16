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

    public Controller(
            UserRepository userRepo,
            LocationRepository locationRepo) {
        this.userRepo = userRepo;
        this.locationRepo = locationRepo;
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
}