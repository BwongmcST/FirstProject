package com.sparta.firstProject.model;

public class MergeSorterInstance extends SorterInstance {

    @Override
    public Sorter getInstance(){
        return new MergeSorter();
    }

}
