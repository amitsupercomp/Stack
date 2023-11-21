import java.util.ArrayList;

//This is the Stack Class
class Stack {
	//taking one ArrayList object to perform Stack operation.
	static ArrayList<Integer> stack = new ArrayList<>();
	
	//To check whether stack is empty or not. If stack size is zero means it is empty.
	public static Boolean isEmpty() {
		return stack.size() == 0;
	}
	
	//To add data into a stack.
	public static void push(Integer data) {
		stack.add(data);
	}
	
	/*First check whether it is empty or not then remove data from stack
	  If it is empty then return -1.
	  To remove last element first size -1.   */
	public static Integer pop() {
		if (stack.isEmpty())
			return -1;
		return stack.remove(stack.size() - 1);
	}
	
	//To check the Top of the stack. We use size - 1
	public static Integer peek() {
		if (stack.isEmpty())
			return -1;
		return stack.get(stack.size() - 1);
	}
	
	//This will return the size of the stack
	public static Integer size() {
		return stack.size();
	}
}

public class StackDSAWithArrayList {
	public static void main(String[] args) {
		//Add data into stack
		Stack.push(12);
		Stack.push(15);
		Stack.push(17);
		Stack.push(18);
		Stack.push(18);
		Stack.push(20);
		
		//Create one array to store pop element.
		Integer[] arr = new Integer[Stack.size()];
		int i = 0;
		
		System.out.println("Stack Elements are :: ");
		
		//to print stack data from top.
		while (!Stack.isEmpty()) {
			System.out.print(Stack.peek() + ", ");
			arr[i++] = Stack.pop();
		}
		System.out.println();
		System.out.println("Pop Elements are :: ");
		i = 0;
		
		//To print pop element
		while(i < arr.length)
			System.out.print(arr[i++] + ", ");
	}
}
