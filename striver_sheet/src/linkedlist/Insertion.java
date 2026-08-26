package linkedlist;

public class Insertion {

    private static Node insertHead(Node head, int val) {

        Node temp = new Node(val);
        temp.next = head;

        return temp;
    }
    private static Node insertEnd(Node head,int val) {
    	if(head==null) {
    		return null;
    	}
    	Node temp=head;
    	while(temp.next!=null) {
    		temp=temp.next;
    	}
    	Node newNode=new Node(val);
    	 temp.next=newNode;
    	 return head;
    }
    private static Node insertPostition(Node head,int element,int k){
    	if(head==null) {
    		if(k==1) {
    			return new Node(element);
    		}
    		else {
    			return head;
    		}
    	}
    	if(k==1) {
    	return new Node(element);
    	}
    	int count=0;
    	Node temp=head;
    	while(temp!=null) {
    		count++;
    		if(count==(k-1)) {
    			Node newNode =new Node(element);
    			temp.next= newNode;
    			break;
    		}
    		temp=temp.next;
    	}
    	return head;
    }
    public static void main(String[] args) {

        Node head = new Node(10);

        head.next = new Node(20);

        head.next.next = new Node(30);

        head.next.next.next = new Node(40);

        head.next.next.next.next = new Node(50);

        head = insertHead(head, 100);
         head=insertEnd(head,2);
         head=insertPostition(head,18,4);

        Traversal.traversalList(head);
    }
}