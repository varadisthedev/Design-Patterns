// Adapter makes incompatible interfaces work together

interface Charger {
    void charge();
}

class OldCharger {
    void oldCharge() {
        System.out.println("Charging...");
    }
}

class Adapter implements Charger {
    OldCharger charger = new OldCharger();

    public void charge() {
        charger.oldCharge();
    }
}

public class AdapterDemo {
    public static void main(String[] args) {
        Charger charger = new Adapter();

        charger.charge();
    }
}