// Abstract Factory creates related objects

interface Button {
    void click();
}

interface Checkbox {
    void check();
}

class WindowsButton implements Button {
    public void click() {
        System.out.println("Windows Button");
    }
}

class WindowsCheckbox implements Checkbox {
    public void check() {
        System.out.println("Windows Checkbox");
    }
}

interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}

class WindowsFactory implements GUIFactory {
    public Button createButton() {
        return new WindowsButton();
    }

    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}

public class AbstractFactoryDemo {
    public static void main(String[] args) {
        GUIFactory factory = new WindowsFactory();

        factory.createButton().click();
        factory.createCheckbox().check();
    }
}