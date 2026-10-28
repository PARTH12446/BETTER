public class insertatlast {
    public static Node insert(Node head,int data){
        if(head == null){
            return null;

        }
        while(head.next!=null){
            head = head.next;
        }
        Node temp = new Node(data);
        head.next= temp;
        return head;
    }
}
