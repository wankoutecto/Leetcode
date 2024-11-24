
public class MainBrownser {

	public static void main(String[] args) {
		BrowserHistory browser = new BrowserHistory("Leetcode.com");
		browser.visit("google.com");
		browser.visit("skipe.com");
		browser.visit("score.com");
		
		System.out.println(browser.back(3));
		String bak = browser.back(2);
		System.out.println(bak);
		
		String fwd = browser.forward(1);
		System.out.println(fwd);
		
		bak = browser.back(2);
		System.out.println(bak);
		
		fwd = browser.forward(4);
		System.out.println(fwd);
		
		fwd = browser.forward(2);
		System.out.println(fwd);
	}

}

class Node {
    String url;
    Node next;
    Node pre;

    public Node(String url) {
        this.url = url;
        this.next = null;
        this.pre = null;
    }
}

class BrowserHistory {
    private Node head;
    private Node curpage;

    public BrowserHistory(String homepage) {
        head = new Node(homepage);
        curpage = head;
    }

    public void visit(String url) {
        Node newNode = new Node(url);
        curpage.next = newNode;
        newNode.pre = curpage;
        curpage = newNode;
    }

    public String back(int steps) {
        while (steps > 0 && curpage.pre != null) {
            curpage = curpage.pre;
            steps--;
        }
        return curpage.url;
    }

    public String forward(int steps) {
        while (steps > 0 && curpage.next != null) {
            curpage = curpage.next;
            steps--;
        }
        return curpage.url;
    }
}





