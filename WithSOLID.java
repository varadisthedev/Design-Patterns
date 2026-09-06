// S — Single Responsibility	Factory creates objects; Email/SMS send messages
// O — Open/Closed	Add new notification types without changing existing classes
// L — Liskov Substitution	Email/SMS can replace Notification
// I — Interface Segregation	Small Notification interface
// D — Dependency Inversion	Main depends on Notification interface, not Email/SMS

// Interface
interface Notification {
    void send(String message);
}

// Email implementation
class Email implements Notification {
    public void send(String message) {
        System.out.println("Email: " + message);
    }
}

// SMS implementation
class SMS implements Notification {
    public void send(String message) {
        System.out.println("SMS: " + message);
    }
}

// Factory handles object creation
class NotificationFactory {
    static Notification create(String type) {
        if (type.equals("email"))
            return new Email();

        if (type.equals("sms"))
            return new SMS();
        
        return null;
    }
}

public class WithSOLID {
    public static void main(String[] args) {

        Notification n1 = NotificationFactory.create("email");

        Notification n2 = NotificationFactory.create("sms");

        n1.send("Hello Varad");
        n2.send("Hello Varad");
    }
}

// Now if you want WhatsApp, you simply add:

// class WhatsApp implements Notification {
// public void send(String message) {
// System.out.println("WhatsApp: " + message);
// }
// }
