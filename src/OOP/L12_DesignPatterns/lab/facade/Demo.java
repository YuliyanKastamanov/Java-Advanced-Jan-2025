package facade;

public class Demo {

    public static void main(String[] args) {
        Cpu cpu = new CpuImpl();
        Memory memory = new MemoryImpl();
        Storage storage = new StorageImpl();

        Computer computer = new Computer(cpu, memory, storage);

        computer.start();
    }
}
