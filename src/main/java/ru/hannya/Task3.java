package ru.hannya;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Задание 3. Вывод четных чисел из массива");

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i <= array.length - 1; i++) {
            if (array[i] % 2 == 0) {
                System.out.println(array[i]);
            }
        }
    }
}
