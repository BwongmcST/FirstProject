package com.sparta.firstProject.view;

import com.sparta.firstProject.model.RandomIntGenerator;

import java.util.Arrays;
import java.util.Scanner;

public class SortView {

    public int[] getIntArray(){
        RandomIntGenerator randomIntGenerator = new RandomIntGenerator();
        System.out.printf("Please input array length: ");
        Scanner scanner = new Scanner(System.in);
        int inputLength = scanner.nextInt();
        System.out.println("Integer array generated: ");
        int[] intArray = randomIntGenerator.generateInt(inputLength);
        System.out.printf(Arrays.toString(intArray));
        return intArray;
    }

    public String getSortMethod(){
        System.out.println("Please enter sort method (bubble/merge): ");
        Scanner scanner = new Scanner(System.in);
        String sortMethod = scanner.next();
        return sortMethod;
    }

    public void displaySortResult(String result){
        System.out.println(result);
    }
}
