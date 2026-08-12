// product
public class Person {
    String name;
    String lastname;
    int age;
    int bloodPressure;
    int heartRate;
    int sscMarks;
    int hscMarks;
    double cgpa;
    int heightCM;

    public Person(PersonBuilder pb) {
        this.name = pb.getName();
        this.lastname = pb.getLastname();
        this.age = pb.getAge();
        this.bloodPressure = pb.getBloodPressure();
        this.heartRate = pb.getHeartRate();
        this.heightCM = pb.getHeightCM();
        this.hscMarks = pb.getHscMarks();
        this.sscMarks = pb.getSscMarks();
        this.cgpa = pb.getCgpa();
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                ", bloodPressure=" + bloodPressure +
                ", heartRate=" + heartRate +
                ", sscMarks=" + sscMarks +
                ", hscMarks=" + hscMarks +
                ", cgpa=" + cgpa +
                ", heightCM=" + heightCM +
                '}';
    }
}
