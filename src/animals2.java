public class animals2 {
    public static void main(String[] args) {

        Dog dog = new Dog("Бобик");
        Cat cat1 = new Cat("Мурзик");
        Cat cat2 = new Cat("Барсик");

        dog.run(150);
        dog.swim(5);

        cat1.run(100);
        cat1.swim(5);

        // 🍲 миска
        Bowl bowl = new Bowl(20);

        Cat[] cats = {cat1, cat2};

        for (Cat c : cats) {
            c.eat(bowl, 15);
        }

        bowl.info();

        System.out.println("Сытость котов:");
        for (Cat c : cats) {
            System.out.println(c.isSatiety());
        }

        Animal.printAnimalCount();
        Dog.printDogCount();
        Cat.printCatCount();
    }
}