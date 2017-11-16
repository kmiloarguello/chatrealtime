package xyz.camiloarguello.chatrealtime.models;

/**
 * Created by Camilo Arguello R on 2017-11-16.
 */

public class User {
    public String uid, email, firebaseToken;

    public User(String uid, String email, String firebaseToken) {
        this.uid = uid;
        this.email = email;
        this.firebaseToken = firebaseToken;
    }
}
