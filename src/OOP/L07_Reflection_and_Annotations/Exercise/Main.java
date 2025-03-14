package OOP.L07_Reflection_and_Annotations.Exercise;

import java.lang.reflect.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws NoSuchFieldException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {


        //достъп до класа
        Class animalClass = Animal.class;

        System.out.println(animalClass.getSimpleName());

        //достъп до конструкторите
        Constructor[] constructors = animalClass.getConstructors();

        //достъп до конструктор, който приема като оргументи String и int
        Constructor<Animal> constructor = animalClass.getConstructor(String.class, int.class);

        Animal rex = new Animal("Rex", 10);

        Animal rey = constructor.newInstance("Rey", 5);

        //достъп до полетата
        Field[] fields = animalClass.getFields();//връща резултат всички публични полета
        Field[] allFields = animalClass.getDeclaredFields();//връща резултат всички полета
        Field nameField = animalClass.getDeclaredField("name");// връща поле с име name
        nameField.setAccessible(true);
        System.out.println(nameField.get(rey));



        //достъп до методите
        Method[] allMethods = animalClass.getDeclaredMethods();
        Arrays.stream(allMethods).forEach(method -> {
            System.out.println(nameField);
        });
        Method[] publicMethods = animalClass.getMethods();

        Method getNameMethod = animalClass.getDeclaredMethod("getName");
        getNameMethod.setAccessible(true);
        System.out.println(getNameMethod.invoke(rey));
        System.out.println(getNameMethod.invoke(rex));

        //всеки access modifier -> mask
       /* int mask = nameField.getModifiers();
        System.out.println(mask);
        System.out.println(Modifier.toString(mask));*/
        System.out.println(Modifier.toString(getNameMethod.getModifiers()));

        Field ageField = animalClass.getDeclaredField("age");// връща поле с име age
        System.out.println(Modifier.toString(ageField.getModifiers()));



        for (Field field: fields){
            field.setAccessible(true);
            System.out.println(Modifier.toString(field.getModifiers()));
        }

        //animalClass.getField("yuli");








    }
}
