package main.day10;

public class Tree {
    private Node rootNode;
    public Tree(){
        this.rootNode = null;
    }

    public void insertNode(int value){
        Node newNode = new Node();
        newNode.setValue(value);
        if(rootNode == null){
            rootNode = newNode;
        }
        else{
            Node currentNode = rootNode;
            Node parentNode;
            while (true){
                parentNode = currentNode;
                if (value == currentNode.getValue()) return;
                else if (value < currentNode.getValue()) {
                    currentNode = currentNode.getLeftChild();
                    if (currentNode == null){
                        parentNode.setLeftChild(newNode);
                        return;
                    }
                }
                else {
                    currentNode = currentNode.getRightChild();
                    if (currentNode == null){
                        parentNode.setRightChild(newNode);
                        return;
                    }
                }
            }
        }
    }

    public Node getRootNode() {
        return rootNode;
    }

    public void printInorder(Node node) {
        if (node == null) {
            return;
        }
        printInorder(node.getLeftChild());
        System.out.print(node.getValue() + " ");
        printInorder(node.getRightChild());
    }
}
