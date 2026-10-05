
abstract class Employee {
    // Template Method

    public final void onboardingProcess() {

        getDocuments();

        giveJoiningKit();

        sendWelcomeEmail();

        trainingSession();
    }

    // Common steps
    protected void getDocuments() {
        System.out.println("HR: Collecting employee documents...");
    }

    protected void giveJoiningKit() {
        System.out.println("HR: Giving joining kit...");
    }

    protected void sendWelcomeEmail() {
        System.out.println("HR: Sending welcome email...");
    }

    // Different for different types of employees
    protected abstract void trainingSession();
}


// Full-time employee
class FullTimeEmployee extends Employee {

    @Override
    protected void trainingSession() {
        System.out.println(
            "HR: Conducting 1-month training session for full-time employee."
        );
    }
}


// Intern
class Intern extends Employee {

    @Override
    protected void trainingSession() {
        System.out.println(
            "HR: Conducting 2-day training session for intern."
        );
    }
}


class HR {

    public void onboardEmployee(Employee employee) {

        System.out.println("\nStarting employee onboarding...");
        employee.onboardingProcess();
        System.out.println("Employee onboarding completed.");
    }
}


// Main class
public class TemplateMehodDemoHremployee {

    public static void main(String[] args) {

        HR hr = new HR();

        // Full-time employee
        Employee fullTimeEmployee = new FullTimeEmployee();

        System.out.println("===== FULL-TIME EMPLOYEE =====");
        hr.onboardEmployee(fullTimeEmployee);


        // Intern
        Employee intern = new Intern();

        System.out.println("\n===== INTERN =====");
        hr.onboardEmployee(intern);
    }
}