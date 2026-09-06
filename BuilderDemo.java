// Builder creates an object step-by-step

class User {
    String name;
    int age;

    private User(Builder b) {
        name = b.name;
        age = b.age;
    }

    static class Builder {
        String name;
        int age;

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