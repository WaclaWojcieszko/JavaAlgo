package test.org.wojcieszko.change;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.wojcieszko.change.Change;

import java.util.ArrayList;
import java.util.List;

/** 
* Change Tester. 
* 
* @author <Authors name> 
* @since <pre>lip 15, 2018</pre> 
* @version 1.0 
*/ 
public class ChangeTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: getData() 
* 
*/ 
@Test
public void testGetData() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: setData(int[] data) 
* 
*/ 
@Test
public void testSetData() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: changeMoney(List<Integer> moneyLeft, int searched, List<ArrayList<Integer>> results, List<Integer> moneyChecked) 
* 
*/ 
@Test
public void testChangeMoney() throws Exception {
    Change change = new Change();
    List<Integer> money = new ArrayList<>();
    money.add(1);
    money.add(1);
    money.add(1);
    money.add(5);
    money.add(2);
    money.add(2);
    money.add(5);
    change.gimmeMyMoney(money, 6);
} 

/** 
* 
* Method: gimmeMyMoney() 
* 
*/ 
@Test
public void testGimmeMyMoney() throws Exception { 
//TODO: Test goes here... 
} 


} 
