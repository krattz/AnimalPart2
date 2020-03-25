import com.sun.tools.classfile.StackMapTable_attribute;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class AnimalTest {

    Cat cat = new Cat();
    Dog dog = new Dog();

    @Test
    public void TestCatSound()
    {
        cat.setName("Storm");
        assertEquals("Storm Meow" ,cat.sounds());
    }

    @Test
    public void TestCatEats()
    {
        cat.setName("Storm");
        assertEquals("Storm Food" ,cat.eats() );
    }

    @Test
    public void TestDogSound()
    {
        dog.setName("Rax");
        assertEquals("Rax Barks", dog.sounds() );
    }

    @Test
public void TestDogEats()
    {
        dog.setName("Rax");
        assertEquals("Rax Food" , dog.eats());
    }
}