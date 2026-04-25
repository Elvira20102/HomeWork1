class Bowl {
    private int food;

    public Bowl(int food) {
        this.food = Math.max(food, 0);
    }

    public int getFood() {
        return food;
    }

    public void addFood(int amount) {
        if (amount > 0) {
            food += amount;
            System.out.println("Добавили еды: " + amount);
        }
    }

    public void decreaseFood(int amount) {
        food = Math.max(food - amount, 0);
    }

    public void info() {
        System.out.println("В миске еды: " + food);
    }
}