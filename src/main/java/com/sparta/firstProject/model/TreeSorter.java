package com.sparta.firstProject.model;

public class TreeSorter implements Sorter {
   Node node;

    public static void main(String[] args) {
        int[] arr = {50, 30, 70, 15, 7, 62, 22, 35, 87, 22};
        TreeSorter treeSorter = new TreeSorter();
        treeSorter.sort(arr);
    }


    @Override
    public String sort(int[] intArray) {
        node = new Node(intArray[0]);
        for(int i:intArray){
            insertNode(node, i);
        }
        sortNode(node);
        return null;
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

    public void sortNode(Node node){
        if(node != null){
            sortNode(node.left);
            System.out.printf(node.value + " ");
            sortNode(node.right);
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
