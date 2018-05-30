package test.org.wojcieszko.chess;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.wojcieszko.chess.Chess;

import java.util.Arrays;

/** 
* Chess Tester. 
* 
* @author <Authors name> 
* @since <pre>maj 19, 2018</pre> 
* @version 1.0 
*/ 
public class ChessTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: towerMoves(int[] position) 
* 
*/ 
@Test
public void testTowerMoves() throws Exception {
//TODO: Test goes here...

int[] position = {4, 3};

Chess chess = new Chess();

chess.towerMoves(position);

System.out.print(Arrays.toString(chess.arrayList.toArray()));
} 


} 
