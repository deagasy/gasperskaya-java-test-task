import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число:");
        int a = scanner.nextInt();
        System.out.println("Введите второе число:");
        int b = scanner.nextInt();

        if (a > b) {
            System.out.println(a + " > " + b);
        } else if (a < b) {
            System.out.println(a + " < " + b);
        } else {
            System.out.println(a + " = " + b);
        }

        System.out.println("Сумма: " + a + " + " + b + " = " + (a + b));

        int dif;
        if (a > b) {
            dif = a - b;
            System.out.println("Разница: " + a + " - " + b + " = " + dif);
        } else {
            dif = b - a;
            System.out.println("Разница: " + b + " - " + a + " = " + dif);
        }

        System.out.println("Произведение: " + a + " * " + b + " = " + (a * b));

        float division;
        if (b != 0) {
            System.out.println("Частное: " + a + " / " + b + " = " + ((float) a / b));
        } else {
            System.out.println("Частное: делить на ноль нельзя");
        }
        scanner.close();
    }
}
