// Facade provides a simple interface to a complex system

class CPU {
    void start() {
        System.out.println("CPU started");
    }
}

class Memory {
    void load() {
        System.out.println("Memory loaded");
    }
}

class ComputerFacade {
    CPU cpu = new CPU();
    Memory memory = new Memory();

    void startComputer() {
        cpu.start();
        memory.load();
    }
}

public class FacadeDemo {
    public static void main(String[] args) {
        ComputerFacade computer = new ComputerFacade();

        computer.startComputer();
    }
}