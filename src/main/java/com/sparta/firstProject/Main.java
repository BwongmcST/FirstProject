package com.sparta.firstProject;

import com.sparta.firstProject.model.*;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] testArray = {110,22,62,31,66,71,398,1,69,200,70};
        Scanner scanner = new Scanner(System.in);
        String sortMethod = scanner.next();
        int[] testArrayBubble = Arrays.copyOf(testArray, testArray.length);
        int[] testArrayMerge = Arrays.copyOf(testArray, testArray.length);

        Sorter sorter = getSortMethod(sortMethod);
        sorter.sort(testArray);
        System.out.println(Arrays.toString(testArray));
        }


        public static Sorter getSortMethod(String sortMethod) {

        SorterFactory sf = switch (sortMethod.toLowerCase()){
            case "bubble" -> new BubbleFactory();
            case "merge" -> new MergeFactory();
            default -> null;
        };
            return sf.getInstance();
    }

}
