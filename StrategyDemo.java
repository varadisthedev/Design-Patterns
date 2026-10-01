// Abstraction for load water strategy
interface LoadWaterStrategy {
    void loadWater();

}

class AutoMaticLoadWater implements LoadWaterStrategy {
    @Override
    public void loadWater() {
        System.out.println("Automatic water loading...");
    }
}

class ManualLoadWater implements LoadWaterStrategy {
    @Override
    public void loadWater() {
        System.out.println("Manual water loading...");
    }
}

class SensorBasedLoadWater implements LoadWaterStrategy {
    @Override
    public void loadWater() {
        System.out.println("Sensor based water loading...");
    }
}

// washing machine class
class WashingMachine {
    private LoadWaterStrategy loadWaterStrategy;

    public WashingMachine(LoadWaterStrategy loadWaterStrategy) {
        this.loadWaterStrategy = loadWaterStrategy;
    }

    public void setLoadWaterStrategy(LoadWaterStrategy loadWaterStrategy) {
        this.loadWaterStrategy = loadWaterStrategy;
    }

    public void wash() {
        System.out.println("Washing clothes...");
        loadWaterStrategy.loadWater();
        System.out.println("Washing completed.");
    }

    public void dry() {
        System.out.println("Drying clothes...");
        System.out.println("Drying completed.");
    }

    public void switchOn() {
        System.out.println("Washing machine switched on.");
    }

    public void switchOff() {
        System.out.println("Washing machine switched off.");
    }

    public void setTemperature(int temperature) {
        System.out.println("Setting temperature to " + temperature + " degrees.");
    }

    public void washClothes(int temperature) {
        switchOn();
        setTemperature(temperature);
        wash();
        dry();
        switchOff();
    }
}

// main class
public class StrategyDemo {
    public static void main(String[] args) {
        WashingMachine washingMachine = new WashingMachine(new AutoMaticLoadWater());
        washingMachine.washClothes(30);

        System.out.println();

        washingMachine.setLoadWaterStrategy(new ManualLoadWater());
        washingMachine.washClothes(40);

        System.out.println();

        washingMachine.setLoadWaterStrategy(new SensorBasedLoadWater());
        washingMachine.washClothes(50);
    }
}