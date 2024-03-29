package main.day13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class User {
    private String username;
    private List<User> subscriptions;

    public String getUsername() {
        return username;
    }

    public List<User> getSubscriptions() {
        return subscriptions;
    }

    public User(String username) {
        this.username = username;
        this.subscriptions = new ArrayList<>();
    }

    public void subscribe(User user){
        subscriptions.add(user);
    }

    public boolean isSubscribed(User user){
        return (subscriptions.contains(user));
    }

    public boolean isFriend(User user){
        return (this.subscriptions.contains(user) && user.isSubscribed(this));
    }

    public void sendMessage(User user, String text){
        MessageDatabase.sendMessage(this, user, text);
    }

    @Override
    public String toString(){
        return this.username;
    }
}
