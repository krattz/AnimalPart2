public class Dog extends Animal {
    public String sounds()
    {
        System.out.println(Dog.super.getName() + " barks");
        return  "barks";
    }
}

