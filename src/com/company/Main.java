package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 1-ое число:");
        int a = sc.nextInt();
        System.out.println("Введите 2-ое число:");
        int b = sc.nextInt();
        System.out.println("Введите 3-ее число:");
        int c = sc.nextInt();
        System.out.println("Введите 4-ое число:");
        int d = sc.nextInt();
        if (a < b && a < c && a < d) {
            System.out.println("Наименьшее число:"+a);
        } else if (b < a && b < c && b < d) {
            System.out.println("Наименьшее число:"+b);
        } else if (c < a && c < b && c < d) {
            System.out.println("Наименьшее число:"+c);
        } else if (d < a && d < b && d < c) {
            System.out.println("Наименьшее число:"+d);
        } else System.out.println("Ошибка");
    }
}
