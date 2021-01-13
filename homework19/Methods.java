package javacore.homework19;

import java.io.*;

public class Methods implements Serializable {
     static void serialize(Employee employee) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\gofou\\Desktop\\Logos\\hw19\\serialize.ser");
        ObjectOutputStream objectOutputStream= new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(employee);
        objectOutputStream.close();
    };
    static void deserialize() throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\gofou\\Desktop\\Logos\\hw19\\serialize.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        System.out.println(objectInputStream.readObject());
    };
}
