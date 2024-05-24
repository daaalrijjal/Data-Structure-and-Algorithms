public class BinarySearchTree {
    BSTNode root;

    public void insert(int key){
        root=insert(root, key);
    }

    public BSTNode insert(BSTNode n,int key){ //node type because return node
        if(n==null){
            return new BSTNode(key);
        }
        else if(n.data>key){
            n.left=insert(n.left, key);
            return n;
        }
        else{
            n.right=insert(n.right, key);
            return n;
        }
    }

    public int search(int key){
        return search(root, key);
    }

    public int search(BSTNode n, int key){ 
        if(n==null){
            return -1;
        }
        else if(n.data==key){ 
            return n.data;
        }
        else if(n.data>key){
            return search(n.left, key);
        }
        else{
            return search(n.right,key);
        }
    }

    public void inOrder(){
        inOrder(root);
    }

    public void inOrder(BSTNode n){
        if(n==null){
            return; //break the condition
        } else{
            inOrder(n.left);
            System.out.println(n.data+ " ");
            inOrder(n.right);
        }
    }

    public int findMaxValue() {
        BSTNode current = root;
        while (current.right != null) {
            current = current.right;
        }
        return current.data;
    }
    public static void main(String[] args) {
        BinarySearchTree b =new BinarySearchTree();
        b.insert(5);
        b.insert(10);
        b.insert(20);
        b.insert(13);
        b.insert(15);
        b.insert(27);

        System.out.println(b.findMaxValue());

        b.inOrder(b.root);
        System.out.println(b.search(13)); 
        System.out.println(b.search(9)); 
    }

    }

