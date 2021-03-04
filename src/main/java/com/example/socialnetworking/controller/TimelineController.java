package com.example.socialnetworking.controller;

import java.util.List;

import com.example.socialnetworking.moldel.Post;
import com.example.socialnetworking.service.TimelineService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/timeline")
public class TimelineController {
    
    @Autowired
    TimelineService timelineService;

    @RequestMapping(value = "/getPosts")
    public List<Post> posts(){
        return timelineService.getPostsByFollowers();
    }
}
