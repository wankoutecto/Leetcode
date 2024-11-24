import java.util.ArrayList;
import java.util.List;

public class MergeSorted {

	public static void main(String[] args) {
		Node node1 = new Node(1);
		node1.next = new Node(1);
		node1.next.next = new Node(2);
		
		Node node2 = new Node(3);
		node2.next = new Node(4);
		node2.next.next = new Node(7);
		
		Node node3 = new Node(8);
		node3.next = new Node(9);
		node3.next.next = new Node(10);
		
		Node[] node = {node1, node2, node3};
		node[0] = mergeKList(node);
		System.out.println(node[0].toString());
		
	}

	public static  Node mergeKList(Node[] lists) {
		if(lists == null || lists.length == 0)return null;
		
		while(lists.length > 1) {
			List<Node> mergetwo = new ArrayList<>();
			for(int i = 0; i < lists.length; i +=2) {
				Node l1 = lists[i];
				Node l2 = (i + 1) < lists.length? lists[i + 1]: null;
				mergetwo.add(Node.merge(l1, l2));
			}
			lists = mergetwo.toArray(new Node[0]);
		}	
		return lists[0];
	}
}


class Node{
    int val;
    Node next;
    public Node(int val){
        this.val = val;
        this.next = null;
    }
    
    public static Node merge(Node l1, Node l2) {
       Node dummy = new Node(0);
       Node curr = dummy;

        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                curr.next = l1;
                l1 = l1.next;
            } else {
                curr.next = l2;
                l2 = l2.next;
            }

            curr = curr.next;
        }

        if (l1 != null) {
            curr.next = l1;
        } else {
            curr.next = l2;
        }

        return dummy.next;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node curr = this;
        while (curr != null) {
            sb.append(curr.val).append(" -> ");
            curr = curr.next;
        }
        sb.append("null");
        return sb.toString();
    }

}