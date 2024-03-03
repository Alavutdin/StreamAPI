package org.example.lesson1.task1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class API {
    public static void main(String[] args) {

        List<String > list= Arrays.asList("Hello"," world"," !", " people");

        list.stream().filter(str-> str.length()>3).collect(Collectors.toList());
        for (String s : list) {
            System.out.print(s);
        }
        System.out.println();
        list.stream().filter(str->str.length()<5).forEach(System.out::print);

        System.out.println();
        list.stream().filter(str->str.length()>3).filter(str->str.contains("o")).forEach(System.out::print);

        System.out.println();
        Arrays.asList(1,2,3,4,5).stream().map(chislo->" chislo "+chislo+" kvadrat - "+chislo *chislo)
                .forEach(System.out::println);

        Arrays.asList(1,2,10,4,5,4).stream().sorted().distinct()
                .forEach(System.out::println);

        System.out.println();
        System.out.println(Arrays.asList(1,2,10,4,5,4).stream().sorted().distinct()
                .findFirst().get());
    }
}
