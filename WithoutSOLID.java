class Notification {
    void send(String type, String message) {
        if (type.equals("email")) {
            System.out.println("Sending Email: " + message);
        }
        else if (type.equals("sms")) {
            System.out.println("Sending SMS: " + message);
        }
    }
}

public class WithoutSOLID {
    public static void main(String[] args) {
        Notification n = new Notification();

        n.send("email", "Hello Varad");
        n.send("sms", "Hello Varad");
    }
}