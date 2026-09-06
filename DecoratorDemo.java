// Decorator adds functionality to an existing object

interface Coffee {
    void cost();
}

class SimpleCoffee implements Coffee {
    public void cost() {
        System.out.println("Coffee = 50");
    }
}

class MilkDecorator implements Coffee {
    Coffee coffee;

    MilkDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    public void cost() {
        coffee.cost();
        System.out.println("+ Milk = 10");
    }
}

public class DecoratorDemo {
    public static void main(String[] args) {
        Coffee coffee = new MilkDecorator(new SimpleCoffee());
        coffee.cost();
    }
}