public abstract class VehicleShowroom {

    private int counter = 1; // used to generate registration number

    public final Vehicle deliverVehicle(String vehicleType) {
        Vehicle vehicle = createVehicle(vehicleType); // factory method
        assembleVehicle(vehicle);
        performQualityInspection(vehicle);
        registerVehicle(vehicle);
        deliverToCustomer(vehicle);
        return vehicle;
    }

    protected abstract Vehicle createVehicle(String vehicleType);

    // Each region has its own RTO code
    protected abstract String getRtoCode();

    private void assembleVehicle(Vehicle vehicle) {
        System.out.println("Assembling " + vehicle.getType() + "...");
    }

    private void performQualityInspection(Vehicle vehicle) {
        System.out.println("Quality inspection passed for " + vehicle.getType());
    }

    private void registerVehicle(Vehicle vehicle) {
        // followign exact rto code , like MH31AB0001
        String regNo = getRtoCode() + "AB" + String.format("%04d", counter++);
        vehicle.setRegistrationNumber(regNo);
        System.out.println("Registered with number: " + regNo);
    }

    private void deliverToCustomer(Vehicle vehicle) {
        System.out.println("Vehicle handed over to customer.\n");
    }
}
