package test.org.wojcieszko.dijkstra;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.wojcieszko.dijkstra.Dijkstra;

/**
 * Graph Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>sie 5, 2018</pre>
 */
public class DijkstraTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: setNeighbours(int nodeIndex, int neighbourIndex)
     */
    @Test
    public void testGraph() throws Exception {
        Dijkstra dijkstra = new Dijkstra (10);
        Assert.assertNotNull(dijkstra);
    }

    @Test
    public void testSetNeighbours() throws Exception {

        Dijkstra dijkstra = new Dijkstra(10);
        dijkstra.setNeighbours(2, 3, 5);
        Assert.assertEquals(5, dijkstra.neighbours.get(2).get(3), 0.01);
    }

    @Test
    public void testGraph2() throws Exception {

        Dijkstra dijkstra = new Dijkstra(9);
        dijkstra.setNeighbours(0, 1, 2);
        dijkstra.setNeighbours(2, 2, 7);
        dijkstra.setNeighbours(0, 3, 5);
        dijkstra.setNeighbours(0, 4, 20);
        dijkstra.setNeighbours(3, 4, 10);
        dijkstra.setNeighbours(3, 7, 2);
        dijkstra.setNeighbours(7, 8, 2);
        dijkstra.setNeighbours(8, 5, 1);
        dijkstra.setNeighbours(4, 5, 1);
        dijkstra.setNeighbours(5, 6, 2);
        Assert.assertEquals(12, dijkstra.findLowestCostPath(0, 6), 0.01);
    }

    @Test
    public void testGraph3() throws Exception {

        Dijkstra dijkstra = new Dijkstra(9);
        dijkstra.setNeighbours(0, 1, 2);
        dijkstra.setNeighbours(2, 2, 7);
        dijkstra.setNeighbours(0, 3, 5);
        dijkstra.setNeighbours(0, 4, 20);
        dijkstra.setNeighbours(3, 4, 10);
        dijkstra.setNeighbours(3, 7, 2);
        dijkstra.setNeighbours(7, 8, 2);
        dijkstra.setNeighbours(8, 5, 1);
        dijkstra.setNeighbours(4, 5, 1);
        dijkstra.setNeighbours(5, 6, 2);
        dijkstra.setNeighbours(3, 0, -18);
        Assert.assertEquals(12, dijkstra.findLowestCostPath(0, 6), 0.01);
    }
    /**
     * Method: setValue(int nodeIndex, int value)
     */
    @Test
    public void testSetValueForNodeIndexValue() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: getValue()
     */
    @Test
    public void testGetValue() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: setValue(int value)
     */
    @Test
    public void testSetValueValue() throws Exception {
//TODO: Test goes here... 
    }


} 
