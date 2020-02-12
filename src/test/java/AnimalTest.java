import com.sun.tools.classfile.StackMapTable_attribute;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class AnimalTest {

    Cat cat = new Cat();
    Dog dog = new Dog();

    @Test
    public void TestCatSound()
    {
        assertEquals("Storm sound",cat.sounds(), "Storm Meows" );
    }

    @Test
    public void TestCatEats()
    {
        assertEquals("Food changed",cat.eats() , "Food");
    }

    @Test
    public void TestDogSound()
    {
        assertEquals("Dog sound", dog.sounds(), "Rax Barks");
    }

    @Test
public void TestDogEats()
    {
        assertEquals("Dog eats", dog.eats(), "Food");
    }
}