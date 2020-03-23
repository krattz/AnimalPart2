import java.util.Collections;

public class MainProgram {

    public static void main(String[] args) {
        Home home = new Home();
        Dog dog = new Dog();
        Cat cat = new Cat();
        dog.setName("Rax ");
        cat.setName("Storm ");
        System.out.println(dog.sounds());
        System.out.println(cat.sounds());
        System.out.println(dog.eats());
        System.out.println(cat.eats());
        System.out.println(home.adoptPet(cat));
        System.out.println(home.adoptPet(dog));

        home.makeAllSounds();
    }
}