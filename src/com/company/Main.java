package com.company;

import org.junit.Assert;
import org.junit.Test;


public class Main {



   // public static void main(String[] args) {
        //char[] array = {'a', 'b', 'c', 'd', 'e', 'f'};
        //PaginationHelper helper = new PaginationHelper(array, 4);
//        System.out.println(helper.itemCount());
//        System.out.println(helper.pageCount());
//        System.out.println(helper.pageItemCount(3));
//        System.out.println(helper.pageIndex(6));


   // }

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
    @Test
    public void pageCountTest2() {
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

    @Test
    public void pageItemCountTest3() {
        Assert.assertEquals(helper.pageItemCount(2), -1);
    }



}
