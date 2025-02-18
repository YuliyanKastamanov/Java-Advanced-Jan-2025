package JavaAdvanced.L04_Streams_Files_and_Directories.lab;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DemoSerialization {

    public static void main(String[] args) {

        String path = "C:\\Users\\Kaloyan\\Desktop\\Java-Advanced-Jan-2025\\src\\L04_Streams_Files_and_Directories\\lab\\opel.cer";

        Car opel = new Car("Opel", 200000L, 150);

        // serialization => ObjectOutputStream
        // deserialization => ObjectInputStream

        try(
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(path));
        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(path))
        ){
            // serialization
            outputStream.writeObject(opel);
            opel = new Car("BMW", 1000, 500);
            System.out.println(opel);
            // deserialization
            Object object = inputStream.readObject();
            if (object instanceof Car){
                opel = (Car) object;
                System.out.println(opel);
            }

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
