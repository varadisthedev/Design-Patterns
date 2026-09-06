public class Overloading {
    // method overloading
    // more than one method
    // return type doesnt matter
    //  same method name , different parameters
    int resultCalculate(int marksA, int marksB){
        return marksA + marksB * 100;
        // operator precidence ignored
    }
    double resultCalculate(double marksA, double marksB){
        return marksA + marksB * 100;
    }
    boolean resultCalculate(int marksA, int marksB , int marksC){
        return (marksA + marksB + marksC * 100) >1000;
    }
    String name;
    int age;
    // constuctor over loading
    Overloading(){
        this.name="varad";
        // age will be 0

    }
    Overloading(String name){
        this.name=name;
    }
    Overloading(String name, int age){
        this.name=name;
        this.age=age;
    }
}
