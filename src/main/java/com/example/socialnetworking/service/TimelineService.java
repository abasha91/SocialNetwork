package com.example.socialnetworking.service;

import java.util.List;

import com.example.socialnetworking.moldel.Post;

public interface TimelineService {
    List<Post> getPostsByFollowers();
}
