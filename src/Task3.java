import java.util.Scanner;
public class Task3 {

    public static void start(int variant) {
        Scanner in = new Scanner(System.in);
        System.out.println("Сколько элементов в массиве?");

            int result = 0;

            switch(variant) {
//                case 1 :
//                    int[] array = {1, 2, 3, 4, 5, 6, 9, 10};
//
//                    for (int i = 0; i < array.length; i++) {
//                        if (array [i] % 3 ==0) result += array[i];
//                    }
//                 break;
                case 1 :
                    int a = in.nextInt();

                    int[] array = new int[a];

                    if (a > 20) break;

                    System.out.println("Ввод >>> ");

                    for (int i = 0; i < array.length; i++) {
                        array[i] = in.nextInt();
                    }

                    for (int i : array) {
                        if (i % 3 == 0) result += i;
                    }
                break;

                case 2 :
                    int b = in.nextInt();

                    int[] array2 = new int[b];

                    if (b > 20) break;

                    System.out.println("Ввод >>> ");

                    for (int i = 0; i < array2.length; i++) {
                        array2[i] = in.nextInt();
                    }

                    for (int i : array2) {
                        if (i % 5 != 0) result *= i;
                    }
                break;
            }
            if (result == 0) System.out.println("Error 147");
            else System.out.println("Ответ >>> " + result);
    }
}
