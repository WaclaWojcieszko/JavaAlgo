package test.org.wojcieszko.interpolationSearch;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.wojcieszko.interpolationSearch.InterpolationSort;

import java.util.ArrayList;

/**
 * InterpolationSort Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>sie 18, 2018</pre>
 */
public class InterpolationSortTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: searchValue(int value)
     */
    @Test
    public void testSearchValue() throws Exception {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(0);
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);
        arrayList.add(7);

        InterpolationSort interpolationSort = new InterpolationSort(arrayList);


        Assert.assertNull(interpolationSort.searchValue(-1));
    }

    @Test
    public void testSearchValue2() throws Exception {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(0);
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(499);
        arrayList.add(997);
        arrayList.add(998);
        arrayList.add(999);

        InterpolationSort interpolationSort = new InterpolationSort(arrayList);


        Assert.assertNull(interpolationSort.searchValue(-1));
    }

    @Test
    public void testSearchValue3() throws Exception {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(0);
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(499);
        arrayList.add(997);
        arrayList.add(998);
        arrayList.add(999);

        InterpolationSort interpolationSort = new InterpolationSort(arrayList);


        Assert.assertNull(interpolationSort.searchValue(-1));
        Assert.assertEquals(0, interpolationSort.searchValue(0).intValue());
        Assert.assertEquals(2, interpolationSort.searchValue(2).intValue());
        Assert.assertNull(interpolationSort.searchValue(500));
        Assert.assertEquals(4, interpolationSort.searchValue(499).intValue());
        Assert.assertEquals(6, interpolationSort.searchValue(998).intValue());
        Assert.assertEquals(7, interpolationSort.searchValue(999).intValue());
        Assert.assertNull(interpolationSort.searchValue(1000));
    }


} 
