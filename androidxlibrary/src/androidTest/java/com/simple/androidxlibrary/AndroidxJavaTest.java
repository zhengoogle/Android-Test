package com.simple.androidxlibrary;

import org.junit.Assert;
import org.junit.Test;
import org.powermock.reflect.Whitebox;

public class AndroidxJavaTest {
    @Test
    public void espressoJavaTest() {
        AndroidxJava espressoJava = new AndroidxJava();
        // PowerMock WhiteBox
        try {
            // private
            Object res = Whitebox.invokeMethod(espressoJava, "getSumPrivate", 100, 100);
            Assert.assertEquals(200, (int) res);
            // default
            res = Whitebox.invokeMethod(espressoJava, "getSumDefault", 100, 100);
            Assert.assertEquals(200, (int) res);
            // protected
            res = Whitebox.invokeMethod(espressoJava, "getSumProtected", 100, 100);
            Assert.assertEquals(200, (int) res);
            // public
            res = Whitebox.invokeMethod(espressoJava, "getSumPublic", 100, 100);
            Assert.assertEquals(200, (int) res);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // access by class invoke
        // default
        Assert.assertEquals(200, espressoJava.getSumDefault(100, 100));
        // protected
        Assert.assertEquals(200, espressoJava.getSumProtected(100, 100));
        // public
        Assert.assertEquals(200, espressoJava.getSumPublic(100, 100));
    }
}
