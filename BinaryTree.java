public class BinaryTree {
    BinaryNode root;
    
    public int size(){//size isnt supposed to take anything to this method calls the recursion
        return size(root);
    }

    public int size(BinaryNode n){ //recursive method calling itself 
        if (n==null){
            return 0;
        }
        else{
            return 1+size(n.left)+size(n.right); 
        }
    }

    public int height(){
        return height(root);
    }

    public int height(BinaryNode n){
        if(n==null){
            return -1; //because a leaf node has height 0 so when its null and u add the -1 will become 0
        }
        else{
            return 1+ Math.max(height(n.left),height(n.right));//takes the maximum height and add 1 bc height of root is 1 more than the children

        }
    }

    public void getData() {
        getData(root); 
    }

    public void getData(BinaryNode n) {
        if(n!=null){
            // the left node
            getData(n.left);
            // Then print the data of the current node
            System.out.println(n.data);
            // the right node
            getData(n.right);
        }
    }

    //Traversal
    public void inOrder(){
        inOrder(root);
    }

    public void inOrder(BinaryNode n){
        if(n==null){
            return; //break the condition
        } else{
            inOrder(n.left);
            System.out.println(n.data+ " ");
            inOrder(n.right);
        }
    }

    public void preOrder(){
        preOrder(root);
    }

    public void preOrder(BinaryNode n){
        if(n==null){
            return; 
        } else{
            System.out.println(n.data+ " "); //calls the currect node so it start with root 
            preOrder(n.left);
            preOrder(n.right);
        }
    }

    public void postOrder(){
        postOrder(root);
    }

    public void postOrder(BinaryNode n){
        if(n==null){
            return; 
        } else{ 
            postOrder(n.left);
            postOrder(n.right);
            System.out.println(n.data+ " ");
        }
    }
    public static void main(String[] args) {

        BinaryNode n1=new BinaryNode();
        n1.data="A";
        BinaryNode n2=new BinaryNode();
        n2.data="B";
        BinaryNode n3=new BinaryNode();
        n3.data="C";
        BinaryNode n4=new BinaryNode();
        n4.data="D";
        BinaryNode n5=new BinaryNode();
        n5.data="E";
        BinaryNode n6=new BinaryNode();
        n6.data="F";

        BinaryTree b=new BinaryTree();

        b.root=n1;
        n1.left=n2;
        n1.right=n3;
        n2.left= n4;
        n2.right=n5;
        n3.left=n6;

        
        System.out.println(b.size());
        System.out.println(b.height());
        b.getData();
        b.inOrder();
        b.preOrder();
        b.postOrder();

    }
}
