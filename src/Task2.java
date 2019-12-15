import java.util.Scanner;

public class Task2 {
    public static void var1() {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите А >>> ");
        int a = in.nextInt();

        System.out.print("Введите B >>> ");
        int b = in.nextInt();

        System.out.print("Введите C >>> ");
        int c = in.nextInt();

        int result = (b*b) - 4 * (a / c);

        System.out.println();
        System.out.println("Ответ: " + result);
    }

    public static void var2() {

    }
}
