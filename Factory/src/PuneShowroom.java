public class PuneShowroom extends VehicleShowroom {

    @Override
    protected Vehicle createVehicle(String vehicleType) {
        switch (vehicleType) {
            case "SUV": return new SUV();
            case "Pickup Truck": return new PickupTruck();
            case "Tractor": return new Tractor();
            default: throw new IllegalArgumentException(
                    vehicleType + " is not offered at the Pune showroom");
        }
    }

    @Override
    protected String getRtoCode() {
        return "MH12"; // Pune RTO code
    }
}
