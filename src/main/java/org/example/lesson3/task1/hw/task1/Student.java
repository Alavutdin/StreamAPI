package org.example.lesson3.task1.hw.task1;

//Разработайте класс Student с полями String name, int age,
// transient double GPA (средний балл).
//Обеспечьте поддержку сериализации для этого класса.
//Создайте объект класса Student и инициализируйте его данными.
//Сериализуйте этот объект в файл.
//Десериализуйте объект обратно в программу из файла.
//Выведите все поля объекта, включая GPA, и обсудите,
//почему значение GPA не было сохранено/восстановлено.

import javax.imageio.IIOException;
import java.io.*;

public class Student {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        UserData userData = new UserData(
                "Ivan",18,20);

        FileOutputStream fileOutputStream = new FileOutputStream("userbata.bin");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(userData);
        System.out.println("Serializable");

        FileInputStream fileInputStream = new FileInputStream("userbata.bin");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        userData=(UserData)objectInputStream.readObject();
        System.out.println("Deserializable");

//        GPA не было сохранено/восстановлено по причине того, что оно было
//                помечено -> transient
        System.out.println("UserData Serializable");
        System.out.println("Name: "+userData.getName());
        System.out.println("Age: "+userData.getAge());
        System.out.println("double GPA -> transient "+userData.getGPA());

    }
}
