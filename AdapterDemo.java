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
    private OldCharger oldchargerobj = new OldCharger();

    @Override
    public void charge() {
        oldchargerobj.oldCharge();
    }
}

public class AdapterDemo {
    public static void main(String[] args) {
        Charger charger = new Adapter(); // upcast
        charger.charge();
    }
}