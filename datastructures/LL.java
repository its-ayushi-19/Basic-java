package datastructures;

public class LL {
    Node head;
    private int size;

    LL() {
        this.size = 0;
    }

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    public void addfirst(String data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while(current.next != null) {
            current = current.next;
        }
        current.next = newNode;  
    } 

    public void printlist() {
        Node current = head;
        while(current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("NULL");
    }

//delete first
public void deletefirst() {
    if(head == null) {  
        System.out.println("List is empty");
        return;
    }       
    size--;
    head = head.next;
}

//delete last
public void deletelast() {
    if(head == null) {
        System.out.println("List is empty");
        return;
    }
    size--;
    if(head.next == null) {
        head = null;
        return;
    }
    Node secondlast = head;    
    Node lastnode = head.next;
    while(lastnode.next != null) {
         lastnode = lastnode.next;
         secondlast = secondlast.next;
    }  
    secondlast.next = null;       
}

public int getsize() {
    return size;
}
    //reverse a linked list iteratively
    public void reverseiterate(){
        if(head==null|| head.next==null){
            return;
        }
        Node prevnode = head;
        Node currnode = head.next;
        while(currnode!=null){
            Node nextnode = currnode.next;
            currnode.next=prevnode;
        
            //update
            prevnode=currnode;
            currnode=nextnode;
        }
        head.next=null;
        head=prevnode;

  
}

//reverse of linked list recursively
public Node reverseRecursive(Node head){
    if(head == null || head.next == null){
return head;
    }
    Node newHead = reverseRecursive(head.next);
    head.next.next=head;
    head.next=null;
    return newHead;
}

   



public static void main(String args[]) {
        LL list = new LL();
        list.addfirst("is");
        list.addfirst("This");
        list.addLast("list");
        list.printlist();
//         list.deletefirst();
//         list.printlist();
//         list.deletelast();
//         list.printlist();
//         System.out.println("Size: " + list.getsize());
//          list.addfirst("is");       
    //  list.reverseiterate();
     //  list.printlist();

        list.head = list.reverseRecursive(list.head);
        list.printlist();
     }
} 
