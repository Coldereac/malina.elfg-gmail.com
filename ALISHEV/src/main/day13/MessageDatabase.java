package main.day13;

import java.util.ArrayList;
import java.util.List;

public class MessageDatabase {
    private static List<Message> messages = new ArrayList<>();

    public static void sendMessage(User sender, User receiver, String text){
        messages.add(new Message(sender, receiver, text));
    }

    public static List<Message> getMessages(){
        return messages;
    }

    public static void showDialog(User user1, User user2){
        for (Message x: messages){
            if ((x.getReceiver().equals(user1) || x.getReceiver().equals(user2)) && (x.getSender().equals(user1) || x.getSender().equals(user2))){
                System.out.println(x.getSender() + ": " + x.getText());
            }
        }
    }
}
