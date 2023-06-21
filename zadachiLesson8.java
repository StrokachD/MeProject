import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class zadachiLesson8 {
    public static void main(String[] args) {
        /*1) Написать метод, принимающий в качестве параметра массив целых чисел. И выводит на экран все четные числа
        списком, a также нечетные числа списком. */

        /*int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("Четные числа:");
        for (int num : numbers) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }

        System.out.println("Нечетные числа:");
        for (int num : numbers) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
        }*/

/*2) Написать перегруженный метод, который может:
        •	не принимать никаких значений, тогда он будет выводить на консоль сообщение типа: "Я пустой".
        •	Принимать в качестве параметров String, тогда он будет выводить на консоль это сообщение.
        •	Принимать в качестве параметров массив строк, тогда он будет выводить на консоль все его значения
        через пробел.
        •	Принимать в качестве параметра массив чисел, тогда он будет выводить на консоль сумму элементов массива.
        •	Принимать в качестве параметров число и строку, тогда он будет выводить на консоль сообщение типа:
        "Ваше сообщение - "%%%%%%%%", ваше число -  $",
        где "%%%%%%%%" и $ ваши введенные строка и число соответственно.*/

        /*System.out.println("Я пустой");

        String message = "Принимаю в качестве параметров String";
        System.out.println(message);

        String[] strings = {"Принимаю", "массив", "строк", "вывожу", "через", "пробел", "."};
        for (String str : strings) {
            System.out.print(str + " ");
        }
        System.out.println();

        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Сумма элементов массива: " + sum);

        int number = 18;
        String customMessage = "Встречаемся возле метро в:";
        System.out.println("Ваше сообщение - " + customMessage + ", ваше число - " + number);*/


/*4)  Пользователь задает размерность двумерного массива с клавиатуры.
        Массив заполняется случайными числами от 0 до 1000.
        Необходимо создать одномерный массив, состоящий из максимальных значений
        каждого отдельного массива входящего в двумерный.
        Новый полученный массив вывести на экран.*/


        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество строк: ");
        int rows = in.nextInt();

        System.out.print("Введите количество столбцов: ");
        int columns = in.nextInt();

        int[][] array = new int[rows][columns];

        Random random = new Random();
        for (int i = 0; i < rows; i++) {
            for (int a = 0; a < columns; a++) {
                array[i][a] = random.nextInt(1001);
            }
        }
        int[] maxArray = new int[rows];
        for (int i = 0; i < rows; i++) {
            int max = Integer.MIN_VALUE;
            for (int a = 0; a < columns; a++) {
                if (array[i][a] > max) {
                    max = array[i][a];
                }
            }
            maxArray[i] = max;
        }

        System.out.println("Вот массив с максимальными значениями:");
        System.out.println(Arrays.toString(maxArray));
    }
}











