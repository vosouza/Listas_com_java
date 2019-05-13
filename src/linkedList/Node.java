package linkedList;

public class Node {
	private Object content;
	private Node next;
	
	Node(Object content){
		this.setContent(content);
		this.setNext(null);
	}

	public Object getContent() {
		return content;
	}

	public void setContent(Object content) {
		this.content = content;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
	
	
}
