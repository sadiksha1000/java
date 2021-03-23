//Given two stack a and b, if allowed to pop from each stack, all popped values are added together, 
//return maximum pop one can make without sum exceeding some given integer k.[3Marks]
//	Given k=11

import java.util.Stack;

public class Pop{
	public static void main(String[] args) {
		
		
		Stack<Integer> stack1 = new Stack<Integer>();
		
		stack1.push(9);
		stack1.push(7);
		stack1.push(6);
		stack1.push(3);
		stack1.push(4);
		
		Stack<Integer> stack2 = new Stack<Integer>();
		stack2.push(5);
		stack2.push(9);
		stack2.push(2);
		stack2.push(1);
		
		int count=0;
		
		//traversing along stack to check if pop exceeds the given value
		for(int i=0;i<stack2.size();i++) {
			if(stack1.pop()+stack2.pop()<11) {
				count+=2;
			}
		}
		System.out.println("Maximum values that can be popped without exceeding value 11 is: "+count);
		
	}
}