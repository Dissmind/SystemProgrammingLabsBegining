import java.util.Scanner;
public class Task3 {

    public static void start(int variant) {
        Scanner in = new Scanner(System.in);
        System.out.println("Сколько элементов в массиве?");
        int a = in.nextInt();

        int[] array = new int[a];

        if (a >= 21 | a <= 0) return;

        System.out.println("Ввод >>> ");

        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
        }

            int result = 1;

            switch(variant) {

                case 1 :
                    result = 0;
                    for (int i : array) {
                        if (i / 3 == 0) result += i;
                    }
                break;

                case 2 :
                    for (int i : array) {
                        if (i / 5 != 0) result *= i;
                    }
                break;

                case 3 :
                    for (double i :array) {
                        if (i % 10 == 2) result *= i;
                    }

                case 4 :
                    result = 0;
                    for (int i : array) {
                        if (i > 0 & i / 10 != 1) result += i;
                     }
                case 5 :
                    for (double i : array) {
                        if (i < 0 & i / 2 != 0) result *= i;
                    }
                case 6 :
                    result = 0;
                    for (int i : array) {
                        if (i > 0 & i / 2 == 0) result += i;
                    }
                case 7 :
                    for (int i : array) {
                        if (i > 0 & i < 10) result *= i;
                    }
                case 8 :
                    result = 0;
                    for (int i : array) {
                        if (i > 0 & i / 7 != 0) result =+ i;
                    }
                case 9 :
                    result = 0;
                    for (int i : array) {
                        if (i / 10 == 0) result += i;
                    }
            }
                System.out.println("Ответ >>> " + result);
    }
}
