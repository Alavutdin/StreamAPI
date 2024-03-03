package org.example.lesson1.task1HW.lecture;

import java.util.Arrays;
import java.util.List;

public class API {
    public static void main(String[] args) {
        PlainInterface plainInterface = ((x, y) -> String.valueOf(x+y));
        System.out.println(plainInterface.action(5,10));
        System.out.println();

        PlainInterfaceInt plainInterfaceInt=
                ((x, y) -> {
                    return Integer.sum(x , y);
                });
        System.out.println(plainInterfaceInt.action(5,5));

        List<String>list= Arrays.asList("Hello "," world "," my "," my ");
        list.stream().filter(s -> s.equals("my"))
                .forEach(System.out::println);
        list.stream().filter(s -> s.length()>1)
                .forEach(System.out::print);
        System.out.println();
        list.stream().filter(s -> s.length()>1).distinct()
                .forEach(System.out::print);


    }
}
