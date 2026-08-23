package linkedlist;



public class ConvertArr2LL {
	public static Node converting(int[] arr) {
		Node head=new Node(arr[0]);
		Node mover =head;
		for(int i=0;i<arr.length;i++) {
			Node temp=new Node(arr[i]);
			mover.next=temp;
			mover=temp;
		}
		return head;
	}
public static void main(String[] args) {
	int[] arr = {2,4,5,3,5};
	Node head=converting(arr);
	System.out.println(head.data);
}
}
