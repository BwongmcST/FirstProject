package com.sparta.firstProject.controller;
import com.sparta.firstProject.model.*;

import java.util.Arrays;

import static com.sparta.firstProject.main.Main.logger;

public class SortController {


    public String sorting(String sortMethod, int[] intArray){
        logger.debug("Received sort method: " + sortMethod);
        logger.debug("int Array: " + Arrays.toString(intArray));
        Sorter sorter = getSortMethod(sortMethod);
        sorter.sort(intArray);
        return Arrays.toString(intArray);
    }
    public Sorter getSortMethod(String sortMethod) {

        SorterFactory sf = switch (sortMethod.toLowerCase()){
            case "bubble" -> new BubbleFactory();
            case "merge" -> new MergeFactory();
            case "tree" -> new TreeFactory();
            default -> null;
        };
        return sf.getInstance();
    }

}
