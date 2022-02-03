package com.sparta.firstProject.model;

public class TreeFactory extends SorterFactory {

    @Override
    public Sorter getInstance(){
        return new TreeSorter();
    }

}
