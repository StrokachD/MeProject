import java.util.Scanner;

public class zadachiLesson4 {
    /*1) У вас есть строка "Я тестирую замечательно. Что еще нужно?",
    Которую нужно ввести с клавиатуры в консоль.
    Необходимо при помощи только  метода next() класса Scanner (не используем метод nextLine())
    присвоить перемнным типа String следующие значения:
    string1 = Я
            string2 = тестирую
    string3 = замечательно
            string4 = Что еще нужно?
    Помимо string1, string2, string3, string4 новых переменных
    создавать нельзя.*/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*System.out.println("Введите любое слово или фразу: ");
        String string1 = "Я";
        String phrase1 = input.next();
        System.out.println(string1);
        String string2 = "тестирую";
        String phrase2 = input.next();
        System.out.println(string2);
        String string3 = "замечательно.";
        String phrase3 = input.next();
        System.out.println(string3);
        String string4 = "Что еще нужно?";
        String phrase4 = input.next();
        System.out.println(string4);
        System.out.println(string1 + " " + string2 + " " + string3 + " " + string4);
        System.out.println("========================================================");*/


        /*2)Пользователь вводит с клавиатуры три целочисленных значения
    На экран выводится информация можно ли из этих сторон
    построить треугольник.
    Первую сумму сравниваем с оставшейся стороной c , вторую - с a и третью - с b .
    Если хотя бы в одном случае сумма окажется не больше третьей стороны,
    то делается вывод, что треугольник не существует.*/
        /*System.out.println("Введите три целых числа: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        if ((((a + b) > c) && ((b + c) > a) && ((c + a) > c))) {
            System.out.println("треугольник возможен");
        } else {
            ;
            System.out.println("нет, из этого треугольник не получится");
            System.out.println("========================================================");*/

        /*3)Пользователь вводит с клавиатуры свой год рождения.
                На консол выводится информация о его возрасте.
        Используем класс Date как на занятии.
        (P.s пока не затрагиваем момент месяца рождения,
        останавливаемся только на разнице лет. Если вам
        вдруг понадобится преобразовать тип String в int,
        то можете воспользоватьсятакой конструкцией Integer.parseInt(строка для преобразования).*/


        /*System.out.println("Введите год рождения: ");
        int yearOfBirth = input.nextInt();
        Date date = new Date();
        String yearNow = String.format("%tY", date);
        int yearNowInt = Integer.parseInt(yearNow);
        System.out.println("Друг мой, тебе уже " + (yearNowInt - yearOfBirth));
        System.out.println("========================================================");*/

        /*4)Вывести следующие сообщение в отформатированном виде (необходимо добавить спецификаторы формата):
          У вас есть строка: Число {X} больше {Y}, и это {True/False}
          Вместо {X},{Y},{True/False} вставляем необходимые спецификаторы формата.*/

        /*System.out.println("Введите X");
        int X = input.nextInt();
        System.out.println("Введите Y");
        int Y = input.nextInt();
        if (X > Y) {
            System.out.printf("Число %1$d больше %2$d, и это %3$b", X, Y, null);
        } else {
            System.out.printf("Число %1$d меньше %2$d, и это %3$b", X, Y, 1);
        }*/



        /*5)(Использовать операторы if-else-if)
        Пользоватьель вводит с клавиатуры числа:
        Если число равно 1, то выводин на консоль "Понедельник";
        Если число равно 2, то выводин на консоль "Вторник";
        Если число равно 3, то выводин на консоль "Среда";
        Если число равно 4, то выводин на консоль "Четверг";
        Если число равно 5, то выводин на консоль "Пятница";
        Если число равно 6, то выводин на консоль "Суббота";
        Если число равно 7, то выводин на консоль "Воскресенье";
        В противном случае выводим текст:
        "Лучше бы сегодня была пятница". */

