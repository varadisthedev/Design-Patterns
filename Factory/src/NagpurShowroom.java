public class NagpurShowroom extends VehicleShowroom {

    @Override
    protected Vehicle createVehicle(String vehicleType) {
        switch (vehicleType) {
            case "Sedan": return new Sedan();
            case "Hatchback": return new Hatchback();
            case "Electric Car": return new ElectricCar();
            default: throw new IllegalArgumentException(
                    vehicleType + " is not offered at the Nagpur showroom");
        }
    }

    @Override
    protected String getRtoCode() {
        return "MH31"; // Nagpur RTO
    }
}
