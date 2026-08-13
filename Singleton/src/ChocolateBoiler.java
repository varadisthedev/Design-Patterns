
public class ChocolateBoiler {
    boolean isEmpty;
    boolean isBoiled;
    private static ChocolateBoiler instance;
    // instance is nothing but the object


    private ChocolateBoiler() {
        isEmpty=true;
        isBoiled=false;
    }
    public static ChocolateBoiler getInstance() {
        if (instance == null) {
            instance = new ChocolateBoiler();
        }

        return instance;
    }

    // nomal methods below
    void fill(){
        if(isEmpty){
            System.out.println("filling the choclate boiler with dark chocolate, yum yum ");
            isEmpty=false;
        }
        else{
            System.out.println("idiot it is already filled, what are you doing?");
        }
    }
    void boil(){
        if(!isEmpty&&!isBoiled){
            System.out.println("your chocolate is melted now");
            isBoiled=true;
        }
        else{
            if(isEmpty){
                System.out.println("fill some chocolate first,");

            }
            else{
                System.out.println("looks like it is already boiled!");
            }
        }
    }
    void empty(){
        if(isBoiled&&!isEmpty){
            System.out.println("cleaning the bowl now. you can use it again for smtg ");
            isEmpty=true;
            isBoiled=false;
        }else{
            System.out.println("idiot, boil your chocolate first before empty-ing the bowl");
        }
    }

    void currentState(){
        System.out.println("### is it boiled?  "+ isBoiled + "  is it empty? " +isEmpty);
    }
}
