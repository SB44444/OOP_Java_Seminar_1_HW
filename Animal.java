

public class Animal {
    private String name;
    private String color;
    private int age;
    private double bodyMass;

    public Animal(String name, String color, int age, double bodyMass) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.bodyMass = bodyMass;
    }

    public Animal(String name) {
        this(name, null, 0, 0);
    }

    public String getType() {
        return this.getClass().getSimpleName();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getage() {
        return age;
    }

    public void setage(int age) {
        this.age = age;
    }

    public double getbodyMass() {
        return bodyMass;
    }

    public void setbodyMass(int bodyMass) {
        this.bodyMass = bodyMass;
    }

    public void speak() {
        System.out.println("Я могу сказать:");
    }

    public void toGo() {
        System.out.println(
            String.format("%s %s Я могу ходить!", this.getType(), this.name));
    }

    public void fly() {
        System.out.println(
            String.format("%s %s Я могу летать!", this.getType(), this.name));
    }

    public void swim() {
        System.out.println(
            String.format("%s %s Я могу плавать!", this.getType(), this.name));
    }
}