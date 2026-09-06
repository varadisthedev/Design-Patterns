public class Main {
    static void main() {

        // single design pattern says
        //"Nobody outside this class should be allowed to create a ChocolateBoiler directly."
//        ChocolateBoiler c = new ChocolateBoiler();
        ChocolateBoiler c = ChocolateBoiler.getInstance();
        c.fill();
        c.boil();
        c.boil();
        c.empty();

        System.out.println("###########");
        c.boil();
        c.empty();


        System.out.println("###########");
        c.empty();
        c.fill();
        c.boil();

        Cadbury cad = new Cadbury();
    }
}
