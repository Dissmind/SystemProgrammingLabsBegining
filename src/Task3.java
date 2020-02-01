import java.util.Scanner;
public class Task3 {

    public static void start(int variant) {
        Scanner in = new Scanner(System.in);
        System.out.println("Сколько элементов в массиве?");
        int a = in.nextInt();
        int[] array = new int[a];

        if (a >= 21 | a <= 1 ) return;

        System.out.println("Ввод >>> ");

        int result = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
        }

            switch(variant) {
                case 1 :
                    result = 0;
                    for (int i : array) {
                        if (i % 3 == 0) result += i;
                    }
                break;

                case 2 :
                    result = 1;
                    for (double i : array) {
                        if (i % 5 != 0) result *= i;
                    }
                break;
            }
            System.out.println("Ответ >>>> " + result);
    }
}
