package zadachiLesson9.Tree;

public class MainTree {
        public static void main(String[] args) {
            Tree tree1 = new Tree("Ель", 250);
            Tree tree2 = new Tree(300, 20, "Синий");
            Tree tree3 = new Tree();
            Tree tree4 = new Tree("Сосна");

            System.out.println("Дерево 1: " + tree1.type + ", высота: " + tree1.height + ", веток: " + tree1.coutOfsticks + ", цвет: " + tree1.colour);
            System.out.println("Дерево 2: " + tree2.type + ", высота: " + tree2.height + ", веток: " + tree2.coutOfsticks + ", цвет: " + tree2.colour);
            System.out.println("Дерево 3: " + tree3.type + ", высота: " + tree3.height + ", веток: " + tree3.coutOfsticks + ", цвет: " + tree3.colour);
            System.out.println("Дерево 4: " + tree4.type + ", высота: " + tree4.height + ", веток: " + tree4.coutOfsticks + ", цвет: " + tree4.colour);
        }
    }
