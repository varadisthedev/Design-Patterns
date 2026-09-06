public class HeartRates {
    String firstname;
    String lastname;
    int birthDay;
    int birthMonth;
    int birthYear;

    // Today's date fixed
    int currentDay = 16;
    int currentMonth = 7;
    int currentYear = 2026;

    HeartRates(String firstname, String lastname, int birthDay, int birthMonth, int birthYear) {
        setFirstname(firstname);
        setLastname(lastname);
        setBirthDay(birthDay);
        setBirthMonth(birthMonth);
        setBirthYear(birthYear);
    }

    // basic getter and setters
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public void setBirthDay(int birthDay) {
        this.birthDay = birthDay;
    }
    public void setBirthMonth(int birthMonth) {
        this.birthMonth = birthMonth;
    }
    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public String getFirstname() {
        return firstname;
    }
    public String getLastname() {
        return lastname;
    }
    public int getBirthDay() {
        return birthDay;
    }
    public int getBirthMonth() {
        return birthMonth;
    }
    public int getBirthYear() {
        return birthYear;
    }

    public int calculateAge() {
        int age = currentYear - birthYear;

        // Subtract 1 if birthday hasn't happened yet
        if (currentMonth < birthMonth || (currentMonth == birthMonth && currentDay < birthDay)) {
            age--;
        }
        return age;
    }

    public int getMaxHeartRate() {
        return 220 - calculateAge();
    }

    public String targetHeartRate() {
        int MHR = getMaxHeartRate();
        int range1 = (50 * MHR) / 100;
        int range2 = (85 * MHR) / 100;
        return range1 + "-" + range2;
    }
}