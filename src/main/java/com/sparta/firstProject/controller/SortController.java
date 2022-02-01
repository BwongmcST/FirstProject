package com.sparta.firstProject.controller;
import com.sparta.firstProject.model.BubbleFactory;
import com.sparta.firstProject.model.MergeFactory;
import com.sparta.firstProject.model.Sorter;
import com.sparta.firstProject.model.SorterFactory;

public class SortController {

    public void sorting(String sortMethod){

        int[] testArray = {110,22,62,31,66,71,398,1,69,200,70};
        Sorter sorter = getSortMethod(sortMethod);
        sorter.sort(testArray);
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
