package day10_Collection;

import java.util.Stack;

public class Test01_Stack {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>(); // 순서대로 쌓이고 나옴
		stack.push("aaaa");
		stack.push("bbbb");
		stack.push("cccc");
		

		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.empty());
		System.out.println(stack.pop());
		
	}

}
