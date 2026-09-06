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
    OldCharger oldchargerobj = new OldCharger();

    public void charge() {
        oldchargerobj.oldCharge();
    }
}

public class AdapterDemo {
    public static void main(String[] args) {
        Charger charger = new Adapter();

        charger.charge();
    }
}