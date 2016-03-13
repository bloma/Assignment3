/**
 * Created by Cant-Detect on 2016/03/13.
 */
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class CollectionClassTest {

    CollectionClass list;
    @Before
    public void setUp() throws Exception {

        list = new CollectionClass();

    }

    @After
    public void tearDown() throws Exception {
        
    }

    @Test
    public void testColourList() throws Exception {

        Assert.assertEquals(list.colourList().get(0),"Black");
    }

    @Test
    public void testNamesSet() throws Exception {
        Assert.assertEquals(list.namesSet().size(),4);
    }

    @Test
    public void testphoneBook() throws Exception {

        Assert.assertEquals("Dog",list.phoneBook().get(1));
    }
}
