// Builder creates an object step-by-step

class User {
    String name; // no varad
    int age;

    // default constructor
    // parameterized constructor
    private User(Builder b) {
        name = b.name;
        age = b.age;
    }

    static class Builder {
        String name; //varad
        int age; // 20

        Builder setName(String name) {
            this.name = name;
            return this;
        }

        Builder setAge(int age) {
            this.age = age;
            return this;
        }

        User build() {
            return new User(this);
        }
    }

    void show() {
        System.out.println(name + " " + age);
    }
}

public class BuilderDemo {
    public static void main(String[] args) {
        User u = new User.Builder()
                .setName("Varad")
                .setAge(20)
                .build();

        u.show();


    }
}






















class Sharvari{
    Sharvari(){ //default constructor
        System.out.println("Sharvari");
    }
    Sharvari(String name,int age,int rollno,String address, String phone, String email, String college){ //parameterized constructor
        System.out.println(name+" "+age+" "+rollno);
        System.out.println(name);
    }
}

class MainFunction extends Sharvari{
   public static void main(String[] args) {
      Sharvari s = new Sharvari();
      Sharvari s1 = new Sharvari("shar",20,23,"123 Main St","555-1234","shar@example.com","ABC College");
   }
}