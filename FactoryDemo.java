// Factory creates objects without exposing object creation logic

interface Shape {
    void draw();
}

class Circle implements Shape {
    public void draw() {
        System.out.println("Circle");
    }
}

class Square implements Shape {
    public void draw() {
        System.out.println("Square");
    }
}

class ShapeFactory {
    static Shape create(String type) {
        if (type.equals("circle"))
            return new Circle();

        return new Square();
    }
}

public class FactoryDemo {
    public static void main(String[] args) {
        Shape s = ShapeFactory.create("circle");
        s.draw();
    }
}