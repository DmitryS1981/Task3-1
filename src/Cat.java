public class Cat extends Animal {
    static int totalCats = 0;
    public Cat(String name) {
        super(name, 200, 0, false);
        totalCats++;
    }
    static int getTotalCats() {
        return totalCats;
    }
}
