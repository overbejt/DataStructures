/**
 * Copyright (c) 2020 joverbeck8@gmail.com
 * 
 * @author Josh Overbeck
 * 
 * This is an interface file that will serve as an abstract data structure for a 
 * stack.
 *
 */
public interface Stack < T > {
	
	// A default size for the stack
	final int DEFAULT_SIZE = 20;
	
	/**
	 * A method to push a variable onto the stack.
	 * @param t
	 */
	void push(T t);
	
	/**
	 * A method that will pop off the first item at the top of the stack.
	 * @return The item at the top of the stack.
	 */
	T pop();
	
	/**
	 * A method that will check to see if the stack is empty.
	 * @return True if the stack is empty.  Otherwise, false.
	 */
	boolean isEmpty();
	
	/**
	 * A method that will let you peek at the top element in the stack.
	 * @return The item that is at the top of the stack.
	 */
	T peek();
	
	/**
	 * A method that will let you get the size of the stack.
	 * @return The size of the stack.
	 */
	int size();

}  // End of the 'Stack' interface

// END OF FILE