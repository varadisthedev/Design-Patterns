import java.net.SocketOption;

public class Main {
    public static void main(String[] args) {
        // creating using director
        Director d= new Director();
        PersonBuilder myhelper = new PersonBuilder();
        d.createPatient(myhelper);
        Person p=myhelper.getPerson();
        System.out.println(p);

        // now using builder design pattern here
        PersonBuilder helper = new PersonBuilder();
        helper.setName("varad");
        helper.setLastname("raut");
        helper.setAge(20);

        Person p2 = helper.getPerson();
        System.out.println(p2);

        // crating another person
        PersonBuilder helper2 = new PersonBuilder();
        helper2.setName("etasha");
        helper2.setLastname("shannon");
        helper2.setAge(20);

        Person p3 = helper2.getPerson();
        System.out.println(p3);

    }
}