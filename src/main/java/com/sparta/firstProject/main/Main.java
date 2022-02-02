package com.sparta.firstProject.main;

import com.sparta.firstProject.controller.SortController;
import com.sparta.firstProject.view.SortView;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Main {
    public static Logger logger = LogManager.getLogger("Sorter Logger");

    public static void main(String[] args) {

        //int[] testArrayBubble = Arrays.copyOf(testArray, testArray.length);
        //int[] testArrayMerge = Arrays.copyOf(testArray, testArray.length);
        logger.debug("Launch sorting application");
        SortView sortView = new SortView();
        int[] intArray = sortView.getIntArray();
        String sortMethod = sortView.getSortMethod();
        SortController sortController = new SortController();
        String result = sortController.sorting(sortMethod,intArray);
        sortView.displaySortResult(result);

        }

}
