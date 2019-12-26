import java.util.Scanner;
public class Task2 {
    public static int a;
    public static int b;
    public static int c;

    public static void InputData() {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите А >>> ");
        a = in.nextInt();

        System.out.print("Введите B >>> ");
        b = in.nextInt();

        System.out.print("Введите C >>> ");
        c = in.nextInt();
    }

    public static void start(int variant) {

        InputData();

        double result = 0;

        switch(variant) {
            case 1 :
                result = (b * b) - 4 * (a / c);
                break;
            case 2 :
                result = Math.log10(b) / (a + c);
                break;
            case 3 :
                result = Math.cos(b) / (a % c);
                break;
            case 4 :
                result = ((b + 1) / a) + Math.max(a, b);
                break;
            case 5 :
                result = (Math.min(a, c) / (a - 1)) - c;
                break;
            case 6 :
                result = Math.sin(1 / a) + Math.pow(b, c);
                break;
            case 7 :
                result = Math.exp(b) + c / a;
                break;
            case 8 :
                result = -(Math.max(a, b) / (a - b));
                break;
            case 9 :
                result = Math.tan(a * b) - (1 / c);
                break;
            case 10 :
            result = Math.sqrt(Math.min(a, Math.min(b, c))) + (c / 2);
            break;
//            if (variant == 11) result = Math.pow(Math.sqrt(a * b), c);
//            if (variant == 12) result = Math.abs(a - b) / Math.pow(-c, 2);
//            if (variant == 13) result = a % b * (Math.pow(c, 3));
//            if (variant == 14) result = b / (a * c) - (Math.pow(c, 2));
//            if (variant == 15) result = Math.pow(b, 2) - (Math.tan(b / c));
//            if (variant == 16) result = Math.abs((a / b) - (Math.pow(c, 2)));
//            if (variant == 17) result = Math.sqrt(c - Math.max(a, b));
//            if (variant == 18) result = Math.tan(1 / a) - (b / c);
//            if (variant == 19) result = Math.log(a / b) + c;
//            if (variant == 20) result = (c / Math.pow(a, 2)) - b;
//            if (variant == 21) result = a / Math.abs(Math.pow((c - b), 2));
//            if (variant == 22) result = Math.pow((c - b % a), 2);
//            if (variant == 23) result = Math.pow(Math.min(a, Math.min(b, c)), a % c);
//            if (variant == 24) result = Math.pow(Math.sqrt(a - b), (c + 1));
//            if (variant == 25) result = Math.pow(Math.pow(a, (1 / b)), (1 / c)) % a;
//            if (variant == 26) result = (a - b) / Math.pow((b - c), 2);
//            if (variant == 27) result = Math.pow(Math.log(c - a), b);
//            if (variant == 28) result = Math.cos(a) / Math.pow(b, (c + 1));
//            if (variant == 29) result = (a % b) / Math.sin(c);
//            if (variant == 30) result = Math.log10(c) + (a / b);
        }
        System.out.println("Ответ: " + result);
    }
}


