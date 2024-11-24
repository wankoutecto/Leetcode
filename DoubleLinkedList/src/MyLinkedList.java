
public class MyLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode listnode = new ListNode();
		listnode.addAtTail(1);
		listnode.addAtTail(2);
		listnode.addAtTail(3);
		listnode.addAtTail(4);
		
		listnode.display();
		listnode.reverseDoubleLinkedList();
		listnode.display();
	}
	
}


