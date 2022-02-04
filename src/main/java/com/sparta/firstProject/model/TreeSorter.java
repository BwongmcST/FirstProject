package com.sparta.firstProject.model;

import java.util.ArrayList;
import java.util.List;

public class TreeSorter implements Sorter {
   Node node;
   List<Integer> outPutIntegerList = new ArrayList<Integer>();

    @Override
    public String sort(int[] intArray) {

        node = new Node(intArray[0]);
        for(int i:intArray){
            insertNode(node, i);
        }
        sortNodes(node);
        return outPutIntegerList.toString();
    }

    public Node insertNode(Node node, int value) {
        if(node == null){
            return new Node(value);
        }
        if(value < node.value){
            node.left = insertNode(node.left, value);
        }
        else if(value >node.value){
            node.right = insertNode(node.right,value);
        }
    return node;
    }

    public void sortNodes(Node node){
        if(node != null){
            sortNodes(node.left);
            outPutIntegerList.add(node.value);
            sortNodes(node.right);
        }
    }

class Node{
    int value;
    Node left;
    Node right;
    Node(int value){
        this.value = value;
        left = null;
        right = null;
    }

}

}
