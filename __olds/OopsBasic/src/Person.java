public class Person {
    // declaring variables
    String name;
    int age=20;
    double marks;
    int height_in_cm=180;
    double bank_balance=92929192;
    String instagram_handle="_varadraut";
    String address="nagpur,maharashtra";

    Person(){
        this.marks=10;
        this.name="Varad";
    }
    Person(double marks){
        this.marks=marks;
    }

    public void DisplayUserInfo(){
        System.out.println("name: "+name + " age: "+age +" height: "+height_in_cm+" follow me on: @"+instagram_handle);
        System.out.println("i live at: "+address);
    }
    public static String HealthCheck(){
        return "ok";
    }
    public void WatchReels(){
        System.out.println("watching reels form the insta  handle: "+instagram_handle);
    }

    public double Study(){
        System.out.println("Previous marks: "+marks);
        marks=marks+50;
        System.out.println("Updated marks: "+marks);
        return marks;
    }
    // below is a default class
    void GreetingFriends(){
        System.out.println("hello there! how are you?");
    }

    private void BalanceCheck(){
        System.out.println("balance is: "+bank_balance);
    }
}
