package org.example;

import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;

public class Task4 {
//    Разработайте программу, которая выбросит Exception,
//    когда пользователь вводит пустую строку.
//    Пользователю должно показаться сообщение,
//    что пустые строки вводить нельзя.

    public static void main(String[] args) {
        Task4 task4 = new Task4();
        task4.printRes();
    }

    public void printRes() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String s = scanner.nextLine();
        if (s.equals("")) {
            throw new RuntimeException("пустые строки вводить нельзя");
        }
    }
}
