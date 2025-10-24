package Tree;

class Node {
    int data;
    Node left;
    Node right;

    public Node(int data){
        this.data = data;
    }
}

public class BSTRunnable {
    
    Node root;

    public void insert(int i){
        
        root = insertRec(root, i);
    }

    public Node insertRec(Node root, int data){
        if (root == null) {
            root = new Node(data);
        } else if(data < root.data){
            root.left = insertRec(root.left, data);
        }else if(data > root.data){
            root.right = insertRec(root.right, data);
        }
        return root;
    }

    public void InOrder(){
        System.out.print("In-Order :- " );
        InOrderRec(root);
        System.out.println();
    }
    public void InOrderRec(Node root){
        if (root != null) {
            InOrderRec(root.left);
            System.out.print(root.data + " ");
            InOrderRec(root.right);
        }
    }
    public void PreOrder(){
        System.out.print("Pre-order :- " );
        PreOrderRec(root);
    }
    public void PreOrderRec(Node root){
         if (root != null) {
             System.out.print(root.data + " ");
            InOrderRec(root.left);
            InOrderRec(root.right);
        }
    }
    public void PostOrder(){

    }
}
