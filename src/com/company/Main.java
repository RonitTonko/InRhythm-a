package com.company;

import org.junit.Test;

import java.lang.reflect.Array;

public class Main {

    public static void main(String[] args) {
	// write your code here
        char[] array = {'a','b','c','d','e','f','g'};
        PaginationHelper helper = new PaginationHelper(array,6);

        System.out.println(helper.itemCount());
        System.out.println(helper.pageCount());
        System.out.println(helper.pageItemCount(3));
        System.out.println(helper.pageIndex(6));




    }

}
