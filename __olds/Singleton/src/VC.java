public class VC {
    String org;

    private VC(){
    }
    void givePermission(){
        if (org.equals("GFG")) {
            System.out.println("permission rejected");
        }
        System.out.println("permission granted");
    }
    void giveIncentives(){
        System.out.println("incentives added");
    }
}
