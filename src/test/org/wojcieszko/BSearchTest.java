package test.org.wojcieszko;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.wojcieszko.BSearch;

import java.util.ArrayList;

/**
 * BSearch Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>cze 2, 2018</pre>
 */
public class BSearchTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: bSearch()
     */
    @Test
    public void testBSearch() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: fill()
     */
    @Test
    public void testFill() throws Exception {

        ArrayList arr = new ArrayList();
        BSearch bSearch = new BSearch(arr);
        bSearch.fill();

        System.out.println(bSearch.getData().toString());

    }

    /**
     * Method: find(int t)
     */
    @Test
    public void testFind() throws Exception {

        ArrayList arr = new ArrayList();
        BSearch bSearch = new BSearch(arr);
        bSearch.fill();
        int searched = bSearch.data.get(2);
        int found = bSearch.find(searched);

        System.out.println(bSearch.getData().toString());
        System.out.println(searched);
        System.out.println(found);

    }


    @Test
    public void testFind01() throws Exception {

        ArrayList arr = new ArrayList();
        BSearch bSearch = new BSearch(arr);
        bSearch.fill();
        int searched = -5;
        int found = bSearch.find(searched);

        System.out.println(bSearch.getData().toString());
        System.out.println(searched);
        System.out.println(found);

    }

    @Test
    public void testFind02() throws Exception {

        ArrayList arr = new ArrayList();
        BSearch bSearch = new BSearch(arr);
        bSearch.fill();
        int searched = 10000;
        int found = bSearch.find(searched);

        System.out.println(bSearch.getData().toString());
        System.out.println(searched);
        System.out.println(found);

    }

    @Test
    public void testFind03() throws Exception {

        ArrayList arr = new ArrayList();
        BSearch bSearch = new BSearch(arr);
        bSearch.fill();
        int searched = 100;
        int found = bSearch.find(searched);

        System.out.println(bSearch.getData().toString());
        System.out.println(searched);
        System.out.println(found);

    }

    @Test
    public void testFind05() throws Exception {

        ArrayList arr = new ArrayList();
        BSearch bSearch = new BSearch(arr);
        bSearch.fill();
        int searched = bSearch.data.get(0);
        int found = bSearch.find(searched);

        System.out.println(bSearch.getData().toString());
        System.out.println(searched);
        System.out.println(found);

    }

    @Test
    public void testFind06() throws Exception {

        ArrayList arr = new ArrayList();
        BSearch bSearch = new BSearch(arr);
        bSearch.fill();
        int searched = bSearch.data.get(bSearch.data.size() - 1);
        int found = bSearch.find(searched);

        System.out.println(bSearch.getData().toString());
        System.out.println(searched);
        System.out.println(found);

    }

}
