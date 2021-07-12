package com.company.andrey.linear_equ;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите коэффициент k");
        double k = scan.nextDouble();
        System.out.println("Введите коэффициент b");
        double b = scan.nextDouble();
        if (k==0) {
            if (b==0) {
                System.out.println("x=любое число");
            } else {
                System.out.println("Решений нет");
            }
        } else {
            double x = -b / k;
            System.out.println("Ответ:");
            System.out.println(x);
        }
    }
}
