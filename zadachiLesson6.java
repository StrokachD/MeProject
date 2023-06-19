import java.util.Scanner;

public class zadachiLesson6 {
    /*   Технічні вимоги:
                •	За допомогою java.util.Random програма загадує випадкове число в діапазоні[0-100]
                та пропонує гравцеві через консоль ввести своє ім'я, яке зберігається в змінній name.
                •	Перед початком на екран виводиться текст: Let the game begin!
                •	Сам процес гри обробляється у нескінченному циклі.
                •	Гравцеві пропонується ввести число в консоль, після чого програма порівнює загадану
                кількість з тим, що ввів користувач.
                •	Якщо введене число менше загаданого, програма виводить на екран текст:
                Your number is too small. Please, try again..
                Якщо введене число більше за загадане, то програма виводить на екран текст:
                Your number is too big. Please, try again..
                •	Якщо введене число відповідає загаданому, то програма виводить текст: Congratulations, {name}!
                •	Завдання повинно бути виконане за допомогою масиви (НЕ використовуйте інтерфейси List, Set, Map).*/
    public static void main(String[] args) {
                Scanner in = new Scanner(System.in);
        System.out.println("Как тебя зовут? ");
        String name = in.nextLine();

        int a = (int) (Math.random() * (100 + 0)) + 0;

        System.out.println("Попробуй-ка угадать число от 0 до 100");
        Scanner myScanner1 = new Scanner(System.in);
        int b = 0;
        while (b != a) {

            b = myScanner1.nextInt();
            if (b < a) {
                System.out.println("Надо больше. Повтори попытку.");
            }
            if (b > a) {
                System.out.println("Надо меньше. Повтори попытку.");
            }

        } System.out.println("Да! Поздравляю," + name + "!") ;
    }

}
