package org.example.lesson1.task1;

public class Main {
    public static void main(String[] args) {
        PlainInterface plainInterface = new PlainInterface() {
            @Override
            public String action(int x, int y) {
                return String.valueOf(x+y);
            }
        };
        System.out.println(plainInterface.action(5,7));

        PlainInterface plainInterface1=(x,y)->{
            int a =5;
            return String.valueOf(x+y);
        };
        System.out.println(plainInterface1.action(1,3));

        PlainInterface plainInterface2=(x,y)->String.valueOf(Integer.compare(x,y));
        System.out.println(plainInterface2.action(8,9));

        PlainInterface2 plainInterface21 = Integer::compare;
        System.out.println(plainInterface21.action(5,1));
    }
}