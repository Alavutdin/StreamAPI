package org.example.lesson1.task1HW;

/*Напишите программу, которая использует Stream API для обработки
списка чисел. Программа должна вывести на экран среднее значение
всех четных чисел в списке.*/

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer>list= Arrays.asList(1,2,3,4,5,6,7,8,9);
        list.stream().filter(i->i%2==0);
        double number=list.stream().mapToInt(a->a).average().orElse(0);
        System.out.println(Math.round(number));

    }
}
