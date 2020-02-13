import com.sun.tools.classfile.StackMapTable_attribute;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class AnimalTest {

    Cat cat = new Cat();
    Dog dog = new Dog();

    @Test
    public void TestCatSound()
    {
        assertEquals("Storm Meows" ,cat.sounds());
    }

    @Test
    public void TestCatEats()
    {
        assertEquals("Food changed","Food" ,cat.eats() );
    }

    @Test
    public void TestDogSound()
    {
        assertEquals("Dog sound","Rax Barks", dog.sounds() );
    }

    @Test
public void TestDogEats()
    {
        assertEquals("Dog eats","Food" , dog.eats());
    }
}