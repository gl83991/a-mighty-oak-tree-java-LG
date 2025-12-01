package org.example;

public class Node {
    private Squirrel data;
    private Node leftChild;
    private Node rightChild;

    public Node(Squirrel data) {
        this.data = data;
        this.leftChild = null;
        this.rightChild = null;
    }

    public void set_left(Node node) {
        this.leftChild = node;
    }

    public void set_right(Node node) {
        this.rightChild = node;
    }

    public Node right() {
        return this.rightChild;
    }

    public Node left() {
        return this.leftChild;
    }

    public Squirrel getData() {
        return this.data;
    }
}
