package test.org.wojcieszko.achilles;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.wojcieszko.achilles.AchilllesVsTurtle;

/**
 * AchilllesVsTurtle Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>cze 24, 2018</pre>
 */
public class AchilllesVsTurtleTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: run(float turtleSpeed, float achilles, float distanceAT, float epsilon)
     */
    @Test
    public void testRun() throws Exception {

        float turtleSpeed = 1.0f;
        float achillesSpeed = 10.0f;
        float distanceAT = 100.0f;
        float epsilon = 1.E-6f;

        System.out.println(AchilllesVsTurtle.run(turtleSpeed, achillesSpeed, distanceAT, epsilon));

    }


} 
