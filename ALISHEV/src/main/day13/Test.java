package main.day13;

public class Test {
    public static void main(String[] args) {
        User user1 = new User("Ivan");
        User user2 = new User("Vano");
        User user3 = new User("Kayl");
        user1.subscribe(user2);
        System.out.println(user1.isSubscribed(user2));
        System.out.println(user2.isSubscribed(user1));
        user2.subscribe(user1);
        System.out.println(user2.isSubscribed(user1));
        System.out.println(user1.isSubscribed(user2));
        System.out.println(user1.isFriend(user2));
        System.out.println(user2.isFriend(user1));

        user1.sendMessage(user2, "Hi");
        user1.sendMessage(user2, "I am Ivan");
        user2.sendMessage(user1, "Hallo");
        user2.sendMessage(user1, "I am Vano");
        user2.sendMessage(user1, "I am 30 years old ;)");
        user3.sendMessage(user1, "Hello");
        user3.sendMessage(user1, "I am Kayl");
        user3.sendMessage(user1, "I am 24 years old");
        user1.sendMessage(user3, "Oh hello");
        user1.sendMessage(user3, "I am Ivan and I am 18 years old");
        user1.sendMessage(user3, "You look like one of my friends");
        user3.sendMessage(user1, "Oh, it's cool i think... maybe");

        System.out.println("User1 and User2");

        MessageDatabase.showDialog(user1, user2);

        System.out.println("user1 and user3");

        MessageDatabase.showDialog(user1, user3);

        System.out.println("user2 and user3");

        MessageDatabase.showDialog(user2, user3);
    }
}
