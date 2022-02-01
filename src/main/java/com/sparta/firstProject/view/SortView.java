package com.sparta.firstProject.view;

import java.util.Scanner;

public class SortView {

    public String getSortMethod(){
        System.out.printf("Please enter sort method (bubble/merge): ");
        Scanner scanner = new Scanner(System.in);
        String sortMethod = scanner.next();
        return sortMethod;
    }
}
