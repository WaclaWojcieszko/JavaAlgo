package test.org.wojcieszko.array;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.wojcieszko.array.MyArray;

/**
 * MyArray Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>maj 19, 2018</pre>
 */
public class MyArrayTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: resize(int newSize)
     */
    @Test
    public void testResize() throws Exception {
//TODO: Test goes here...

        MyArray<String> data = new MyArray<>();
        data.append("Ala");
        data.append("ma");
        data.append("Asa");
        data.append("Kier");

        data.resize(12);

        Assert.assertEquals("Kier", data.get(3));

        Assert.assertEquals(null, data.get(11));

    }

    /**
     * Method: append(T data)
     */
    @Test
    public void testAppend() throws Exception {

        MyArray<String> data = new MyArray<>();
        data.append("Ala");
        data.append("ma");
        data.append("Asa");
        data.append("Kier");

        Assert.assertEquals("Ala", data.get(0));


//TODO: Test goes here... 
    }

    @Test
    public void testInsert() throws Exception {

        MyArray<String> data = new MyArray<>();
        data.append("Ala");
        data.append("ma");
        data.append("Asa");
        data.append("Kier");

        data.insert(1, "chyba");

        Assert.assertEquals("Ala", data.get(0));
        Assert.assertEquals("chyba", data.get(1));
        Assert.assertEquals("Kier", data.get(4));


    }

    @Test
    public void testDelete() throws Exception {

        MyArray<String> data = new MyArray<>();
        data.append("Ala");
        data.append("ma");
        data.append("Asa");
        data.append("Kier");

        data.insert(1, "chyba");

        data.delete(3);

        Assert.assertEquals("Ala", data.get(0));
        Assert.assertEquals("chyba", data.get(1));
        Assert.assertEquals("Kier", data.get(3));



    }

} 
