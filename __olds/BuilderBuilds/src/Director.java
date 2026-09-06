public class Director {
    PersonBuilder pb ;
    public void createPatient(PersonBuilder pb){
        pb.setName("devansh");
        pb.setBloodPressure(123);
        pb.setHeartRate(12);
        pb.getPerson();

    }
    public void createStudent(PersonBuilder pb){
        pb.setName("chomu");
        pb.setCgpa(3.4);
        pb.setHscMarks(75);
        pb.setSscMarks(55);
        pb.getPerson();

    }
}
