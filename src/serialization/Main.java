package serialization;

import java.io.*;

public class Main {
    public static void main(String[] args) {
       try {
           ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("Dog"));
           Dog dog = new Dog("Aja",35);
           objectOutputStream.writeObject(dog);
       }
       catch (IOException | SecurityException exception){
           exception.printStackTrace();

       }
    }
}
