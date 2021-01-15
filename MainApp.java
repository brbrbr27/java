package ru.geekbrains.lesson1;

public class MainApp {
    //1
    public static void main(String[] args){
    //2
        byte a = -120;
        short b = 12442;
        int c = 1000;
        long d = 2000000L;
        float e = 12.23f;
        double f = -123.123;
        char g = '*';
        boolean h = false;
    //3
        System.out.println(calculate(4,6,2,3));
    //4
        System.out.println(task10and20(5,9));
    //5
        isPositiveOrNegative(-12);
    //6
        System.out.println(isNegative(-45));
    //7
        greetings("Вика");
    //8
        leapYear(2020);


    }

    public static float calculate(float a, float b, float c, float d){
        return a * (b + (c / d));

    }

    public static boolean task10and20(int a, int b){
        return a + b >= 10 && a + b <= 20;

    }

    public static void isPositiveOrNegative(int a){
        if (a>0) {
            System.out.println("Положительное");
        } else System.out.println("Отрицательное");
    }

    public static boolean isNegative(int a){
        return a>0;
    }

    public static void greetings(String name){
        System.out.println("Привет, " + name + "!");
    }

    public static void leapYear(int a){
        if (a%4==0 || a%100==0 || a%400==0){
            System.out.println("Високосный");
        } else System.out.println("Не високосный");
    }
}
