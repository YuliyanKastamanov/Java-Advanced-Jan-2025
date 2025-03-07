package OOP.L03_Inheritance.Exercise.demo;

public class Demo {
    public static void main(String[] args) {

        Employee employee = new Employee("Ivan", 2000);

        employee.present();


        Engineer engineer = new Engineer("Yana", 2000, "Level 1");
        engineer.present();
        engineer.prepareProject();

        HR hr = new HR("Nina", 2000, 10);
        hr.checkCV();

        ITSupport itSupport = new ITSupport("Stoyan", 2500, 20);
        itSupport.assignTicket();
        System.out.println();

    }
}
