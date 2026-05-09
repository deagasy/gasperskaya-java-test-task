package ru.hannya;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Задание 2. Сравнение строк");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первую строку:");
        String a = scanner.next();
        System.out.println("Введите вторую строку:");
        String b = scanner.next();

        if (a.equals(b)) {
            System.out.println("Строки идентичны");
        } else {
            System.out.println("Строки неидентичны");
        }
        scanner.close();
    }
}
