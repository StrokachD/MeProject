package zadachiLesson9.Computer;

import zadachiLesson9.Computer.Computer;

public class MainComputer {
    public static void main(String[] args) {
        Computer computer = new Computer("Lenovo", 800, 16, 4);
        System.out.println(computer.toString());
    }
}