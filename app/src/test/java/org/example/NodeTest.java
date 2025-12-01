package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NodeTest {
    @Test
    public void testNodeStoresSquirrel() {
        Squirrel squirrel = new Squirrel("Chip");
        Node node = new Node(squirrel);
        assertEquals("Chip", node.getData().getName());
    }

    @Test
    public void testNodeChildren() {
        Squirrel parentSquirrel = new Squirrel("Parent");
        Squirrel leftSquirrel = new Squirrel("LeftChild");
        Squirrel rightSquirrel = new Squirrel("RightChild");

        Node parentNode = new Node(parentSquirrel);
        Node leftNode = new Node(leftSquirrel);
        Node rightNode = new Node(rightSquirrel);

        parentNode.set_left(leftNode);
        parentNode.set_right(rightNode);

        assertEquals("LeftChild", parentNode.left().getData().getName());
        assertEquals("RightChild", parentNode.right().getData().getName());
    }
    
    @Test
    public void testLeftAndRightBothSet() {
        Node parent = new Node(new Squirrel("Parent"));
        Node left = new Node(new Squirrel("Left"));
        Node right = new Node(new Squirrel("Right"));

        parent.set_left(left);
        parent.set_right(right);

        assertNotNull(parent.left());
        assertNotNull(parent.right());
        assertEquals("Left", parent.left().getData().getName());
        assertEquals("Right", parent.right().getData().getName());
    }
}
