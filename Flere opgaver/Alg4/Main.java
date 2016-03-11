package Alg4;

public class Main {
	public static void main(String[] args) {
		
		Node head = new Node();
		Node b = new Node();
		Node c = new Node();
		head.key = "t";
		b.key = "e";
		c.key = "s";
				
		head.prev = null;
		head.next = b;
		b.prev = head;
		b.next = c;
		c.prev = b;
		c.next = null;		
	}
}
