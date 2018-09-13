package test.org.wojcieszko.sqrt; 

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.wojcieszko.sqrt.Sqrt;

/** 
* Sqrt Tester. 
* 
* @author <Authors name> 
* @since <pre>cze 24, 2018</pre> 
* @version 1.0 
*/ 
public class SqrtTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: pow3(int number) 
* 
*/ 
@Test
public void testPow3() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: sqrt3(int number) 
* 
*/ 
@Test
public void testSqrt3() throws Exception {

    Assert.assertEquals(3, Sqrt.sqrt3(27));
    Assert.assertEquals(-1, Sqrt.sqrt3(7777));
    Assert.assertEquals(4, Sqrt.sqrt3(64));
    Assert.assertEquals(2, Sqrt.sqrt3(8));
    Assert.assertEquals(1, Sqrt.sqrt3(1));




}
    @Test
    public void testSqrt4() throws Exception {

        Assert.assertEquals(4, Sqrt.sqrt3(64));
    }

} 
