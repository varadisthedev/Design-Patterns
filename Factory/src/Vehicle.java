// The common "product" every showroom deals with.
public abstract class Vehicle {
    protected String brand;
    protected String model;
    protected String type;
    protected String registrationNumber;

    public Vehicle(String brand, String model, String type) {
        this.brand = brand;
        this.model = model;
        this.type = type;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getType() {
        return type;
    }

    public void showDetails() {
        System.out.println(type + ": " + brand + " " + model + " | Reg No: " + registrationNumber);
    }
}
