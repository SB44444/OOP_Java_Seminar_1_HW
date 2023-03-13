import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<Animal>();
        animals.add(new Cat("- Мурзик: "));
        animals.add(new Dog("- Алтай: "));
        animals.add(new Raven("- Соколов: "));
        animals.add(new Swift("- Вихрь: "));
        animals.add(new Whale("- Гор: "));
        animals.add(new Penguin("- Айсберг: "));        
    
        for (Animal element: animals) element.toGo();
        System.out.println();

        for (Animal element: animals) element.swim();
        System.out.println();

        for (Animal element: animals) element.fly();
        System.out.println();
    }

}