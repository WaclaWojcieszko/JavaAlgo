package test.org.wojcieszko.wielomianHorner; 

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;
import org.wojcieszko.wielomianHorner.MrHorner;

/** 
* MrHorner Tester. 
* 
* @author <Authors name> 
* @since <pre>lip 21, 2018</pre> 
* @version 1.0 
*/ 
public class MrHornerTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: getArr() 
* 
*/ 
@Test
public void testGetArr() throws Exception {
    MrHorner mrHorner = new MrHorner();

    float[] helloMrHorner = {1, -2, 1, 3};

    mrHorner.setArr(helloMrHorner);

    Assert.assertEquals(helloMrHorner, mrHorner.getArr());
} 

/** 
* 
* Method: setArr(float[] arr) 
* 
*/ 
@Test
public void testSetArr() throws Exception {

} 

/** 
* 
* Method: calculateMrHorn(float x) 
* 
*/ 
@Test
public void testCalculateMrHorn() throws Exception {
    MrHorner mrHorner = new MrHorner();

    float[] helloMrHorner = {1.f, -2.f, 1.f, 3.f};

    mrHorner.setArr(helloMrHorner);

    Assert.assertEquals(85.f, mrHorner.calculateMrHorner(3.f), .1);
} 


} 
