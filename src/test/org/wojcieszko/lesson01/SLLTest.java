package test.org.wojcieszko.lesson01;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.wojcieszko.lesson01.SLL;

/**
 * SLL Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>maj 12, 2018</pre>
 */
public class SLLTest {

    @Before
    public void before() throws Exception {

    }

    @After
    public void after() throws Exception {
    }

    @Test
    public void testSLLConstructor() {

        SLL<Integer> sll = new SLL<>();

    }

    @Test
    public void testSLLCountOfAppend3Obj() {

        SLL<Integer> sll = new SLL<>();

        Assert.assertEquals(0, sll.count());

        sll.append(3);

        Assert.assertEquals(1, sll.count());

        sll.append(2);

        Assert.assertEquals(2, sll.count());

    }

    @Test
    public void testSLLFind() {

        SLL<Integer> sll = new SLL<>();
        sll.append(3);
        sll.append(2);

        Assert.assertNotNull(sll.find(3));

    }

    @Test
    public void testSLLFindEnth() {

        SLL<String> sll = new SLL<>();
        sll.append(new SLL.Node("Ala"));
        sll.append(new SLL.Node("ma"));
        sll.append(new SLL.Node("Asa"));
        sll.append(new SLL.Node("Kier"));

        Assert.assertEquals("Ala", sll.findNth(0).getData());

    }

    @Test

    public void testSLLisnert() {

        SLL<String> sll = new SLL<>();
        sll.insert("Ala", null);
        Assert.assertEquals("Ala", sll.findNth(0).getData());

    }

    @Test

    public void testSLLinsert01() {

        SLL<String> sll = new SLL<>();
        sll.append("Ala");
        sll.append("Asa");
        sll.insert("ma", sll.find("Ala"));
        Assert.assertEquals("ma", sll.findNth(1).getData());

    }

    @Test
    public void testSLLdelete() {

        SLL<String> sll = new SLL<>();
        sll.append("Ala");
        sll.append("ma");
        sll.append("Asa");
        sll.append("Kier");
        sll.deleteNode(sll.find("Ala"));
        Assert.assertEquals("ma", sll.findNth(1).getData());

    }

    @Test
    public void testSLLdelete01() {

        SLL<String> sll = new SLL<>();
        sll.append(ala);
        sll.append("ma");
        sll.append("Asa");
        sll.append("Kier");
        sll.deleteNode(sll.find("ma"));
        Assert.assertEquals("Kier", sll.findNth(2).getData());

    }

    @Test
    public void testSLLdelete02() {

        SLL<String> sll = new SLL<>();
        sll.append("Ala");
        sll.append("ma");
        sll.append("Asa");
        sll.append("Kier");
        sll.deleteNode(sll.find("Asa"));
        Assert.assertNull(sll.findNth(3));

    }

    @Test
    public void testBeginAfter(){
        SLL<String> sll = new SLL<>();
        sll.append("Ala");
        sll.append("ma");
        sll.append("Asa");
        sll.append("Kier");

        sll.beginAfter(sll.find("ma"));

        Assert.assertEquals(sll.find("Asa"), sll.findNth(0));

        Assert.assertEquals(sll.find("Ala"), sll.findNth(2));

        Assert.assertEquals(sll.find("ma"), sll.findNth(3));

        Assert.assertNull(sll.findNth(4));

    }

}


