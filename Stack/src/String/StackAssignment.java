package String;
import java.util.Stack;
import java.io.*;

public class StackAssignment {

	public static void main(String[] args) {

	

		
			 
			 { 
			     // Default initialization of Stack 
			     Stack stack1 = new Stack(); 

			     // Initialization of Stack using Generics 
			     Stack<String> stack2 = new Stack<String>(); 

			     // pushing the elements 
			     stack1.push("Mango"); 
			     stack1.push("Banana"); 
			     stack1.push("Grapes"); 
			     stack1.push("Apple"); 
			     stack1.push("Orange"); 
			     stack1.push("Nagpur");
			     stack1.push("Pune");
			     stack1.push("Delhi");
			     stack1.push("Hyderabad"); 
			     stack1.push(39);
			     stack1.push(10); 
			     stack1.push(15); 
			     stack1.push(20);
			     stack1.push('s'); 
			     stack1.push('y'); 
			     
			   
			     System.out.println(stack1); 
			     System.out.println("Popped element from stack 1: " + stack1.pop()); 
			     System.out.println("Popped element from stack 1: " + stack1.pop()); 
			     System.out.println("Popped element from stack 1: " + stack1.pop()); 
			     System.out.println("Popped element from stack 1: " + stack1.pop()); 
			     System.out.println("Popped element from stack 1: " + stack1.pop()); 
			     System.out.println("The element at the top of the"+ " stack-1 is: " + stack1.peek());
			     System.out.println("Popped element from stack 1: " + stack1.pop()); 
			     System.out.println("Popped element from stack 1: " + stack1.pop()); 
			     System.out.println("Popped element from stack 1: " + stack1.pop()); 
			     System.out.println("Popped element from stack 1: " + stack1.pop()); 
			     System.out.println("The element at the top of the"+ " stack-1 is: " + stack1.peek());
			     System.out.println("The index of Apple and Delhi is: "+ stack1.indexOf("Apple"));
			     System.out.println("The index of Apple and Delhi is: "+ stack1.indexOf("Delhi"));
			     

			 }
		

	}
}

