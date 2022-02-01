package com.sparta.firstProject.controller;
import com.sparta.firstProject.model.BubbleFactory;
import com.sparta.firstProject.model.MergeFactory;
import com.sparta.firstProject.model.Sorter;
import com.sparta.firstProject.model.SorterFactory;

import java.util.Arrays;

public class SortController {


    public String sorting(String sortMethod, int[] intArray){
        Sorter sorter = getSortMethod(sortMethod);
        sorter.sort(intArray);
        return Arrays.toString(intArray);
    }
    public Sorter getSortMethod(String sortMethod) {

        SorterFactory sf = switch (sortMethod.toLowerCase()){
            case "bubble" -> new BubbleFactory();
            case "merge" -> new MergeFactory();
            default -> null;
        };
        return sf.getInstance();
    }

}
