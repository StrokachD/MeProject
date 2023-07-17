package zadachiLesson9.Computer;

import java.util.Objects;

public class Computer {

    /*1) Создать класс Computer c конструктором принимающим параметры
        Марка тип String, цена тип int, оперативная память тип int,
        и видеокарта тип int.
        Переопределить метод toString для вывода объекта класса в след. виде:
                "Создан PC.
                 Имя = марка.
                 Цена = цена.
                 Видеокарта = объем видеокарты
                 ОЗУ = Объем оперативной памяти."

        Все поля класса Computer должны быть приватными.
        Также создайте публичные методы для получения информации о полях класса Computer.
        А также методы для изменения его полей.

        Переопределите метод equals и метод hashCode для вашего класса.
        Сделайте так, чтобы компьютеры считались одинаковыми в случае если у них
        равны значения полей марка, оперативная память и видеокарта.

        В отдельном классе создайте объект класса компьютер, и выведите в консоль
        информацию о вашем объекте.*/

        private String brand;
        private int price;
        private int ram;
        private int graphicsCard;

        public Computer(String brand, int price, int ram, int graphicsCard) {
            this.brand = brand;
            this.price = price;
            this.ram = ram;
            this.graphicsCard = graphicsCard;
        }

        public String getBrand() {
            return brand;
        }

        public int getPrice() {
            return price;
        }

        public int getRam() {
            return ram;
        }

        public int getGraphicsCard() {
            return graphicsCard;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public void setRam(int ram) {
            this.ram = ram;
        }

        public void setGraphicsCard(int graphicsCard) {
            this.graphicsCard = graphicsCard;
        }

        @Override
        public String toString() {
            return "Создан PC.\n" +
                    "Имя = " + brand + ".\n" +
                    "Цена = " + price + ".\n" +
                    "Видеокарта = " + graphicsCard + ".\n" +
                    "ОЗУ = " + ram + ".";
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Computer computer = (Computer) o;
            return ram == computer.ram &&
                    graphicsCard == computer.graphicsCard &&
                    Objects.equals(brand, computer.brand);
        }

        @Override
        public int hashCode() {
            return Objects.hash(brand, ram, graphicsCard);
        }
    }

