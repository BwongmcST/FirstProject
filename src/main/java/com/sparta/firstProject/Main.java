package com.sparta.firstProject;

import com.sparta.firstProject.controller.SortController;
import com.sparta.firstProject.view.SortView;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //int[] testArrayBubble = Arrays.copyOf(testArray, testArray.length);
        //int[] testArrayMerge = Arrays.copyOf(testArray, testArray.length);

        SortView sortView = new SortView();
        String sortMethod = sortView.getSortMethod();
        SortController sortController = new SortController();
        //String result = sortController.sorting();

        }

}
