import Services.PersonOcupation;
import domain.Person;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Cant-Detect on 2016/03/13.
 */
public class testPerson {
private PersonOcupation ocupation;

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {
        
    }

    @Test
    public void testName() throws Exception {
        Person data = ocupation.getPersonDescription();
        System.out.println(" The Name is "+ ocupation.getPersonDescription().getName());
        Assert.assertEquals(data.getName(),"Aphiwe");
    }

    @Test
    public void testSurname() throws Exception {
        Person data = ocupation.getPersonDescription();
        System.out.println(" The surname is "+ocupation.getPersonDescription().getSurname());
        Assert.assertEquals(data.getSurname(),"Blom");
    }

    @Test
    public void testAge() throws Exception {
        Person data = ocupation.getPersonDescription();
        System.out.println(" The Age is "+ocupation.getPersonDescription().getAge());
        Assert.assertEquals(data.getAge(),23);
    }
}
