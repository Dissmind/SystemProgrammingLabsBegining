import java.util.Scanner;
public class Task3 {

    public static void start(int variant) {
        Scanner in = new Scanner(System.in);

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
                    System.out.println("Сколько элементов в массиве?");
                    int a = in.nextInt();

                    int[] array = new int[a];

                    if (a > 20) break;

                    for (int i = 0; i < array.length; i++) {
                        array[i] = in.nextInt();
                    }

                    for (int i : array) {
                        if (i % 3 == 0) result += i;
                    }
                break;
            }
            if (result == 0) System.out.println("Error 147");
            else System.out.println("Ответ >>> " + result);
    }
}
