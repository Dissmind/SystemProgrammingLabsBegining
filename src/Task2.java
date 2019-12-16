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

        int result = (b * b) - 4 * (a / c);

        System.out.println();
        System.out.println("Ответ: " + result);
    }

    public static void var2() {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите А >>> ");
        int a = in.nextInt();

        System.out.print("Введите B >>> ");
        int b = in.nextInt();

        System.out.print("Введите C >>> ");
        int c = in.nextInt();

        double result = Math.log10(b) / (a + c);

        System.out.println();
        System.out.println("Ответ: " + result);
    }

    public static void var3() {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите A >>> ");
        int a = in.nextInt();

        System.out.print("Введите B >>> ");
        int b = in.nextInt();

        System.out.print("Введите C >>> ");
        int c = in.nextInt();

        double result = Math.cos(b) / (a % c);

        System.out.println();
        System.out.println("Ответ: " + result);
    }

    public static void var4() {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите A >>> ");
        int a = in.nextInt();

        System.out.print("Введите B >>> ");
        int b = in.nextInt();


        double result = ((b + 1) / a) + Math.max(a, b);

        System.out.println();
        System.out.println("Ответ: " + result);
    }

    public static void var5() {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите А >>> ");
        int a = in.nextInt();

        System.out.print("Введите C >>> ");
        int c = in.nextInt();

        int result = (Math.min(a, c) / (a - 1)) - c;

        System.out.println();
        System.out.println("Ответ: " + result);
    }

    public static void var6() {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите A: ");
        int a = in.nextInt();

        System.out.print("Введите B: ");
        int b = in.nextInt();

        System.out.print("Введите C: ");
        int c = in.nextInt();

        double result = Math.sin(1 / a) + Math.pow(b, c);

        System.out.println();
        System.out.println("Ответ: " + result);
    }

    public static void var7() {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите A: ");
        int a = in.nextInt();

        System.out.print("Введите B: ");
        int b = in.nextInt();

        System.out.print("Введите C: ");
        int c = in.nextInt();

        double result = Math.exp(b) + c / a;

        System.out.println();
        System.out.println("Ответ: " + result);
    }

    public static void var8() {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите A: ");
        int a = in.nextInt();

        System.out.print("Введите B: ");
        int b = in.nextInt();

        double result = -(Math.max(a, b) / (a - b));

        System.out.println();
        System.out.println("Ответ: " + result);
    }

    public static void var9() {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите A: ");
        int a = in.nextInt();

        System.out.print("Введите B: ");
        int b = in.nextInt();

        System.out.print("Введите C: ");
        int c = in.nextInt();

        double result = Math.tan(a * b) - (1 / c);

        System.out.println();
        System.out.println("Ответ: " + result);
    }

    public static void var10() {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите А: ");
        int a = in.nextInt();

        System.out.print("Введите В: ");
        int b = in.nextInt();

        System.out.print("Введите С: ");
        int c = in.nextInt();

        double result = Math.sqrt(Math.min(a, Math.min(b, c))) + (c / 2);

        System.out.println();
        System.out.println("Ответ: " + result);
    }
}


