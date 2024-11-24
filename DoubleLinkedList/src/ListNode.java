class Node{
    int val;
    Node pre;
    Node next;
    public Node(int val){
        this.val = val;
        this.pre = null;
        this.next = null;
    }
}

public class ListNode{
	private Node head;

    public ListNode() {
        head = new Node(-1);
    }
    
    public int get(int index) {
        int i = 0;
        Node cur = head.next;
        while(cur != null){
            if(i == index) return cur.val;
            cur = cur.next;
            i++;
        }
        return head.val;
    }
    
    public void addAtHead(int val) {
        Node newNode = new Node(val);
        newNode.next = head.next;
        if(head.next != null){
             head.next.pre = newNode;
        }
        newNode.pre = head;
        head.next = newNode;
    }
    
    public void addAtTail(int val) {
        Node newNode = new Node(val);
        Node  cur = head;
        while(cur.next != null){
            cur = cur.next;
        }
        cur.next = newNode;
        newNode.pre = cur;    
    }
    
    public void addAtIndex(int index, int val) {
        int i = 0;
        Node cur = head.next;
        while(cur != null && i < index){
            cur = cur.next;
            i++;
        }
        if(i == index){
            Node newNode = new Node(val);
            if(cur != null){
                cur.pre.next = newNode;
                newNode.pre = cur.pre;
                newNode.next = cur;
                cur.pre = newNode;
            }else{
                addAtTail(val);
            }       
        }
    }
    
    public void deleteAtIndex(int index) {

        if(index < 0) return;
        int i = 0;
        Node cur = head.next;
        while(cur != null && i < index){
            cur = cur.next;
            i++;
        }
        if(cur != null){
            if(cur.pre != null){
                 cur.pre.next = cur.next;
            }
           
            if(cur.next != null){
                cur.next.pre = cur.pre;
            }    

            if (cur.pre == null) {
                head.next = cur.next; // Move head.next to the next node
            }
        }
    }

    public Node reverseDoubleLinkedList() {
    	if(head.next == null) return null;
    	Node cur = head.next;
    	Node prev = null;
    	
		while(cur != null) {
			Node tmp = cur.next;
			cur.next = prev;
			cur.pre = tmp;
			
		//move to the next node
			prev = cur;
			cur = tmp;
		}
		
		head.next = prev; 	 //new real head node
		if(prev != null) {
			prev = head;	 //point to the dummy
		}
		
		return head.next;
    }
    
    public void display() {
    	Node cur = head.next;
    	while(cur != null) {
    		System.out.print(cur.val + " ");
    		cur = cur.next;
    	}
    	System.out.println();
    }
    
   
/*
    public Node reverseSingleLinkedList(Node head) {
    	Node cur = head;
		Node pre = null;
		while(cur != null) {
			Node tmp = cur.next; 
			cur.next = pre;
			
			pre = cur;
			cur = tmp; 
		}
    }
*/    
    
}
