package Ch12;
/*
 * 날짜 : 2022/09/13
 * 이름 : 조주영
 * 내용 : 스택 구현하기
 * 
 */

import java.util.ArrayList;

class MyStack {
	private ArrayList<String> arrayStack = new ArrayList<String>();
	
	public void push(String data) {
		arrayStack.add(data);
	}
	
	public String pop() {
		int len = arrayStack.size();
		if (len == 0) {
			System.out.println("스택이 비었습니다");
			return null;
		}
		
		return(arrayStack.remove(len-1));
	}
}


public class P419 {
	public static void main(String[] args) {
		MyStack stack = new MyStack();
		stack.push("A");
		stack.push("B");
		stack.push("C");
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}
	
	
	
	
}
