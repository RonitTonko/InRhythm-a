package com.company;

import org.junit.Assert;
import org.junit.Test;

public class Tests {
    char[] array = {'a', 'b', 'c', 'd', 'e', 'f'};
    PaginationHelper helper = new PaginationHelper(array, 4);

    @Test
    public void isItemCountMethodEqualsArrayLength() {
        Assert.assertEquals(helper.itemCount(), array.length);
    }

    @Test
    public void pageCountTest1() {
        Assert.assertEquals(helper.pageCount(), 2);
    }
    // Checks that the page number isn't equals to the wrong page number
    @Test
    public void pageCountTestIsNotWrong() {
        Assert.assertNotEquals(helper.pageCount(), 4);
    }

    @Test
    public void pageItemCountTest1() {
        Assert.assertEquals(helper.pageItemCount(0), 4);
    }

    @Test
    public void pageItemCountTest2() {
        Assert.assertEquals(helper.pageItemCount(1), 2);
    }
    //Checks if the result equals -1 when the page is invalid
    @Test
    public void pageItemCountNegativeTest() {
        Assert.assertEquals(helper.pageItemCount(2), -1);
    }

    @Test
    public void pageIndexTest1() {
        Assert.assertEquals(helper.pageIndex(5), 1);
    }

    @Test
    public void pageIndexTest2() {
        Assert.assertEquals(helper.pageIndex(2), 0);
    }
    @Test
    public void pageIndexTooBigTest() {
        Assert.assertEquals(helper.pageIndex(20), -1);
    }

    @Test
    public void pageIndexTooSmallTest() {
        Assert.assertEquals(helper.pageIndex(-10), -1);
    }
}
