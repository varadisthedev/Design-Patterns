public class StateDemo {

    // State
    interface State {
        void insertCoin();
        void turnCrank();
    }

    // Context
    static class GumballMachine {
        private int gumballs;
        private State state;

        GumballMachine(int gumballs) {
            this.gumballs = gumballs;
            state = gumballs > 0
                    ? new NoCoinState(this)
                    : new OutOfGumballsState(this);
        }

        void setState(State state) {
            this.state = state;
        }

        void insertCoin() {
            state.insertCoin();
        }

        void turnCrank() {
            state.turnCrank();
        }

        void dispense() {
            if (gumballs > 0) {
                gumballs--;
                System.out.println("Gumball dispensed.");
            }

            if (gumballs == 0)
                setState(new OutOfGumballsState(this));
            else
                setState(new NoCoinState(this));
        }

        int getNumberOfGumballs() {
            return gumballs;
        }
    }

    // Concrete State
    static class NoCoinState implements State {
        private final GumballMachine machine;

        NoCoinState(GumballMachine machine) {
            this.machine = machine;
        }

        public void insertCoin() {
            System.out.println("Coin inserted.");
            machine.setState(new HasCoinState(machine));
        }

        public void turnCrank() {
            System.out.println("Insert a coin first.");
        }
    }

    static class HasCoinState implements State {
        private final GumballMachine machine;

        HasCoinState(GumballMachine machine) {
            this.machine = machine;
        }

        public void insertCoin() {
            System.out.println("Coin already inserted.");
        }

        public void turnCrank() {
            System.out.println("Crank turned.");
            machine.dispense();
        }
    }

    static class OutOfGumballsState implements State {
        private final GumballMachine machine;

        OutOfGumballsState(GumballMachine machine) {
            this.machine = machine;
        }

        public void insertCoin() {
            System.out.println("Machine is out of gumballs.");
        }

        public void turnCrank() {
            System.out.println("Machine is out of gumballs.");
        }
    }

    // Main
    public static void main(String[] args) {
        GumballMachine machine = new GumballMachine(2);

        System.out.println("Gumballs: " + machine.getNumberOfGumballs());

        machine.insertCoin();
        machine.turnCrank();

        System.out.println("Gumballs: " + machine.getNumberOfGumballs());

        machine.insertCoin();
        machine.turnCrank();

        System.out.println("Gumballs: " + machine.getNumberOfGumballs());

        machine.insertCoin();
        machine.turnCrank();
    }
}