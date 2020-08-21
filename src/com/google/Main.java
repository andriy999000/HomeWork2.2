package com.google;

public class Main {

    public static void main(String[] args) {







//        Задание 2
//        Применить на практике возможные преобразования без потери точности.
//        1. byte -> short -> int -> long
//        2. int -> double
//        3. short -> float -> double
//        4. char -> int

        byte b = 127;
        short s = b;
        int i = s;
        long l = i;

        System.out.println(l);//127


        int i2 =  4095;
        double d = i2;
        System.out.println(d);//4095.0


        short s2 = 32767;
        float f = s2;
        double d2 = f;
        System.out.println(d2);//32767.0


        char c = '\u0024';
        int i3 = c;
        System.out.println(i3);




    }
}
