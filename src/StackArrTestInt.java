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
	public void testStackArrOverloadedConstructor1() throws Exception {
		stack = new StackArr<Integer>(4);
		assertNotNull(stack);
		tearDown();
	}  // End of the 'testStackArrOverloadedConstructor' method
	
    /**
	 * This is the method that will test the overloaded constructor.
	 * @throws Exception 
	 */
	@Test
	public void testStackArrOverloadedConstructor2() throws Exception {
		stack = new StackArr<Integer>(5);
		assertNotNull(stack);
		tearDown();
	}  // End of the 'testStackArrOverloadedConstructor' method

	/**
	 * This is the method that will test the push method.
	 */
	@Test
	public void testPush1() {
        setUp();
        stack.push(1);
        assertEquals(1, stack.peek());
        tearDown();
	}  // End of the 'testPush1' method
	
    /**
	 * This is the method that will test the push method.
	 */
	@Test
	public void testPush2() {
        setUp();
        stack.push(-4);
        assertEquals(-4, stack.peek());
        tearDown();
	}  // End of the 'testPush2' method
	
    /**
	 * This is the method that will test the push method.
	 */
	@Test
	public void testPush3() {
        setUp();
        stack.push(Integer.MAX_VALUE);
        assertEquals(Integer.MAX_VALUE, stack.peek();
        tearDown();
	}  // End of the 'testPush3' method
	
    /**
	 * This is the method that will test the push method.
	 */
	@Test
	public void testPush4() {
        setUp();
        stack.push(Integer.MIN_VALUE);
        assertEquals(Integer.MIN_VALUE, stack.peek());
        tearDown();
	}  // End of the 'testPush4' method
	
    /**
	 * This is the method that will test the push method.
	 */
	@Test
	public void testPush5() {
        setUp();
        try {
            stack.push(Integer.MAX_VALUE + 1);
            fail("Expected an Integer overflow exception");
        } catch (Exception e) {
            pass("Was not intented to support larger than Integer");
        }
        tearDown();
	}  // End of the 'testPush5' method
    
    /**
	 * This is the method that will test the push method.
	 */
	@Test
	public void testPush6() {
        setUp();
        try {
            stack.push(Integer.MIN__VALUE - 1);
            fail("Expected an Integer overflow exception");
        } catch (Exception e) {
            pass("Was not intented to support larger than Integer");
        }
        tearDown();
	}  // End of the 'testPush6' method
    
    /**
	 * This is the method that will test the push method.
	 */
	@Test
	public void testPush7() {
        setUp();
        int expected = 19;
        for (int i = 0; i < expected; i++) {
            stack.push(i);
        } 
        assertEquals(expected, stack.size());`
        tearDown();
	}  // End of the 'testPush7' method
    
    /**
	 * This is the method that will test the push method.
	 */
	@Test
	public void testPush8() {
        setUp();
        int expected = 20;
        for (int i = 0; i < expected; i++) {
            stack.push(i);
        } 
        assertEquals(expected, stack.size();
        tearDown();
	}  // End of the 'testPush8' method
    
    /**
	 * This is the method that will test the push method.
	 */
	@Test
	public void testPush9() {
        setUp();
        int expected = 21;
        for (int i = 0; i < expected; i++) {
            stack.push(i);
        } 
        assertEquals(expected, stack.size());
        tearDown();
	}  // End of the 'testPush9' method
    
    /**
	 * This is the method that will test the push method.
	 */
	@Test
	public void testPush9() {
        setUp();
        int expected = 22;
        for (int i = 0; i < expected; i++) {
            stack.push(i);
        } 
        assertEquals(expected, stack.size());
        tearDown();
	}  // End of the 'testPush9' method
    
    /**
	 * This is the method that will test the push method.
	 */
	@Test
	public void testPush10() {
        setUp();
        int expected = 30;
        for (int i = 0; i < expected; i++) {
            stack.push(i);
        } 
        assertEquals(expected, stack.size());
        tearDown();
	}  // End of the 'testPush10' method
    
    /**
	 * This is the method that will test the push method.
	 */
	@Test
	public void testPush11() {
        setUp();
        int expected = 39;
        for (int i = 0; i < expected; i++) {
            stack.push(i);
        } 
        assertEquals(expected, stack.size());
        tearDown();
	}  // End of the 'testPush11' method
    
    /**
	 * This is the method that will test the push method.
	 */
	@Test
	public void testPush13() {
        setUp();
        int expected = 40;
        for (int i = 0; i < expected; i++) {
            stack.push(i);
        } 
        assertEquals(expected, stack.size());
        tearDown();
	}  // End of the 'testPush13' method
    
    /**
	 * This is the method that will test the push method.
	 */
	@Test
	public void testPush14() {
        setUp();
        int expected = 41;
        for (int i = 0; i < expected; i++) {
            stack.push(i);
        } 
        assertEquals(expected, stack.size());
        tearDown();
	}  // End of the 'testPush14' method
    
    /**
	 * This is the method that will test the push method.
	 */
	@Test
	public void testPush15() {
        setUp();
        int expected = 42
        for (int i = 0; i < expected; i++) {
            stack.push(i);
        } 
        assertEquals(expected, stack.size());
        tearDown();
	}  // End of the 'testPush15' method

	/**
	 * This is the method that will test the pop method.
	 */
	@Test
	public void testPop1() {
        setUp();
        // Decalre final value;
        int lastVal = 5;
        for (int i = 0; i < lastVal; i++) {
            stack.push(i);
        }
        int result = stack.pop();
        assertEquals(lastVal, result);
        tearDown();
	}  // End of the 'testPop1' method

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
