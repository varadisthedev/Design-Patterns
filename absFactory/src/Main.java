public class Main {
    public static void main(String[] args) {
        FurnitureFactory factory = new WoodenFactory();
        Chair chair = factory.createChair();
        Table table = factory.createTable();
        chair.sitOn();
        table.putOn();

        factory = new SteelFactory();
        chair = factory.createChair();
        table = factory.createTable();
        chair.sitOn();
        table.putOn();
    }
}