package LinkedList;

class Node{
	int data;
	Node next;
	public Node() {
		this.data = 0;
		this.next = null;
	}
	
	public Node(int d) {
		this.data = d;
		this.next = null;
	}
	
	public Node(int d,Node n) {
		this.data = d;
		this.next = n;
	}
	
	
}

public class SinglyLLIter {
	
	public Node conAlLL(int[] arr) {
		int n = arr.length;
		Node head = new Node(arr[0]);
		Node tail = head;
		for(int i=1;i<n;i++) {
			Node newnode = new Node(arr[i]);
			tail.next = newnode;
			tail = tail.next;
		
		}
		return head;
	}
	
	
	public void printList(Node head) {
		Node temp = head;
		while(temp != null) {
			System.out.println("array to ll --> "+temp.data);
			temp = temp.next;
		}
	}
	
	
	//delete front
	public Node deleteHead(Node head) {
		if(head == null) return null;
		Node temp = head;
		head = head.next;
		temp.next = null;
		return head;
	}
	
	//delete tail
    public Node deletTail(Node head) {
    	if(head == null || head.next == null) return head;
    	Node temp = head;
    	Node prev = null;
    	while(temp.next !=null) {
    		prev = prev.next;
    		temp = temp.next;
    		
    	}    
    	temp.next = null;

    	

    	return head;
    }
	
	//delete by position
	
	//delete by ele
	
	public static void main(String[] args) {
		SinglyLLIter ss = new SinglyLLIter();
		int[] arr = {5,4,3,6,9};
		Node head = ss.conAlLL(arr);
		ss.printList(head);
//		ss.deleteHead(head);
//		System.out.println("after deleting first node");
		ss.deletTail(head);
		System.out.println("after deleting tail");

		ss.printList(head);


	}
	

}
