package linkedList;


public class Stack {
	
	private Node top;
	private int MAX;
	
	public Stack(){
		MAX = 0;
		top = new Node(null);
	}
	
	/**
	 * 
	 * @param Object to store on the stack 
	 */
	public void push(Object n){
		Node obj = new Node(n);
		
		if(MAX == 0){
			top = obj;
			MAX++;
		}else {
			obj.setNext(top);
			top =obj;
			MAX++;
		}
		
	}
	
	/**
	 * 
	 * @return the last item and pop it from the stack
	 */
	public Object pop() {
		Node aux = new Node(null);
		if(top.getNext() != null) {
			aux = top;
			top = top.getNext();
			MAX--;
		}
		return aux.getContent();
		
	}
	/**
	 * @return the last item on stack
	 */
	public Node getTop() {
		return top;
	}
	
	
	/**
	 * @return the number of itens on the stack
	 */
	public int getMAX() {
		return MAX;
	}
	

	
	
	
	
	
}
