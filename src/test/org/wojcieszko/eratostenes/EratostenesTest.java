package test.org.wojcieszko.eratostenes;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.wojcieszko.eratostenes.Eratostenes;

/**
 * Eratostenes Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>cze 30, 2018</pre>
 */
public class EratostenesTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: create(int n)
     */
    @Test
    public void testCreate() throws Exception {

        Eratostenes eratostenes = new Eratostenes();


        eratostenes.create(1000);

//        eratostenes.bulkprint();
        eratostenes.print();

    }

    /**
     * Method: expand(boolean [] shortSito, int n)
     */
    @Test
    public void testExpand() throws Exception {
        Eratostenes eratostenes = new Eratostenes();


        eratostenes.create(12);

        eratostenes.print();

        eratostenes.expand(eratostenes.sito, 1000);

        eratostenes.print();



    }


} 
