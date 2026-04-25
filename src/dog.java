class Dog extends Animal {

    static int dogCount = 0;

    public Dog(String name) {
        super(name);
        dogCount++;
    }

    @Override
    public void run(int distance) {
        int limit = 500;
        if (distance <= limit) {
            System.out.println(name + " пробежал " + distance + " м.");
        } else {
            System.out.println(name + " не может пробежать столько.");
        }
    }

    @Override
    public void swim(int distance) {
        int limit = 10;
        if (distance <= limit) {
            System.out.println(name + " проплыл " + distance + " м.");
        } else {
            System.out.println(name + " не может проплыть столько.");
        }
    }

    public static void printDogCount() {
        System.out.println("Собак: " + dogCount);
    }
}
