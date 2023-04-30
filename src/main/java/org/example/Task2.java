package org.example;

public class Task2 {
    public static void main(String[] args) {
        int[] intArray = {2, 6, 8, 45, 6, 23, 5, 98, 45};
        try {
            int d = 8;
            int catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index 8 out of bounds length");
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
    }
}
