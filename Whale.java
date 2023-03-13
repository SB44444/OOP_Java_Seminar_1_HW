public class Whale extends Animal {
    public Whale(String name, String color) {
        super(name, color, 0, 0);
    }

    public Whale(String name) {
        this(name, null);
    }

    @Override
    public void speak() {
        System.out.println("У-у-у!");
    }

    @Override
    public void toGo() {}

    @Override
    public void fly() {}
}
