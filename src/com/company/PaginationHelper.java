package com.company;

import java.util.Arrays;
/**
 * PaginationHelper is a class which
 *
 *
 * @author  Ronit Tonkonogi
 * @since   2021-03-28
 */
public class PaginationHelper {

    private int itemsPerPage;
    private char[] values;
    private int pageCount;
    private int totalItems;
    private int lastPageItems;

    public PaginationHelper(char[] values, int itemsPerPage) {
        this.itemsPerPage = itemsPerPage;
        this.values = Arrays.copyOf(values, values.length);
        this.totalItems = values.length;
        pageCount = this.pageCount();
    }

    /**
     * <p>The method returns the total number of the elements in the array </p>
     *
     * @return total number of the elements in the array
     */
    public int itemCount(){
        return totalItems;
    }

    public int pageCount() {
        if(itemsPerPage <= 0)
            return -1;

        return  (int)Math.ceil(totalItems / (double)itemsPerPage);
    }

    /**
     * returns the number of items on the current page. page_index is zero based.
     * this method should return -1 for pageIndex values that are out of range
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
/*page_index takes an item index and returns the page that it belongs on

 */
    public int pageIndex(int itemIndex){
        if((itemIndex < 0) || (itemIndex >= totalItems)){
            return -1;
        }

        return  (int)Math.floor(itemIndex / (double)itemsPerPage);
    }

}
