package ru.geekbrains.homework_1;

public class homeWork1 {
    //Задание №1
    public static void main(String[] args) {
        //Задание №2
        int b = 10;
        float c = 11.0f;
        boolean d = true;
        String e = "Cake is a lie";
        char f = 'a';
        byte h = 1;
        short j = 2;
        long k = 100;
        double p = 100.00;
        System.out.println("Результат выполнения задания №2");
        System.out.println("********");
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(h);
        System.out.println(j);
        System.out.println(k);
        System.out.println(p);
        System.out.println("********");
        //Задание №3
        System.out.println("Результат выполнения задания №3 " + calcEquation(10.0f, 15.0f, 20.5f, 30.1f));
        //Задание №4
        System.out.println("Результат выполнения задания №4 " + isCompareNumb(5, 16));
        //Задание №5
        isPositive(-5);
        //Задание №6
        System.out.println("Результат выполнения задания №6 " + isPositiveBool(5));
        //Задание №7
        System.out.println("Результат выполнения задания №7 " + "Привет," + name("John Dow"));
        //Задание №8
        System.out.println("Результат выполнения задания №8 " + year(1000));
    }

    public static float calcEquation(float a, float b, float c, float d) {
        float result = a * (b +(c / d));
        return result;
    }

    public static boolean isCompareNumb (int a, int b) {
        //return (a + b <= 20 && a + b >= 10);
        if (a + b <= 20 && a + b >= 10) {
            return true;
        } else {
            return false;
        }
    }

    public static int isPositive (int a) {
        if (a >= 0) {
            System.out.println("Результат выполнения задания №5 " + "Число положительное.");
            return a;
        } else {
            System.out.println("Результат выполнения задания №5 " + "Число отрицательное.");
            return a;
        }
    }

    public static boolean isPositiveBool (int a) {
        return a >= 0;
    }

    public static String name (String a) {
       return a;
    }

    public static int year (int a) {
        if ((a % 4 == 0 && (a / 100) % 4 == 0)) {
            System.out.println("Год високосный!");
        } else {
            System.out.println("Год не високосный!");
        }
        return a;
    }

}

//after Git commit
