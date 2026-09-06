// Object is created only when getInstance() is called

class Singleton {
    private static Singleton obj; // object exist

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (obj == null)
            obj = new Singleton();
        return obj;
    }

    void show() {
        System.out.println("Singleton Object");
    }
}

public class LazySingletonDemo {
    public static void main(String[] args) {
        Singleton s = Singleton.getInstance();
        // Singleton s1 = new Singleton(); // This will give error as constructor is private
        s.show();
    }
}