/**
 * This is the tester for the StackArr class using a stack of integers.
 */
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class StackArrTestInt {
	// Creating a stack of integers
	Stack<Integer> stack;
	
	/**
	 * This is a method that will be run before a test.
	 * 
	 * @throws Exception
	 */
	@Before
	public void setUp() throws Exception {
		// Initialize the stack object
		stack = new StackArr<Integer>();
	}  // End of the 'setUp' method

	/**
	 * This is the method that will be run to clean up after a test.
	 * 
	 * @throws Exception
	 */
	@After
	public void tearDown() throws Exception {
		// Delete the stack object
		stack = null;
	}  // End of the 'tearDown' method

	/**
	 * This is the method that will test the default constructor.
	 * @throws Exception 
	 */
	@Test
	public void testStackArrConstructor() throws Exception {
		setUp();
		assertNotNull(stack);
		tearDown();
	}  // End of the 'testStackArrConstructor' method
	
	/**
	 * This is the method that will test the overloaded constructor.
	 * @throws Exception 
	 */
	@Test
	public void testStackArrOverloadedConstructor() throws Exception {
		stack = new StackArr<Integer>(4);
		assertNotNull(stack);
		tearDown();
	}  // End of the 'testStackArrOverloadedConstructor' method

	/**
	 * REDUNDANT
	 */
	@Test
	public void testStackArrInt() {
		fail("Not yet implemented");
	}  // End of the 'testStackArrInt' method

	/**
	 * This is the method that will test the push method.
	 */
	@Test
	public void testPush() {
		fail("Not yet implemented");
	}  // End of the 'testPush' method

	/**
	 * This is the method that will test the pop method.
	 */
	@Test
	public void testPop() {
		fail("Not yet implemented");
	}  // End of the 'testPop' method

	/**
	 * This is the method that will test the isEmpty method.
	 */
	@Test
	public void testIsEmpty() {
		fail("Not yet implemented");
	}  // End of the 'testIsEmpty' method

	/**
	 * This is the method that will test the peek method.
	 */
	@Test
	public void testPeek() {
		fail("Not yet implemented");
	}  // End of the 'testPeek' method

	/**
	 * This is the method that will test the size method.
	 */
	@Test
	public void testSize() {
		fail("Not yet implemented");
	}  // End of the 'testSize' method

}  // End of the 'StackArrTestInt' class

// END OF FILE