
package org.example;

public class App {
    public static void main(String[] args) {

        Squirrel cheeks = new Squirrel("Cheeks");
Node nodeOne = new Node(cheeks);
 
Squirrel squeaks = new Squirrel("Squeaks");
Node nodeTwo = new Node(squeaks);
 
Squirrel fluffybutt = new Squirrel("Mr. Fluffy Butt");
Node nodeThree = new Node(fluffybutt);
 
nodeOne.set_left(nodeTwo);
nodeOne.set_right(nodeThree);

BinaryTree tree = new BinaryTree();
tree.setRoot(nodeOne);
tree.traverse();
    }
}
