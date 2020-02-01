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
                    // TODO: Принцип DRY (don't repeat yourself, с буржуйского - неповторяйся)
                    // TODO: Почему бы не сделать отдельный метод
                    // TODO: Тем более у тебя всегда эта часть должна быть в начале, изменяется лишь алгоритм (посмотри как ты это решил в Task2)
                    for (int i : array) {
                        if (i % 3 == 0) result += i;
                    }
                break;

                case 2 :
                    // TODO: x2 Принцип DRY (don't repeat yourself, с буржуйского - неповторяйся)
                    result = 1;
                    for (double i : array) {
                        if (i % 5 != 0) result *= i;
                    }
                break;
            }
            // TODO: Почему ошибка? А если в массиве нет элементов?
                System.out.println("Ответ >>> " + result);
    }
}
