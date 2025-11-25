public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Барсик");
        Cat cat2 = new Cat("Мурзик");
        Dog dog1 = new Dog("Бобик");
        Dog dog2 = new Dog("Шарик");
        Dog dog3 = new Dog("Рекс");

        System.out.println("Тестирование бега:");
        cat1.run(150);
        cat1.run(250);
        dog1.run(400);
        dog1.run(600);

        System.out.println("\nТестирование плавания:");
        cat2.swim(5);
        dog2.swim(8);
        dog2.swim(15);

        System.out.println("Всего котов: " + Cat.getTotalCats());
        System.out.println("Всего собак: " + Dog.getTotalDogs());
        System.out.println("Всего животных: " + Animal.getTotalAnimals());
    }
}
