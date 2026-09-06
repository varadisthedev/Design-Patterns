// builder is a helper class. it will help in creation of Person class
public class PersonBuilder {
    String name;
    String lastname;
    int age;
    int bloodPressure;
    int heartRate;
    int sscMarks;
    int hscMarks;
    double cgpa;
    int heightCM;

    // initialized setter
    public void setName(String name) {
        this.name = name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBloodPressure(int bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
    }

    public void setSscMarks(int sscMarks) {
        this.sscMarks = sscMarks;
    }

    public void setHscMarks(int hscMarks) {
        this.hscMarks = hscMarks;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    public void setHeightCM(int heightCM) {
        this.heightCM = heightCM;
    }
    // initialized getters

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public int getAge() {
        return age;
    }

    public int getBloodPressure() {
        return bloodPressure;
    }

    public int getHeartRate() {
        return heartRate;
    }

    public int getSscMarks() {
        return sscMarks;
    }

    public int getHscMarks() {
        return hscMarks;
    }

    public double getCgpa() {
        return cgpa;
    }

    public int getHeightCM() {
        return heightCM;
    }

    //
    Person getPerson(){
        return new Person(this); // eqv of: Person p = new Person();
        // this
    }
}
