package com.example.socialnetworking.moldel;


//@Entity
public class Post {
    
    //@Id
    private int id;
    private String message;
    private User poster;

    public void setId (int id){
        this.id = id;
    }
    public int getId (){
        return this.id;
    }

    public void setMessage(String message){
        this.message = message;
    }
    public String getMessage(){
        return this.message;
    }

    public void setPoster (User poster){
        this.poster=poster;
    }
    public User getPoster(){
        return this.poster;
    }
}
