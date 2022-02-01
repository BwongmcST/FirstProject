package com.sparta.firstProject.model;

public class BubbleSorterInstance extends SorterInstance {

    @Override
    public Sorter getInstance(){
        return new BubbleSorter();
    }
}
