abstract class Animal {
    protected String name;

    static int animalCount = 0;

    public Animal(String name) {
        this.name = name;
        animalCount++;
    }

    public abstract void run(int distance);
    public abstract void swim(int distance);

    public static void printAnimalCount() {
        System.out.println("Всего животных: " + animalCount);
    }
}