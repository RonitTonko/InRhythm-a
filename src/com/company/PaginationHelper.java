package com.company;

import java.util.Arrays;
/**
 * PaginationHelper is a class which represents items and how many items will be
 * allowed per each page
 *
 * @author  Ronit Tonkonogi
 * @since   2021-03-28
 */
public class PaginationHelper {

    private int itemsPerPage;
    private char[] items;
    private int pageCount;
    private int totalItems;
    private int lastPageItems;

    /** Creates an Pagination Helper with the specified array and items per page value.
     *
     * @param items This is an array which contains the items.
     * @param itemsPerPage this is the value which indicates how many items will be
     * allowed per each page.
     */
    public PaginationHelper(char[] items, int itemsPerPage) {
        this.itemsPerPage = itemsPerPage;
        this.items = Arrays.copyOf(items, items.length);
        this.totalItems = items.length;
        pageCount = this.pageCount();
    }

    /**
     * <p>The method returns the total number of the elements in the array. </p>
     *
     * @return total number of the elements in the array.
     */
    public int itemCount(){
        return totalItems;
    }

    /**
     * <p>The method calculates how many items are allowed for each page,
     * and returns the total number of pages.</p>
     *
     * @return the number of pages
     */
    public int pageCount() {
        if(itemsPerPage <= 0)
            return -1;

        return  (int)Math.ceil(totalItems / (double)itemsPerPage);
    }


    /**
     * <p>The method calculates and returns the number of the items of the received page's index.
     *  The method returns -1 for pageIndex values that are out of range</p>
     *
     * @return number of the items of the received page's index.
     * @param pageIndex This is the page index for which the method calculates the number of items on it.
     *                  pageIndex is zero based.
     */
    public int pageItemCount(int pageIndex){
        if((pageIndex < 0) || (pageIndex >= pageCount)){
            return -1;
        }

        if (pageIndex == pageCount - 1){
            lastPageItems = totalItems % itemsPerPage;
            return lastPageItems == 0 ? itemsPerPage : lastPageItems;
        }
        else
            return itemsPerPage;
    }

    /**
     * <p>The method calculates and returns the page index which itemIndex is on.
     * The method returns -1 for itemIndex values that are out of range</p>
     *
     * @return the index of page which the item index is on.
     * @param itemIndex This is the index of the item that the method is calculating the page index for.
     *                  itemIndex is zero based.
     */
    public int pageIndex(int itemIndex){
        if((itemIndex < 0) || (itemIndex >= totalItems)){
            return -1;
        }

        return  (int)Math.floor(itemIndex / (double)itemsPerPage);
    }
}
