package com.mydreamplus.java.kata;

import org.junit.Assert;
import org.junit.Test;

public class ArrayUtilTest {

    @Test
    public void testDedupStringArray() {
        String[] source = new String[] {"andy", "bob", "matt", "jim",
            "bill", "jacob", "bill", "andy", "bob", "bill", "bob", "bill"};

        String[] result = ArrayUtil.dedup(source);

        Assert.assertNotNull("Result should not be null", result);
        Assert.assertTrue("The length of result should be 6", result.length == 7);
    }

    @Test
    public void testDedupIntegerArray() {
        Integer[] source = new Integer[] {1, 2, 3, 4, 5, 6, 9, 1, 2, 3, 2, 3, 4};

        Integer[] result = ArrayUtil.dedup(source);

        Assert.assertNotNull("Result should not be null", result);
        Assert.assertTrue("The length of result should be 7", result.length == 7);
    }
}
