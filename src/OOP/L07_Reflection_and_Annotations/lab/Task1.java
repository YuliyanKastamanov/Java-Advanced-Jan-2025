import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Task1 {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        Class<Reflection> reflectionClass = (Class<Reflection>) Class.forName("Reflection");

        // This class type
        System.out.println(reflectionClass.getSimpleName());

        //Super class type
        System.out.println(reflectionClass.getSuperclass().getSimpleName());

        //All Interfaces
        Class<?>[] interfaces = reflectionClass.getInterfaces();
        for (Class<?> anInterface : interfaces) {
            System.out.println(anInterface.getSimpleName());
        }

        //Instantiate object using reflectionClass and print it
        Constructor<Reflection> declaredConstructor = reflectionClass.getDeclaredConstructor();
        Reflection reflection = declaredConstructor.newInstance();
        System.out.println(reflection);
    }
}
