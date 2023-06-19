import java.util.Random;
import java.util.Scanner;

public class zadachiLesson5 {
    //    1)Написать программу, которая будет считывать введенные пользователем
//    слова с клавиатуры слова, и склеивать их в одно предложение до тех пор,
//    пока пользователь не введет с клавитуры слово STOP(*).
//    Все слова введенные до этого должны отобразится в консоли
//    одним предложением.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
              /*StringBuilder sentence = new StringBuilder();

        System.out.println("Введите слова. Для завершения введите *.");

        while (true) {
            String word = in.nextLine();

            if (word.equalsIgnoreCase("*")) {
                break;
            }

            sentence.append(word).append(" ");
        }

        System.out.println("Предложение: " + sentence.toString().trim());
        }*/

        /*2)Написать программу в которой пользователь вводит с клавиатуры число,
        а программа определяет, является она полиндромом или нет.
        И выводит данную информацию на экран.*/

        /*System.out.println("Insert number:");
        String number = in.nextLine();
        String response = "";
        for (int i = number.length() - 1; i >= 0; i--) {
            response = response + number.charAt(i);
        }
        if (response.equals(number)) {
            System.out.println("This is palindrom");
        } else {
            System.out.println("This is not palindrom");
        }*/

        /*3)Написать проограмму, условно для склада приема металла. Представим, что склад
        может хранить определенный вес металла. Пользователь вводит с
        клавиатуры вес, который может хранится на складе. Дальше пользователь вводит
        с клавиатуры вес, который условно собирается сдать на склад пользователь.
        Программа должна после каждой сдачи металла показывать сколько веса еще может принять
        склад. Если пользователь хочет сдать металла больше чем осталось места на складе,
        то программа не дает ему это сделать и уведомляет пользователя, о невозможности данной операции.
        Если пользователь сдает металл весом меньше чем 5, программа тоже предупреждает
        о невозможности приемки такого малого веса. Программа завершается, когда
        место на складе закончилось.*/
        /*System.out.println("Вместимость склада:");
        int maximumMass = in.nextInt();

        while (maximumMass >= 0) {
            System.out.println("Сколько хотите сдать металла?");
            int weight = in.nextInt();
            if (weight < 5) {
                System.out.println("Сдавать < 5 запрещено.");
            } else if (maximumMass - weight < 0) {
                System.out.println("Столько нет места на складе. Давайте меньше.");
            } else if (maximumMass - weight == 0) {
                System.out.println("Склад заполнен. Закрыто.");
                break;
            } else if (maximumMass - weight <= 5) {
                System.out.println("Осталось 5 или меньше места на складе - это недопустимо.");
            } else {
                maximumMass = maximumMass - weight;
                System.out.println(maximumMass + " ещё можем принять");
            }
        }*/

        /*4)Создать три массива.
        Первый будет состоять из следующих имен:
        "Петя", "Маша", "Алёна", "Федя", "Саша", "Антон", "Глеб".
        Второй будет содержать следующие значения типа int:
        10, 12, 14, 16, 18, 20.
        Третий будет содержать следующие значения:
        "школу", "магазин", "церковь", "тренажерный зал", "кино", "поликлинику".
        Пользователь вводит три числа с клавиатуры, которые будут соответствовать
        индексам каждого из элементов массивов.
        Пример1. после ввода 3,2,1:
        На экране должно вывестись следующее сообщение:
        "Федя будет идти в магазин в 14:00"
        Пример2. после ввода 1,2,3:
        На экране должно вывестись следующее сообщение:
        "Маша будет идти в тренажерный зал в 14:00"*/

        /*System.out.println("Надо ввести по очереди три числа:");
        String[] names = {"Петя", "Маша", "Алёна", "Федя", "Саша", "Антон", "Глеб"};
        String[] place = {"школу", "магазин", "церковь", "тренажерный зал", "кино", "поликлинику"};
        int[] time = {10, 12, 14, 16, 18, 20};
        int index1;
        while (true) {
            System.out.println("Кто идёт? Введите первое число:");
            System.out.println("От 0 до " + (names.length - 1));
            int index = in.nextInt();
            if (index >= 0 && index < names.length) {
                index1 = index;
                break;
            }
        }
        int index2;
        while (true) {
            System.out.println("Куда идёт? Введите второе число:");
            System.out.println("От 0 до " + (place.length - 1));
            int index = in.nextInt();
            if (index >= 0 && index < place.length) {
                index2 = index;
                break;
            }
        }
        int index3;
        while (true) {
            System.out.println("Когда идёт? Введите третье число:");
            System.out.println("От 0 до " + (time.length - 1));
            int index = in.nextInt();
            if (index >= 0 && index < time.length) {
                index3 = index;
                break;
            }
        }
        System.out.println(names[index1] + " будет идти в " + place[index2] + " в " + time[index3] + ":00");*/

        /*5)Есть одномерный массив из 10 элементов, заполнен-
        ный случайными числами. Пользователь вводит с клавиатуры
        число. Программа показывает есть ли такое число в созданном
        до этого массиве.*/
        /*System.out.println("Выпало 10 чисел от 0 до 100.");
        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        Scanner scanner = new Scanner(System.in);
        System.out.print("Угадайте одно из них: ");
        int number = scanner.nextInt();

        boolean found = false;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                found = true;
                break;
            }
            System.out.print(array[i] + " ");
        }

        if (found) {
            System.out.println("среди них ЕСТЬ число " + number);
        } else {
            System.out.println("среди них НЕТ числа " + number);

        }*/

        /*6)Заполнить массив на 45 элементов случайными числами
        от -50 до +50. Найти минимальный элемент и вывести его
        на консоль. Найти максимальный элемент и вывести его на
        консоль*/
        int[] array = new int[45];
        Random random = new Random();
                for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(101) - 50;
        }
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            System.out.print(array[i] + " ");
        }

        System.out.println("\nМинимальный элемент: " + min);
        System.out.println("Максимальный элемент: " + max);
    }
}









