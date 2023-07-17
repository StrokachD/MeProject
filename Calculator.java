package zadachiLesson9;

    import java.util.Scanner;

    public class Calculator {
        /*Создать класс калькулятор.
   В нем создать методы:
   summ, minus, multiply, division.
   Сложение, вычитание, умножение и деление соответственно.
   Каждый метод принимает в качестве параметров два значения типа double.
   И выводит в консоль результат действия.

   Также в классе есть метод старт. Который выводит сообщение в консоль, что
   калькулятор запущен. И предлагает ввести действие в вашей консоли.

   Калькулятор должен принимать только следующие типы действий:
   2+4;    - пример синтаксиса сложения;
   5-6;    - пример синтаксиса вычитания;
   25*3;   - пример синтаксиса умножения;
   34/3;   - пример синтаксиса деления;
   После ввода действия на консоль выводится ответ этого действия.
   И после снова выводится сообщение о предложении ввести действие.

   в случае ввода другого синтаксисана консоль возвращается сообщение:
   "Введите корректное действие".
   И после снова выводится сообщение о предложении ввести действие.

   Программа закрывается после ввода команды Stop.
   Перед закрытием на консоль должно выводится сообщение:
   "Калькулятор закрыт".*/
        public static void main(String[] args) {
            Calculator calculator = new Calculator();
            calculator.start();
        }
        public void start() {
            System.out.println("Калькулятор запущен.");
            System.out.println("Введите действие (число+-/*число) или введите 'Stop' для выхода:");

            Scanner scanner = new Scanner(System.in);
            String input;
            while (true) {
                input = scanner.nextLine();
                if (input.equalsIgnoreCase("Stop")) {
                    System.out.println("Калькулятор закрыт.");
                    break;
                }

                if (isValidSyntax(input)) {
                    double result = calculate(input);
                    System.out.println("Ответ: " + result);
                } else {
                    System.out.println("Введите корректное действие.");
                }

                System.out.println("Введите действие или введите 'Stop' для выхода:");
            }

            scanner.close();
        }

        private boolean isValidSyntax(String input) {
            return input.matches("\\d+([+\\-*/]\\d+)");
        }

        private double calculate(String input) {
            String[] parts = input.split("[-+*/]");
            double num1 = Double.parseDouble(parts[0]);
            double num2 = Double.parseDouble(parts[1]);
            char operator = input.charAt(parts[0].length());
            double result = 0.0;

            switch (operator) {
                case '+':
                    result = summ(num1, num2);
                    break;
                case '-':
                    result = minus(num1, num2);
                    break;
                case '*':
                    result = multiply(num1, num2);
                    break;
                case '/':
                    result = division(num1, num2);
                    break;
                default:
                    System.out.println("Некорректный оператор.");
            }

            return result;
        }

        private double summ(double a, double b) {
            return a + b;
        }

        private double minus(double a, double b) {
            return a - b;
        }

        private double multiply(double a, double b) {
            return a * b;
        }

        private double division(double a, double b) {
            if (b == 0) {
                System.out.println("Деление на ноль недопустимо.");
                return 0.0;
            }
            return a / b;
        }
    }
