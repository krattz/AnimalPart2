import java.util.ArrayList;


public class Home {
  Dog dog = new Dog();
  Cat cat = new Cat();
ArrayList list = new ArrayList<Object>();
  public Dog adoptPet(Dog sound)
  {
    dog.sounds();
    return dog;
  }
  public Cat adoptPet(Cat sound)
  {
    cat.sounds();
    return cat;
  }

  public void makeAllSounds()
  {
    list.add(dog);
    list.add(cat);

  }
}