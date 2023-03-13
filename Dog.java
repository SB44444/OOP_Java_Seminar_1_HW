public class Dog extends Animal {
    public Dog(String name, String color) {
        super(name, color,0, 0);
    }

    public Dog(String name) {
        this(name, null);
    }

    @Override
    public void speak() {
        System.out.println("Гав!");
    }

    @Override
    public void fly() {
    }
    @Override
    public void swim() {
    }
}