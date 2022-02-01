package com.sparta.firstProject.model;

public class BubbleFactory extends SorterFactory {

    @Override
    public Sorter getInstance(){
        return new BubbleSorter();
    }
}
