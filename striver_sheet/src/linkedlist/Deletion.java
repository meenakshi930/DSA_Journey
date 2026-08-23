package linkedlist;

public class Deletion {
	private static Node removehead(Node head) {
		if(head==null) {
			return head;
		}
		head=head.next;
		return head;
	}
	private static Node removetail(Node head) {
		if(head==null ||head.next==null) {
			return null;
		}
		Node temp=head;
		while(temp.next.next!=null) {
			temp=temp.next;
		}
		temp.next=null;
		return head;
	}
	private static Node removeK(Node head, int k) {
		if(head==null) {
			return head;
		}
		if(k==1) {
			Node temp=head;
			head=head.next;
			return head;
		}
		Node temp=head;
		Node prev=null;
		int count=0;
		while(temp!=null) {
			count++;
			if(count==k) {
				prev.next=prev.next.next;
				break;
			}
			prev=temp;
			temp=temp.next;
			
		}
		return head;
	}
	public static void main(String[] args) {
		Node head=new Node(10);
		head.next=new Node(20);
		head.next.next=new Node(30);
		head.next.next.next=new Node(40);
		head.next.next.next.next=new Node(50);
		head= removehead(head);
		head=removetail(head);
		head=removeK(head,3);
		Traversal.traversalList(head);
		
	}

}
