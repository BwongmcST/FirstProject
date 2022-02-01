package com.sparta.firstProject.model;

public class MergeFactory extends SorterFactory {

    @Override
    public Sorter getInstance(){
        return new MergeSorter();
    }

}
