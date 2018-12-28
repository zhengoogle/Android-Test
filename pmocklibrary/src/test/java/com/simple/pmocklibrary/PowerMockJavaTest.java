package com.simple.pmocklibrary;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.modules.junit4.PowerMockRunner;
import org.powermock.reflect.Whitebox;

/**
 * PowerMock
 */
@RunWith(PowerMockRunner.class)
public class PowerMockJavaTest {
    @Test
    public void powerMockJavaTest() {
        PowerMockJava pmockJava = new PowerMockJava();
        // PowerMock WhiteBox
        try {
            // private
            Object res = Whitebox.invokeMethod(pmockJava, "getSumPrivate", 100, 100);
            Assert.assertEquals(200, (int) res);
            // default
            res = Whitebox.invokeMethod(pmockJava, "getSumDefault", 100, 100);
            Assert.assertEquals(200, (int) res);
            // protected
            res = Whitebox.invokeMethod(pmockJava, "getSumProtected", 100, 100);
            Assert.assertEquals(200, (int) res);
            // public
            res = Whitebox.invokeMethod(pmockJava, "getSumPublic", 100, 100);
            Assert.assertEquals(200, (int) res);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // access by class invoke
        // default
        Assert.assertEquals(200, pmockJava.getSumDefault(100, 100));
        // protected
        Assert.assertEquals(200, pmockJava.getSumProtected(100, 100));
        // public
        Assert.assertEquals(200, pmockJava.getSumPublic(100, 100));
    }
}
