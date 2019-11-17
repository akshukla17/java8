package interview.leet.easy;

public class Node {

	int data;
	Node next;
	
	public Node(int d) {
		this.data=d;
		this.next =null;
	}

	public static Node createLinkedListFromArray(int[] a) {
		Node head = new Node(-1);
		Node t = head;
		for(int i=0;i<a.length;i++) {
			t.next = new Node(a[i]);
			t = t.next;
		}
		return head.next;
	}
	
	public static void printLinkedList(Node head) {
		while(head !=null) {
			System.out.print(head.data+" ");
			head = head.next;
		}
		System.out.println();
	}
}
