package common.facade;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by zhangxuekui on 2017/9/15.
 */
public class ABCTest {

    @Test
    public void testA() throws Exception {
        TestABC abc = new TestABC();
        System.out.printf("Sample Service Result = " + abc.printA());
        Assert.assertTrue(abc.printA().equalsIgnoreCase("A") );
    }


    @Test
    public void testB() throws Exception {
        TestABC abc = new TestABC();
        System.out.printf("Sample Service Result = " + abc.printB());
        Assert.assertTrue(abc.printB().equalsIgnoreCase("A") );
    }


    @Test
    public void testC() throws Exception {
        TestABC abc = new TestABC();
        System.out.printf("Sample Service Result = " + abc.printC());
        Assert.assertTrue(abc.printC().equalsIgnoreCase("C") );
    }
}
