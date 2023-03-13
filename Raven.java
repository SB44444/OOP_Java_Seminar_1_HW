

public class Raven extends Animal {
    public Raven(String name, String color) {
        super(name, color,0 , 0);
    }
    public Raven(String name) {
        this(name, null);
    }

    @Override
    public void speak() {
        System.out.println("Кар!");
    }

    @Override
    public void swim() {
    }
}