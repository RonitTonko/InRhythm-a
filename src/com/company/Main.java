package com.company;

public class Main {
    public static void main(String[] args) {
        char[] array = {'a', 'b', 'c', 'd', 'e', 'f'};
        PaginationHelper helper = new PaginationHelper(array, 4);

        System.out.println(helper.itemCount());

        System.out.println(helper.pageCount());

        System.out.println(helper.pageItemCount(0));
        System.out.println(helper.pageItemCount(1));
        System.out.println(helper.pageItemCount(2));

        System.out.println(helper.pageIndex(5));
        System.out.println(helper.pageIndex(2));
        System.out.println(helper.pageIndex(20));
        System.out.println(helper.pageIndex(-10));
    }
}