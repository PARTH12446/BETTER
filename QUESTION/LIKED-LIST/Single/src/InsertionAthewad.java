class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }
}
public class InsertionAthewad {
    public static Node insert(Node head,int data){
        if(head == null){
            return null;
        }
        Node newNode = new Node(data);
        newNode.next = head;
        return newNode;
    }
}
