package com.sparta.firstProject.view;

import com.sparta.firstProject.model.RandomIntGenerator;

import java.util.Arrays;
import java.util.Scanner;

public class SortView {

    public int[] getIntArray(){
        RandomIntGenerator randomIntGenerator = new RandomIntGenerator();
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Please input minimum value: ");
        int inputMin = scanner.nextInt();
        System.out.printf("Please input maximum value: ");
        int inputMax = scanner.nextInt();
        System.out.printf("Please input array length: ");
        int inputLength = scanner.nextInt();
        System.out.println("Integer array generated: ");
        int[] intArray = randomIntGenerator.generateInt(inputLength,inputMin,inputMax);
        System.out.println(Arrays.toString(intArray));
        return intArray;
    }

    public String getSortMethod(){
        System.out.printf("Please enter sort method (bubble/merge): ");
        Scanner scanner = new Scanner(System.in);
        String sortMethod = scanner.next();
        return sortMethod;
    }

    public void displaySortResult(String result){
        System.out.println(result);
    }
}
