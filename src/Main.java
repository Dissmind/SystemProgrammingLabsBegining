import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Hat.start();

        Scanner in = new Scanner(System.in);

        int[] array = new int[5];

        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
        }

        for (int i : array) {
            System.out.println(i);
        }

    }
}
