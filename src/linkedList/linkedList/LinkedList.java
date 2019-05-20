package linkedList;

public class LinkedList {
	
	private Node head;
	private int length;
	
	public void LikedList() {
		this.length = 0;
	}
	public void addNode(Object content) {
		Node n = new Node(content);
		if(length == 0) {
			this.head = n;
			this.length++;
		}else {
			Node aux1, aux2;
			aux1= this.head;
			while(aux1.getNext() != null) {
				aux2 = aux1.getNext();
				aux1 = aux2;
			}
			aux1.setNext(n);
			this.length++;
		}
	}
	
	public Object getLast() {
		Node n;
		if(length == 1) {
			n = head;
		}else {
			Node aux1, aux2;
			aux1= this.head;
			while(aux1.getNext() != null) {
				aux2 = aux1.getNext();
				aux1 = aux2;
			}
			n = aux1;
		}
		return n.getContent();
	}
	
	
	public Node getHead() {
		return head;
	}

	public int getLength() {
		return length;
	}

}
