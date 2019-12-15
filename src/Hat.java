import java.util.Scanner;

public class Hat {

    // Start Menu
    public static void start() {
        int variant = variant();
        menu();
        startProgram(numberTask(), variant);
    }

    // How variant
    public static int variant() {
        System.out.print("Введите вариант >>> ");
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }

    // Task menu
    public static void menu() {
        System.out.println("MENU");
        System.out.println("1. Привет мир");
        System.out.println("2. Библиотека Math");
        System.out.print(" >>> ");
    }

    // Number task
    public static int numberTask() {
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }

    // Start program
    public static void startProgram(int number, int variant) {
        if (number == 1) {
            System.out.println();
            System.out.println();

            Task1.start();
        }

        if (number == 2) {
            System.out.println();
            System.out.println();

            if (variant == 1) Task2.var1();
            if (variant == 2) Task2.var2();
        }
    }
}
