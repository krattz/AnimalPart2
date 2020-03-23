import java.util.ArrayList;
public class Home {
  Dog dog = new Dog();
  Cat cat = new Cat();
  ArrayList list = new ArrayList<Object>();

  public String adoptPet(Cat cat)
  {
    return cat.sounds();
  }
  public String adoptPet(Dog now)
  {
    return now.sounds();
  }

  public void makeAllSounds()
  {
    for (Object a: list
    ) {
      list.add(adoptPet(dog));
      list.add(adoptPet(cat));
    }
  }
}