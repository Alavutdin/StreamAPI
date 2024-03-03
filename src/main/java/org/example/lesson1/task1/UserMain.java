package org.example.lesson1.task1;

import java.util.Arrays;
import java.util.List;

public class UserMain {
    public static void main(String[] args) {
        List<User>list= Arrays.asList(new User("nick",10),
                new User("dick",15));


        list.stream().forEach(System.out::println);
        System.out.println();
        list.stream().map(user -> new User(user.name, user.age-10))
                .forEach(System.out::println);
        System.out.println();
        list.stream().map(user -> new User(user.name, user.age-10))
                .filter(user -> user.age<=0)
                .forEach(System.out::println);

    }
}
