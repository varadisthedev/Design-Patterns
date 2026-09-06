// Object is created when class is loaded

class Singleton {
    private static Singleton obj = new Singleton();

    private Singleton() {
    }

    public static Singleton getInstance() {
        return obj;
    }

    void show() {
        System.out.println("Singleton Object");
    }
}

public class EagerSingletonDemo {
    public static void main(String[] args) {
        Singleton s = Singleton.getInstance();
        s.show();
        Singleton s2 = Singleton.getInstance();
        s2.show();
        System.out.println(s.equals(s2)); // true

    }
}