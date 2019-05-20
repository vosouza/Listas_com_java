import linkedList.Stack;

public class Test {

	public static void main(String[] args) {
		Stack stk = new Stack();
		stk.push("1");
		stk.push("2");
		stk.push("3");
		stk.push("4");
		stk.push("5");
		stk.pop();
		stk.pop();
		stk.pop();
		System.out.print(stk.pop());

	}

}
