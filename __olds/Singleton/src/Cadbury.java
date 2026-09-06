
public class Cadbury {
    Cadbury(){
        ChocolateBoiler dmilk = ChocolateBoiler.getInstance();
        System.out.println("daily milk here");
        dmilk.fill();
        dmilk.boil();
        dmilk.empty();
    }

}
