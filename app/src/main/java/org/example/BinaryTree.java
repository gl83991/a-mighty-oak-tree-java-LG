package org.example;

public class BinaryTree {
    private Node root;

    public void setRoot(Node node) {
        this.root = node;
    }

    public BinaryTree() {
        this.root = null;
    }

    public void traverse() {
        if (this.root ==null) {
            System.out.println("The tree is empty.");
            return;
        }

        System.out.println("Root: " + this.root.getData().getName());

        if (root.left() != null) {
            System.out.println("Left Child: " + this.root.left().getData().getName());
        }

        if (root.right() != null) {
            System.out.println("Right Child: " + this.root.right().getData().getName());
        }
    }

}
