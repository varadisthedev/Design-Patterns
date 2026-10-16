import java.util.ArrayList;
import java.util.List;

interface Mediator {
    void sendMessage(String message, User sender);
}

interface Colleague {
    void receiveMessage(String message);
}

class WhatsAppGroup implements Mediator {
    private List<User> users = new ArrayList<>();

    public void addUser(User user) {
        users.add(user);
    }

    public void sendMessage(String message, User sender) {
        for (User user : users) {
            if (user != sender) {
                user.receiveMessage(message);
            }
        }
    }
}

class User implements Colleague {
    private String name;
    private Mediator mediator;

    User(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    public void sendMessage(String message) {
        System.out.println(name + ": " + message);
        mediator.sendMessage(message, this);
    }

    public void receiveMessage(String message) {
        System.out.println(name + " received: " + message);
    }
}

public class MediatorDemo {
    public static void main(String[] args) {
        WhatsAppGroup group = new WhatsAppGroup();

        User a = new User("Varad", group);
        User b = new User("Rahul", group);
        User c = new User("Amit", group);

        group.addUser(a);
        group.addUser(b);
        group.addUser(c);

        a.sendMessage("Hello everyone!");
    }
}