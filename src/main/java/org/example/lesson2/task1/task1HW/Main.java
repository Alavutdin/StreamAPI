package org.example.lesson2.task1.task1HW;

/*Используя Reflection API, напишите программу,
которая выводит на экран все методы класса String.
 */

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException,
            InvocationTargetException, InstantiationException,
            IllegalAccessException {
        Class<?> str = Class.forName("java.lang.String");

        Method[] methods = str.getDeclaredMethods();


        for (Method method : methods)
        {
            System.out.println(method.getName());
        }

    }

        //Object strInstance = constructors[0].newInstance(null);

//        Method infoMethod = str.getDeclaredMethod("valueOf");
//
//        infoMethod.invoke(strInstance);


}
