package com.example.socialnetworking.service;

import java.util.ArrayList;
import java.util.List;

import com.example.socialnetworking.moldel.Post;

import org.springframework.stereotype.Service;


@Service
public class TimelineServiceImp implements TimelineService {

    @Override
    public List<Post> getPostsByFollowers() {
        
        // 1. check if user is logged in

        // 2. get user's followers 

        // 3. get all posts from db for all followers

        // 4. retrun the list

        List<Post> posts = new ArrayList<>();

        Post post1 = new Post();
        post1.setMessage("message1");
        posts.add(post1);

        return posts;
    }
    
}
