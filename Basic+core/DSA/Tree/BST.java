package Tree;

// BST = Binary Search Tree

public class BST {
    public static void main(String[] args) {
        
        BSTRunnable tree = new BSTRunnable();
        tree.insert(8);
        tree.insert(7);
        tree.insert(12);
        tree.insert(15);
        tree.insert(2);
        tree.insert(5);


        tree.InOrder();
        tree.PreOrder();
    }
}
