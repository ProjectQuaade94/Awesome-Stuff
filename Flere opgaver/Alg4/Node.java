package Alg4;

public class Node {
String key;
Node next;
Node prev;

Node Insert(Node head,Node x){
	x.prev = null;
	x.next = head;
	head.prev = x;
	return x;
}


}
