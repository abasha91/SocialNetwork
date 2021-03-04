package com.example.socialnetworking.controller;

import com.example.socialnetworking.service.FollowerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/follow")
public class FollowController {
    
    @Autowired
    FollowerService followerService;

    @RequestMapping(value="/follow/{followerID}")
    public void follow(@PathVariable("followerID") int followerID){
        followerService.addFollower(followerID);
    }

}
