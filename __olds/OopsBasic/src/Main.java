
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main { // also called test class
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
//        System.out.println("Hello and welcome!");
//
//        for (int i = 1; i <= 5; i++) {
//            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
//            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
//            System.out.println("i = " + i);
//        }
//        Person obj=new Person();
//        System.out.println(obj.Study());
//        obj.DisplayUserInfo();
//        obj.WatchReels();
//
//        // testing blood data class
//        BloodData bd= new BloodData();
//        bd.setName("varad");
//        bd.setIsposornegative('+');
//        bd.setRhtype('B');
//
//        System.out.println("name: "+bd.getName()+ ", bloodtype: "+ bd.getRhtype()+bd.getIsposornegative());
//
//        // method overloading
//        Overloading ov = new Overloading();
//        System.out.println(ov.resultCalculate(10,30));
//        System.out.println(ov.resultCalculate(12.4,23.4));
//        System.out.println(ov.resultCalculate(100,23,21));
//

        // making an object
        HeartRates hr = new HeartRates("Sharvari","Hiwarkedkar",2,1,2006);
        System.out.println("Person name is: " + hr.getFirstname());
        System.out.println("Person surname is: " + hr.getLastname());
        System.out.println("Person birthdate is: " + hr.getBirthDay() + '/' + hr.getBirthMonth() + '/' + hr.getBirthYear());
        System.out.println("Person is: " + hr.calculateAge() + " years old");
        System.out.println("Person's max heart rate is: " + hr.getMaxHeartRate());
        System.out.println("Person's target heart rate range is: " + hr.targetHeartRate());

        System.out.println("\n");
        // Book class
        Fiction f = new Fiction("how i met your mother");
        NonFiction nf = new NonFiction("Atomic habits");

        System.out.println("Title: " + f.getTitle() + ", Price: Rs" + f.getPrice());
        System.out.println("Title: " + nf.getTitle() + ", Price: Rs" + nf.getPrice());

        System.out.println("\n");
        CricketTeam cricket = new CricketTeam(
                "RBU",
                "RBU Warriors",
                2500,
                10
        );

        FootballTeam football = new FootballTeam(
                "RBU",
                "RBU Strikers",
                28,
                8
        );


        System.out.println("College: " + cricket.getCollegeName());
        System.out.println("Team: " + cricket.getTeamName());
        System.out.println("Motto: " + cricket.getMotto());
        System.out.println("Average Runs/Match: " + cricket.calculateAverageRunsPerMatch());

        System.out.println();

        System.out.println("College: " + football.getCollegeName());
        System.out.println("Team: " + football.getTeamName());
        System.out.println("Motto: " + football.getMotto());
        System.out.println("Average Goals/Match: " + football.calculateGoalAverage());
    }

}


