package com.example.socialnetworking.moldel;

import java.util.List;

public class Timeline {
    private int id;
    private User owner;
    private List<Post> posts;

    public void setId (int id){
        this.id = id;
    }
    public int getId (){
        return this.id;
    }

    public void setOwner(User owner){
        this.owner = owner;
    }
    public User getOwner(){
        return this.owner;
    }

    public void setPosts(List<Post> posts){
        this.posts = posts;
    }
    public List<Post> getPosts(){
        return this.posts;
    }
}
