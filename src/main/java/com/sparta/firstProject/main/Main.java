package com.sparta.firstProject.main;

import com.sparta.firstProject.controller.SortController;
import com.sparta.firstProject.view.SortView;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static Logger logger = LogManager.getLogger("Sorter Logger");

    public static void main(String[] args) {
        logger.info("Launch sorting application");

        List<String> sortMethodList = new ArrayList<>();
        List<int[]> intArrayList = new ArrayList<>();
        SortController sortController = new SortController();

        SortView sortView = new SortView();
        int sortMethodAmount = sortView.getMethodsAmount();
        int[] intArray = sortView.getIntArray();

        for(int i =0; i<sortMethodAmount;i++) {
            sortMethodList.add(sortView.getSortMethod());
            intArrayList.add(intArray.clone());
        }
        for(int i = 0; i<sortMethodAmount; i++) {
            String result = sortController.sorting(sortMethodList.get(i), intArrayList.get(i));
            sortView.displaySortResult(result);
        }

        logger.info("End sorting application");
        }
}
