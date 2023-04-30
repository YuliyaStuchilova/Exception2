package org.example;

import java.util.Scanner;

public class Task1 {
//    Реализуйте метод, который запрашивает у пользователя ввод дробного числа
//    (типа float), и возвращает введенное значение.
//    Ввод текста вместо числа не должно приводить к падению приложения,
//    вместо этого,
//    необходимо повторно запросить у пользователя ввод данных.

    public static void main(String[] args) {
        Task1 task1 = new Task1();
        System.out.println(task1.number());
    }
    public String number() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите дровное чило: ");
        String num = sc.next();
        while (!(isNumber(num))) {
            System.out.println("Необходимо ввести дробное число!");
            System.out.println("Введите дровное чило: ");
            num = sc.next();
        }

        return num;
    }
    private static boolean isNumber(String value) {
        try {
            Float.parseFloat(value);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

}
