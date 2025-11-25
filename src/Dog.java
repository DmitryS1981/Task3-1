class Dog extends Animal {
    static int totalDogs = 0;
    public Dog(String name) {
        super(name, 500, 10, true);
        totalDogs++;
    }
    static int getTotalDogs() {
        return totalDogs;
    }
}
