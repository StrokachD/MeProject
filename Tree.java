package zadachiLesson9.Tree;

class Tree {
    /*Создать класс Tree с перегруженными конструкторами.
    В классе есть Tree есть поля:
    String type; int height, int coutOfsticks, String colour;

    Конструктор1 принимающий в параметры String type; int height
    и присваивающий значение полям coutOfsticks значение 13,
    colour "Зеленый".

    Конструктор2 принимающий в параметры int height, int coutOfsticks,
    String colour и присваивающий значение полю type "пихта".

    Констуктор по умолчанию 3, который присваивает height = 350, coutOfsticks = 29,
    сolour = "Желтый".

    Конструктор4 который принимает в параметры String type,
    и вызывает внутри себя конструктор 3.

    Создать в отдельном классе main 4 объекта класса Tree используя 4 созданных конструктора.*/
    String type;
    int height;
    int coutOfsticks;
    String colour;

    public Tree(String type, int height) {
        this.type = type;
        this.height = height;
        this.coutOfsticks = 13;
        this.colour = "Зеленый";
    }

        public Tree(int height, int coutOfsticks, String colour) {
        this.type = "пихта";
        this.height = height;
        this.coutOfsticks = coutOfsticks;
        this.colour = colour;
    }

        public Tree() {
        this.height = 350;
        this.coutOfsticks = 29;
        this.colour = "Желтый";
    }

        public Tree(String type) {
        this();
        this.type = type;
    }
}



