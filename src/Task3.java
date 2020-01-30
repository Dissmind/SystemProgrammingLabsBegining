import java.util.Scanner;
public class Task3 {

    public static void start(int variant) {

            int result = 0;

            switch(variant) {
                case 1 :
                    int[] array = {1, 2, 3, 4, 5, 6, 9, 10};

                    for (int i = 0; i < array.length; i++) {
                        if (array [i] % 3 ==0) result += array[i];
                    }
                 break;
            }
        System.out.println("Ответ " + result);
    }
}
