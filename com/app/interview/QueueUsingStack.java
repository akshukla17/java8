package com.app.interview;

import java.util.Stack;

/**
 * implement Queue operation using Stack
 * 
 * @author AS52140
 *
 */
public class QueueUsingStack {

	public static void main(String[] args) {
		MyQueue q = new MyQueue();
		int i=1;
		System.out.println("push "+ i);
		q.push(i);
		i=2;
		System.out.println("push "+ i);
		q.push(i);
		System.out.println("pop: "+ q.pop());
		
		i=3;
		System.out.println("push "+ i);
		q.push(i);
		
		System.out.println("pop: "+ q.pop());
		System.out.println("pop: "+ q.pop());
		System.out.println("pop: "+ q.pop());
		System.out.println("pop: "+ q.pop());
		i=4;
		System.out.println("push "+ i);
		q.push(i);
		
		System.out.println("pop: "+ q.pop());
		System.out.println("pop: "+ q.pop());
		
	}

}

class MyQueue {

	Stack<Integer> s1;
	Stack<Integer> s2;

	public MyQueue() {
		s1 = new Stack<>();
		s2 = new Stack<>();
	}

	public void push(int x) {
		if (s1.isEmpty() && s2.isEmpty()) {
			s1.add(x);
		} else if (!s1.isEmpty() && s2.isEmpty()) {
			while (!s1.isEmpty()) {
				s2.add(s1.pop());
			}
			s1.add(x);
			while(!s2.isEmpty()) {
				s1.add(s2.pop());
			}
		} 
//		else if (s1.isEmpty() && !s2.isEmpty()) {
//			while (!s2.isEmpty()) {
//				s1.push(s2.pop());
//			}
//		}
	}

	public int pop() {
		if(!s1.isEmpty()) {
			return s1.pop();
		}else {
			if(!s2.isEmpty()) {
				return s2.pop();
			}
		}
		return -1;
	}

	public int peek() {
		if(!s1.isEmpty()) {
			return s1.peek();
		}else {
			return -1;
		}
	}
}
