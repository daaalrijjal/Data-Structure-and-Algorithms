public class DoubleLinkedList {
    int n;
    NodeDouble dummy;

    public DoubleLinkedList(){
        dummy=new NodeDouble();
        dummy.next=dummy;
        dummy.previous=dummy; //incase no other node except dummy
        n=0;
    }

//return node number i in the list to help access
public NodeDouble getNode(int i){
    NodeDouble m;
    if(i<(n/2)){ //if node closer to beginning of list
        m=dummy.next; //make m head and move next node
        for(int j=0; j<i;j++){
            m=m.next;
        }
    }else{ //node closer to end
        m=dummy.previous;
        for(int j=n-1; j>i;j--){
            m=m.previous;
        }
    }
    return m;
} //not so efficient not easy to access elements

public Object get(int i){
    NodeDouble n=getNode(i);
    return n.data;
}

public void set(int i,  Object x){
NodeDouble n=getNode(i);
n.data=x;
}

//efficient 0(1) but get makes it less efficent  
public void addBefore (NodeDouble w, Object x){ 
    NodeDouble u= new NodeDouble();
    u.data=x;
    u.previous=w.previous;
    u.next=w;
    u.next.previous=u;
    u.previous.next=u;
    n++;
}

//adding is efficient but get makes it less efficent  
public void add(int i, Object x){
    NodeDouble n=getNode(i);
    addBefore(n,x);
}

public void remove(NodeDouble w){ //O(1) remove node
    w.next.previous=w.previous;
    w.previous.next=w.next;
    n--;
}

public Object remove(int i){ //remove at position i
    NodeDouble n=getNode(i);
    remove(n);
    return n.data;
}


public void addFirst(Object x){
    addBefore(dummy.next, x);
}

public void addLast(Object x){
    addBefore(dummy, x); }


public Object removeFirst(){
    if(n > 0) {
        NodeDouble removedNode = dummy.next;
        remove(removedNode);
        return removedNode.data;
    } else {
        return null; 
    }
}

public Object removeLast(){
    if(n > 0) {
        NodeDouble removedNode = dummy.previous;
        remove(removedNode);
        return removedNode.data;
    } else {
        return null; 
    }
}

}