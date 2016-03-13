import org.junit.Before;

import Services.PersonOcupation;
import domain.Person;
import junit.framework.Assert;

/**
 * Created by Cant-Detect on 2016/03/13.
 */


public class testPerson {
    private PersonOcupation ocupation;
    Person data;
    @Before
    public void setUp() throws Exception {
        data = ocupation.getPersonDescription();
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testName() throws Exception {

        System.out.println(" The Name is "+ ocupation.getPersonDescription().getName());
        Assert.assertEquals(data.getName(),"Aphiwe");
    }

    @Test
    public void testSurname() throws Exception {
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
