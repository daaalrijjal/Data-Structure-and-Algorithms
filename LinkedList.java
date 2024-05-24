public class LinkedList {
    Node head; //head is enough to go through the whole list
    Node tail; //if list empty head and tail null

    int n; 
    public LinkedList(){
        head=null;
        tail=null;
        n=0;
    }

    //implement a stack(from the beggining)
    public void push(Object x){
        Node a=new Node();
        a.data=x;
        a.next=head;
        head= a;
        if(n==0){
            tail=a;   
        }
        n++;  //efficient O(1) constant number of operations regardless length of the list
    }

    public Object pop(){
        if(n==0)
        {
            return null;
        }
        Node a=head;
        head=head.next; //make head the address a is pointing to
        if(n==1){
            tail=null;
        }
        n--;
        return a.data;  //efficient O(1)
    }

    public void enque(Object x){
        Node a=new Node();
        a.data=x;
        a.next=null;
        if (head==null) {
            head = a;
            tail = a;
        } else {
            tail.next = a;
            tail = a;
        }
        n++;
    }

    public Object deque(){
        if(n==0)
        {
            return null;
        }
        Node a=head;
        head=head.next;
        if(n==1){
            tail=null;
        }
        n--;
        return a.data;  
    }

}
