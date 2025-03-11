package reflections_demo;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Demo {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {

        Employee employee = new Employee("Kaloyan", "Sofia");

        //access class
        Class<Employee> employeeClass1 = Employee.class;
        Class<Employee> employeeClass2 = (Class<Employee>) Class.forName("reflections_demo.Employee");
        Class<? extends Employee> employeeClass3 = employee.getClass();

        // get parent class
        Class<? super Employee> superclass = employeeClass1.getSuperclass();

        // get interface
        Class<?>[] interfaces = employeeClass1.getInterfaces();

        System.out.println();

        //        System.out.println(employeeClass1.getName());
        //        System.out.println(employeeClass1.getSimpleName());

        // access fields
        // return all fields(private, protected, public)
        Field[] declaredFields = employeeClass1.getDeclaredFields();
        // return only public fields
        Field[] publicFieldsOnly = employeeClass1.getFields();

        //return specified  public field, if can not find it throws exception
        Field emailField = employeeClass1.getField("mobilePhone");

        //        System.out.println(emailField.getName());

        //        for (Field field : declaredFields) {
        //            System.out.println(field.getName());
        //            System.out.println(field.getType());
        //            System.out.println(Modifier.toString(field.getModifiers()));
        //            System.out.println(Modifier.isPrivate(field.getModifiers()));
        System.out.println();
        //        }

        // access constructors
        Constructor<Employee> allArgConstructor = employeeClass1.getDeclaredConstructor(String.class, String.class);

        Constructor<Employee> noArgConstructor = employeeClass1.getDeclaredConstructor();

        // access only public constructor
        Constructor<Employee> constructor = employeeClass1.getConstructor(String.class, String.class);
        Constructor<?>[] allPublicConstructors = employeeClass1.getConstructors();

        //        System.out.println(constructor.getParameterCount());
        Class<?>[] parameterTypes = constructor.getParameterTypes();
        for (Class<?> parameterType : parameterTypes) {
            //            System.out.println(parameterType);
        }

        //create instance of a class using reflections
        Employee peter = allArgConstructor.newInstance("Peter", "Plovdiv");

        System.out.println(peter);
        System.out.println();
        Field fieldName = declaredFields[0];
        Field fieldAddress = declaredFields[1];

        fieldName.setAccessible(true);
        fieldName.set(peter, "Kaloyan");

        fieldAddress.setAccessible(true);
        fieldAddress.set(peter, "Suhindol");

        System.out.println(peter);

        noArgConstructor.setAccessible(true);
        Employee noNameEmployee = noArgConstructor.newInstance();

        //returns all methods (private, protected and public)
        Method[] allMethods = employeeClass1.getDeclaredMethods();
        //returns only public methods and also all inherited public methods
        Method[] publicMethods = employeeClass1.getMethods();

        Method doSomethingStatic = employeeClass1.getDeclaredMethod("doSomethingStatic");
        doSomethingStatic.setAccessible(true);
        doSomethingStatic.invoke(null);

        Method doSomething = employeeClass1.getDeclaredMethod("doSomething", String.class);
        doSomething.setAccessible(true);
        doSomething.invoke(peter,"SomeText");

        int modifiers = doSomethingStatic.getModifiers();
        System.out.println(Modifier.toString(modifiers));
        System.out.println(Modifier.isProtected(modifiers));
        System.out.println(Modifier.isPrivate(modifiers));
        System.out.println(Modifier.isPublic(modifiers));
        System.out.println(Modifier.isStatic(modifiers));

        System.out.println();
    }
}
