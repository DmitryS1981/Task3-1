public abstract class Animal {
    private static int totalAnimals = 0;
    String name;
    int maxRunDistance;
    int maxSwimDistance;
    boolean canSwim;
    public Animal(String name, int maxRunDistance, int maxSwimDistance, boolean canSwim) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxSwimDistance = maxSwimDistance;
        this.canSwim = canSwim;
        totalAnimals++;
    }
    public void run(int distance) {
        if (distance <= maxRunDistance) {
            System.out.println(name + " пробежал " + distance + " м.");
        } else {
            System.out.println(name + " не может пробежать " + distance + " м. Максимум: " + maxRunDistance + " м.");
        }
    }
    public void swim(int distance) {
        if (!canSwim) {
            System.out.println(name + " не умеет плавать.");
        } else if (distance <= maxSwimDistance) {
            System.out.println(name + " проплыл " + distance + " м.");
        } else {
            System.out.println(name + " не может проплыть " + distance + " м. Максимум: " + maxSwimDistance + " м.");
        }
    }
    public static int getTotalAnimals() {
        return totalAnimals;
    }
}
