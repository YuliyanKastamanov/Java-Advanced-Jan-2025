package facade;

public class Computer {

    private Cpu cpu;
    private Memory memory;
    private Storage storage;

    public Computer(Cpu cpu, Memory memory, Storage storage) {
        this.cpu = cpu;
        this.memory = memory;
        this.storage = storage;
    }

    public void start() {
        this.cpu.freeze();
        this.memory.load();
        this.storage.read();
    }
}
