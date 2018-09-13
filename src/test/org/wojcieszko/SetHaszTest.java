package test.org.wojcieszko; 

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.wojcieszko.SetHasz;

/** 
* SetHasz Tester. 
* 
* @author <Authors name> 
* @since <pre>cze 2, 2018</pre> 
* @version 1.0 
*/ 
public class SetHaszTest { 

@Before
public void before() throws Exception { 
}

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: add(T data) 
* 
*/ 
@Test
public void testAdd() throws Exception {

    SetHasz<Integer> setHasz = new SetHasz<>();
    setHasz.add(12);
    Assert.assertTrue(setHasz.find(12));

}

    @Test
    public void testAdd02() throws Exception {

        SetHasz<Integer> setHasz = new SetHasz<>();

        for (int i = 0; i < 250000; ++i){
            setHasz.add((int) (Math.random() * 1024 * 1024));
        }
        setHasz.add(12);
        Assert.assertTrue(setHasz.find(12));

        for (int i = 0; i < setHasz.topList.size(); ++i) {
            System.out.println(setHasz.topList.get(i).size());
        }

    }


} 
