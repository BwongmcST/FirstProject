package com.sparta.firstProject.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.sparta.firstProject.main.Main.logger;

public class TreeSorter implements Sorter {
   Node node;
   List<Integer> outPutIntegerList = new ArrayList<Integer>();
/*
    public static void main(String[] args) {
        int[] arr = {50, 30, 70, 15, 7, 62, 22, 35, 87};
        TreeSorter treeSorter = new TreeSorter();
        System.out.println(treeSorter.sort(arr));
    }

*/
    @Override
    public String sort(int[] intArray) {

        node = new Node(intArray[0]);
        for(int i:intArray){
            insertNode(node, i);
        }
        sortNodes(node);

        for(int i=0; i< intArray.length;i++){
            intArray[i] = outPutIntegerList.get(i);
        }
        logger.debug("Tree sort result: "+ Arrays.toString(intArray));
        return Arrays.toString(intArray);
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
            logger.debug("Tree sort progressing:"+node.value);
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
