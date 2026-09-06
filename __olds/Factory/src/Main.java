public class Main {
    public static void main(String[] args) {

        System.out.println("#####Nagpur Showroom: ");
        VehicleShowroom nagpur = new NagpurShowroom();
        Vehicle v1 = nagpur.deliverVehicle("Sedan");
        v1.showDetails();

        Vehicle v2 = nagpur.deliverVehicle("Electric Car");
        v2.showDetails();

        System.out.println("\n#####Pune Showroom: ");
        VehicleShowroom pune = new PuneShowroom();
        Vehicle v3 = pune.deliverVehicle("Tractor");
        v3.showDetails();

        Vehicle v4 = pune.deliverVehicle("SUV");
        v4.showDetails();
    }
}
