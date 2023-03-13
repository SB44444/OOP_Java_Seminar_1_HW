public class Penguin extends Animal {
    public Penguin(String name, String color) {
        super(name, color,0, 0);
    }

    public Penguin(String name) {
        this(name, null);
    }

    @Override
    public void speak() {
        System.out.println("Квить!");
    }

    @Override
    public void fly() {
    }
}