public class Swift extends Animal {
    public Swift(String name, String color) {
        super(name, color, 0, 0);
    }

    public Swift(String name) {
        this(name, null);
    }

    @Override
    public void speak() {
        System.out.println("Фьють!");
    }
    
    @Override
    public void toGo() {        
    }

    @Override
    public void swim() {
    }

}
