import java.util.Collections;

public class MainProgram {

    public static void main(String[] args) {
        Home home = new Home();
        Dog dog = new Dog();
        Cat cat = new Cat();
        dog.setName("Rax ");
        cat.setName("Storm ");
        dog.sounds();
        cat.sounds();
        dog.eats();
        cat.eats();
        home.adoptPet(cat);
        home.adoptPet(dog);

        home.makeAllSounds();
    }
}