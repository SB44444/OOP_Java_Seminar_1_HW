public class Cat extends Animal {
    public Cat(String name, String color) {
        super(name, color, 0, 0);
    }

    public Cat(String name) {
        this(name, null);
    }

    @Override
    public void speak() {
        System.out.println("Мяу!");
    }

    @Override
    public void swim() {
    }

    @Override
    public void fly() {
    }
}