        /*System.out.println("Введите число от 1 до 7:");
        int x = 0;
        while (x < 8) {
            x = Integer.parseInt(input.nextLine());
            if (x == 1) {
                System.out.println("Понедельник");
            } else if (x == 2) {
                System.out.println("Вторник");
            } else if (x == 3) {
                System.out.println("Среда");
            } else if (x == 4) {
                System.out.println("Четверг");
            } else if (x == 5) {
                System.out.println("Пятница");
            } else if (x == 6) {
                System.out.println("Суббота");
            } else if (x == 7) {
                System.out.println("Воскресенье");
            } else {
                System.out.println("Лучше бы сегодня была пятница");
            }
        }
    }
}*/
        /*6) Написать программу, используя тернарный оператор, где пользователь вводит с клавиатуры два числа
        и символ - или + или % или / или *.
        На экран выводится резултат действия над двумя введенными числами.
                Если пользователь ввел что-то кроме данных символов, то необходимо вывести 0.*/

        /*System.out.print("Введите первое число: ");
        int x = input.nextInt();
        System.out.print("Введите второе число: ");
        int y = input.nextInt();
        System.out.print("Введите математический символ: ");
        String z = input.next();

        int result = z.equals("+") ? x + y :
                z.equals("-") ? x - y :
                        z.equals("*") ? x * y :
                                z.equals("/") ? x / y :
                                        z.equals("%") ? x % y : 0;
        System.out.println(result);*/

        /*7)Используя оператор switch написать программу, которая выводит на
        консоль ссылку для скачивания программы.
                Из выбора программ взять: IntelliJ IDEA, Git, Java.
        Из выбора ОС взять: Linux, macOS, Windows.
                Программа должна спросить пользователя какая программа ему интересна,
                также спросить какую ОС он использует, а после вывести в консоль необходимую ссылку.
        Если программа с таким названием не существует выводит сообщение в консоль, о том
        что такой программы не существует.
                Если указанной пользователем ОС нет, то выводится сообщение в консоль, о том
        что такой ОС не существует.*/

        System.out.println("Какая у Вас операционная система LiNux(lin), macOS(mac), Windows(win)?");
        String os = input.nextLine();
        String program;
        switch (os.toUpperCase()) {
            case ("LIN"):
                System.out.println("Какая программа Вам интересна IntelliJ IDEA, Git или Java?");
                program = input.nextLine();
                switch (program) {
                    case ("IDEA"):
                        System.out.println("Прошу: https://www.jetbrains.com/idea/download/#section=linux");
                        break;
                    case ("GIT"):
                        System.out.println("Вот тут удобно скачать: https://git-scm.com/download/linux");
                        break;
                    case ("JAVA"):
                        System.out.println("Вот ссылка: https://www.java.com/ru/download/");
                        break;
                    default:
                        System.out.println("Проверь ка название.");
                }
                break;


            case ("MAC"):
                System.out.println("Какая программа Вам интересна IntelliJ IDEA, Git или Java?");
                program = input.nextLine();
                switch (program.toUpperCase()) {
                    case ("IDEA"):
                        System.out.println("Прошу: https://www.jetbrains.com/idea/download/#section=mac");
                        break;
                    case ("GIT"):
                        System.out.println("Вот тут удобно скачать: https://git-scm.com/download/mac");
                        break;
                    case ("JAVA"):
                        System.out.println("Вот ссылка: https://www.java.com/ru/download/");
                        break;
                    default:
                        System.out.println("Проверь ка название.");
                }
                break;

            case ("WIN"):
                System.out.println("Какая программа Вам интересна IntelliJ IDEA, Git или Java?");
                program = input.nextLine();
                switch (program.toUpperCase()) {
                    case ("IDEA"):
                        System.out.println("Прошу: https://www.jetbrains.com/ru-ru/idea/download/#section=windows");
                        break;
                    case ("GIT"):
                        System.out.println("Вот тут удобно скачать: https://git-scm.com/download/win");
                        break;
                    case ("JAVA"):
                        System.out.println("Вот ссылка: https://www.java.com/ru/download/ie_manual.jsp?locale=ru");
                        break;
                    default:
                        System.out.println("Проверь ка название.");

                }
                break;
            default:
                System.out.println("Не знаю такую ОС");
        }
    }
}
