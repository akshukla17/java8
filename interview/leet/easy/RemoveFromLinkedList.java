package interview.leet.easy;

public class RemoveFromLinkedList {

	public static void main(String[] args) {
		int a []= {6,6,1,6};
		Node head = Node.createLinkedListFromArray(a);
		System.out.println("Before removal");
		Node.printLinkedList(head);
		int value=6;
		Node res = removeLeet(head, value);
		System.out.println("After removal of value: "+value);
		Node.printLinkedList(res);
	}

	//***************Using DFS            ***************
	public Node removeElementsDFS(Node head, int value) {
        if(head == null) return head;
        if(head.data == value) return removeElementsDFS(head.next, value);
        if(head.next !=null && head.next.data == value)
            head.next = removeElementsDFS(head.next.next, value);
        head.next =  removeElementsDFS(head.next,value);
        return head;
    }
	
	//**********************Normal ********************************
	private static Node removeLeet(Node head, int value) {
		//create temp for current node you are on and prev for the previous node to temp
		Node cur = head;
		Node prev = null;
        
        //iterate through list
        while(cur != null){
            //if the node is both the head and has the target
            if(cur == head && cur.data == value){
                cur = cur.next;
                head = cur;
            } 
            //if the node has only the value
            else if(cur.data == value){
                prev.next = cur.next;
                cur = prev.next;
            } 
            //set prev to temp and temp to temp.next
            else{
                prev = cur;
                cur = cur.next;
            }
        }
        return head;
	}
	
	// TODO *************************************
	private static Node remove(Node head, int value) {
	
		return null;
	}
}
