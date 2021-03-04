package com.example.socialnetworking.moldel;

import java.util.List;

public class Follower {
    private int id;
    private User owner;
    private List<User> followers;

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

    public void setFollowers(List<User> followers){
        this.followers = followers;
    }
    public List<User> getFollowers(){
        return this.followers;
    }
}
