package main.day10;

public class Node {
    private int value;
    private Node leftChild;
    private Node rightChild;

    public int getValue() {
        return value;
    }

    public void setValue(int value){
        this.value = value;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public Node getRightChild() {
        return rightChild;
    }

    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }

    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }

    @Override
    public String toString() {
        return "Node{" + "value = " + value + ", leftChild = " + leftChild + ", rightChild = " + rightChild + "}";
    }
}
