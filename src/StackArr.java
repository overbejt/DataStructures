/**
 * Copyright (c) 2020 joverbeck8@gmail.com
 * 
 * @author Josh Overbeck
 * 
 * This is an implementation of the abstract stack class using an array.
 *
 * @param <T>
 */
public class StackArr < T > implements Stack < T > {

	// Member variables
	private int size;
	private int length;
	private T[] stack;
	
	// Default Constructor
	public StackArr() {
		this(DEFAULT_SIZE);
	}  // End of the Default Constructor
	
	// Overloaded Constructor
	@SuppressWarnings("unchecked")
	public StackArr(int length) {
		// Initialize the size of the stack to zero
		this.size = 0;
		// TODO:  Need to make sure it accounts for integer overflow!
		// Initialize the length of the stack
		this.length = length;
		// Create an array with an 
		this.stack = (T[]) new Object[length];
	}  // End of the Overloaded Constructor
	
	/**
	 * A method to push a variable onto the stack.
	 * @param t
	 */
	@Override
	public void push(T t) {
		// TODO Need to account for integer overflow.  Although, the compiler should catch it.
		
	}  // End of the 'push' method

	/**
	 * A method that will pop off the first item at the top of the stack.
	 * @throws IndexOutOfBoundsException
	 * @return The item at the top of the stack.
	 */
	@Override
	public T pop() throws IndexOutOfBoundsException {
		// TODO Fill in and remember to account for empty stack
		return null;
	}  // End of the 'pop' method

	/**
	 * A method that will check to see if the stack is empty.
	 * @return True if the stack is empty.  Otherwise, false.
	 */
	@Override
	public boolean isEmpty() {
		return (size == 0);
	}  // End of the 'isEmpty' method

	/**
	 * A method that will let you peek at the top element in the stack.
	 * @return The item that is at the top of the stack.
	 */
	@Override
	public T peek() {
		// TODO Circular array? Or shuffle each time?
		return null;
	}  // End of the 'peek' method

	/**
	 * A method that will let you get the size of the stack.
	 * @return The size of the stack.
	 */
	@Override
	public int size() {
		return size;
	}  // End of the 'size' method

}  // End of the 'StackArr' class

// END OF FILE