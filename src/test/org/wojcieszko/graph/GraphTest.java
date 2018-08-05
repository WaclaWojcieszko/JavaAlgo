package test.org.wojcieszko.graph;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.wojcieszko.graph.Graph;

/**
 * Graph Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>sie 5, 2018</pre>
 */
public class GraphTest {

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
        Graph graph = new Graph(10);
        Assert.assertNotNull(graph);
    }

    @Test
    public void testSetNeighbours() throws Exception {

        Graph graph = new Graph(10);
        graph.setNeighbours(2, 3);
        Assert.assertEquals(true, graph.neighbours.get(2).get(3));
    }

    @Test
    public void testGraph2() throws Exception {

        Graph graph = new Graph(8);
        graph.setNeighbours(0, 1);
        graph.setNeighbours(0, 2);
        graph.setNeighbours(0, 3);
        graph.setNeighbours(2, 4);
        graph.setNeighbours(2, 2);
        graph.setNeighbours(5, 6);
        graph.setNeighbours(6, 7);
        Assert.assertEquals(true, graph.neighbours.get(0).get(1));
    }

    @Test
    public void testGraph3() throws Exception {

        Graph graph = new Graph(8);
        graph.setNeighbours(0, 1);
        graph.setNeighbours(0, 2);
        graph.setNeighbours(0, 3);
        graph.setNeighbours(2, 4);
        graph.setNeighbours(2, 2);
        graph.setNeighbours(5, 6);
        graph.setNeighbours(6, 7);
        Assert.assertEquals(true, graph.findPath(0, 4));
    }

    @Test
    public void testGraph4() throws Exception {

        Graph graph = new Graph(8);
        graph.setNeighbours(0, 1);
        graph.setNeighbours(0, 2);
        graph.setNeighbours(0, 3);
        graph.setNeighbours(2, 4);
        graph.setNeighbours(2, 2);
        graph.setNeighbours(5, 6);
        graph.setNeighbours(6, 7);
        Assert.assertEquals(false, graph.findPath(4, 0));
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
