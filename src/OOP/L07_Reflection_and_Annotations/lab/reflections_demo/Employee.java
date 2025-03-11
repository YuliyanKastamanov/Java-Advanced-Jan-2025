package reflections_demo;

@Company(name = "SoftUni")
public class Employee extends Person implements Worker {

    private String name;
    private String address;
    protected String email;
    public String mobilePhone;

    private Employee() {
    }

    public Employee(String name, String address) {
        this.name = name;
        this.address = address;
    }

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getAddress() {
//        return address;
//    }
//
//    public void setAddress(String address) {
//        this.address = address;
//    }

    private void doSomething(String text){
        System.out.println("Do something   " + text);
    }

    private static void doSomethingStatic(){
        System.out.println("I am a static method!");
    }

    @Override
    public String toString() {
        return "Employee{" +
               "name='" + name + '\'' +
               ", address='" + address + '\'' +
               '}';
    }
}
