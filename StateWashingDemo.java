public class StateWashingDemo {

    interface State {
        void start();
        void pause();
        void stop();
    }

    static class WashingMachine {
        private State state;

        WashingMachine() {
            setState(new IdleState(this));
        }

        void setState(State state) {
            this.state = state;
        }

        void start() {
            state.start();
        }

        void pause() {
            state.pause();
        }

        void stop() {
            state.stop();
        }
    }

    static class IdleState implements State {
        private final WashingMachine machine;

        IdleState(WashingMachine machine) {
            this.machine = machine;
        }

        public void start() {
            System.out.println("Washing started.");
            machine.setState(new WashingState(machine));
        }

        public void pause() {
            System.out.println("Machine is idle.");
        }

        public void stop() {
            System.out.println("Machine is already stopped.");
        }
    }

    static class WashingState implements State {
        private final WashingMachine machine;

        WashingState(WashingMachine machine) {
            this.machine = machine;
        }

        public void start() {
            System.out.println("Washing is already in progress.");
        }

        public void pause() {
            System.out.println("Washing paused.");
            machine.setState(new PausedState(machine));
        }

        public void stop() {
            System.out.println("Washing stopped.");
            machine.setState(new IdleState(machine));
        }
    }

    static class PausedState implements State {
        private final WashingMachine machine;

        PausedState(WashingMachine machine) {
            this.machine = machine;
        }

        public void start() {
            System.out.println("Washing resumed.");
            machine.setState(new WashingState(machine));
        }

        public void pause() {
            System.out.println("Machine is already paused.");
        }

        public void stop() {
            System.out.println("Washing cancelled.");
            machine.setState(new IdleState(machine));
        }
    }

    public static void main(String[] args) {
        WashingMachine machine = new WashingMachine();

        machine.start();
        machine.pause();
        machine.start();
        machine.stop();
        machine.stop();
    }
}
