import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Game {
    /*5) Написати програму "стрільба по цілі".
    Технічні вимоги:
            	Даний квадрат 5х5, де програма випадковим чином ставить ціль.
            	Перед початком гри на екран виводиться текст: All Set. Get ready to rumble!.
            	Сам процес гри обробляється у нескінченному циклі.
        	гравцеві пропонується ввести лінію для стрільби; програма перевіряє, щоб було введено число,
    і введена лінія знаходиться в межах ігрового поля (1-5). У випадку, якщо гравець помилився,
    пропонує ввести число ще раз.
        	Гравцю пропонується ввести стовпчик для стрільби (має проходити аналогічну перевірку).
            	Після кожного пострілу необхідно показувати оновлене ігрове поле у консолі. Клітинки,
    куди гравець вже стріляв, слід зазначити як *.
            	Гра закінчується при попаданні в ціль. Наприкінці гри вивести в консоль фразу You have won!,
    а також ігрове поле. Уражену ціль відзначити як x.
        	Завдання повинно бути виконане за допомогою масивів (НЕ використовуйте інтерфейси List, Set, Map).
    Приклад виведення в консоль:*/


    private static final int FiledSize = 5;
    private static final char TargetSymbol = 'X';
    private static final char ShotSymbol = '*';

    private final char[][] field;
    private int targetRow;
    private int targetCol;

    public Game() {
        field = new char[FiledSize][FiledSize];
        initializeField();
        placeTarget();
    }

    private void initializeField() {
        for (char[] row : field) {
            Arrays.fill(row, 'I');
        }
    }

    private void placeTarget() {
        Random random = new Random();
        targetRow = random.nextInt(FiledSize);
        targetCol = random.nextInt(FiledSize);
    }

    private void printField() {
        for (char[] row : field) {
            for (char cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }

    public void play() {
        Scanner in = new Scanner(System.in);
        System.out.println("Все готово. Приготовьтесь к грохоту!");

        while (true) {
            System.out.print("Укажите строку (1-5): ");
            int row = readNumber(in);
            if (row < 1 || row > 5) {
                System.out.println("Неверный номер строки. Пожалуйста, попробуйте еще раз.");
                continue;
            }

            System.out.print("Укажите колонку (1-5): ");
            int col = readNumber(in);
            if (col < 1 || col > 5) {
                System.out.println("Неверный номер столбца. Пожалуйста, попробуйте еще раз.");
                continue;
            }

            row--; // Convert to 0-based index
            col--; // Convert to 0-based index

            if (row == targetRow && col == targetCol) {
                field[row][col] = TargetSymbol;
                printField();
                System.out.println("Вы победили!");
                break;
            } else {
                field[row][col] = ShotSymbol;
                printField();
            }
        }
    }

    private int readNumber(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            scanner.next();
        }
        return scanner.nextInt();
    }

    public static void main(String[] args) {
        Game game = new Game();
        game.play();
    }
}

