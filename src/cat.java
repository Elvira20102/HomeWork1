class Cat extends Animal {

    static int catCount = 0;
    private boolean satiety = false;

    public Cat(String name) {
        super(name);
        catCount++;
    }

    @Override
    public void run(int distance) {
        int limit = 200;
        if (distance <= limit) {
            System.out.println(name + " пробежал " + distance + " м.");
        } else {
            System.out.println(name + " не может столько бежать.");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println(name + " не умеет плавать.");
    }


    public void eat(Bowl bowl, int appetite) {
        if (bowl.getFood() >= appetite) {
            bowl.decreaseFood(appetite);
            satiety = true;
            System.out.println(name + " поел и теперь сыт.");
        } else {
            System.out.println(name + " не стал есть — мало еды.");
        }
    }

    public boolean isSatiety() {
        return satiety;
    }

    public static void printCatCount() {
        System.out.println("Котов: " + catCount);
    }
}