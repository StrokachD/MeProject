package zadachiLesson9;

public class Converter {
    /*Необходимо создать класс конвертер, который будет иметь методы конвертации примитивных типов данных:
   метод convertToInt; (конвертирует byte, short, int, long, char, float, double, String). При вводе boolean выводит сообщение, что введен тип boolean.
   convertToDouble;    (конвертирует byte, short, int, long, char, float, double, String). При вводе boolean выводит сообщение, что введен тип boolean.
   converToString;     (конвертирует byte, short, int, long, char, boolean, float, double, String).
   У данного класса должен быть только один конструктор, в параметрах которого можно указать его имя.
   А также только один метод геттер для получения информации о названии данного конвертра.*/
        private String name;

        public Converter(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public int convertToInt(Object value) {
            if (value instanceof Boolean) {
                System.out.println("Введен тип boolean.");
                return 0;
            } else if (value instanceof Character) {
                return (int) ((Character) value);
            } else if (value instanceof String) {
                try {
                    return Integer.parseInt((String) value);
                } catch (NumberFormatException e) {
                    System.out.println("Ошибка: Невозможно конвертировать строку в int.");
                    return 0;
                }
            } else {
                return (int) value;
            }
        }

        public double convertToDouble(Object value) {
            if (value instanceof Boolean) {
                System.out.println("Введен тип boolean.");
                return 0.0;
            } else if (value instanceof Character) {
                return (double) ((Character) value);
            } else if (value instanceof String) {
                try {
                    return Double.parseDouble((String) value);
                } catch (NumberFormatException e) {
                    System.out.println("Ошибка: Невозможно конвертировать строку в double.");
                    return 0.0;
                }
            } else {
                return (double) value;
            }
        }

        public String convertToString(Object value) {
            return String.valueOf(value);
        }

        public static void main(String[] args) {
            Converter converter = new Converter("MyConverter");

            int intValue = converter.convertToInt("123");
            System.out.println("intValue: " + intValue);

            double doubleValue = converter.convertToDouble(3.14);
            System.out.println("doubleValue: " + doubleValue);

            String stringValue = converter.convertToString(42);
            System.out.println("stringValue: " + stringValue);

            boolean boolValue = true;
            int boolToInt = converter.convertToInt(boolValue);
            double boolToDouble = converter.convertToDouble(boolValue);
            String boolToString = converter.convertToString(boolValue);
        }
    }
