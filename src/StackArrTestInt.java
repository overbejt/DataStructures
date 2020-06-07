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
	 * @throws Exception 
	 */
	@Test
	public void testPush1() throws Exception {
        setUp();
        int expected = 1;
        stack.push(expected);
        int result = stack.peek();
        assertEquals(expected, result);
        tearDown();
	}  // End of the 'testPush1' method
	
    /**
	 * This is the method that will test the push method.
     * @throws Exception 
	 */
	@Test
	public void testPush2() throws Exception {
        setUp();
        int expected = -4;
        stack.push(expected);
        int result = stack.peek();
        assertEquals(expected, result);
        tearDown();
	}  // End of the 'testPush2' method
	
    /**
	 * This is the method that will test the push method.
     * @throws Exception 
	 */
	@Test
	public void testPush3() throws Exception {
        setUp();
        stack.push(Integer.MAX_VALUE);
        int result = stack.peek();
        assertEquals(Integer.MAX_VALUE, result);
        tearDown();
	}  // End of the 'testPush3' method
	
    /**
	 * This is the method that will test the push method.
     * @throws Exception 
	 */
	@Test
	public void testPush4() throws Exception {
        setUp();
        stack.push(Integer.MIN_VALUE);
        int result = stack.peek();
        assertEquals(Integer.MIN_VALUE, result);
        tearDown();
	}  // End of the 'testPush4' method
	
    /**
	 * This is the method that will test the push method.
     * @throws Exception 
	 */
	@Test(expected=IllegalArgumentException.class)
	public void testPush5() throws Exception {
        setUp();
        stack.push(Integer.MAX_VALUE + 1);
        tearDown();
	}  // End of the 'testPush5' method
    
    /**
	 * This is the method that will test the push method.
     * @throws Exception 
	 */
	@Test (expected=IllegalArgumentException.class)
	public void testPush6() throws Exception {
        setUp();
        stack.push(Integer.MIN_VALUE - 1);       
        tearDown();
	}  // End of the 'testPush6' method
    
    /**
	 * This is the method that will test the push method.
     * @throws Exception 
	 */
	@Test
	public void testPush7() throws Exception {
        setUp();
        int expected = 19;
        for (int i = 0; i < expected; i++) {
            stack.push(i);
        } 
        int result = stack.size();
        assertEquals(expected, result);
        tearDown();
	}  // End of the 'testPush7' method
    
    /**
	 * This is the method that will test the push method.
     * @throws Exception 
	 */
	@Test
	public void testPush8() throws Exception {
        setUp();
        int expected = 20;
        for (int i = 0; i < expected; i++) {
            stack.push(i);
        } 
        int result = stack.size();
        assertEquals(expected, result);
        tearDown();
	}  // End of the 'testPush8' method
    
    /**
	 * This is the method that will test the push method.
     * @throws Exception 
	 */
	@Test
	public void testPush9() throws Exception {
        setUp();
        int expected = 21;
        for (int i = 0; i < expected; i++) {
            stack.push(i);
        } 
        int result = stack.size();
        assertEquals(expected, result);
        tearDown();
	}  // End of the 'testPush9' method
    
    /**
	 * This is the method that will test the push method.
     * @throws Exception 
	 */
	@Test
	public void testPush10() throws Exception {
        setUp();
        int expected = 22;
        for (int i = 0; i < expected; i++) {
            stack.push(i);
        } 
        int result = stack.size();
        assertEquals(expected, result);
        tearDown();
	}  // End of the 'testPush10' method
    
    /**
	 * This is the method that will test the push method.
     * @throws Exception 
	 */
	@Test
	public void testPush11() throws Exception {
        setUp();
        int expected = 30;
        for (int i = 0; i < expected; i++) {
            stack.push(i);
        } 
        int result = stack.size();
        assertEquals(expected, result);
        tearDown();
	}  // End of the 'testPush11' method
    
    /**
	 * This is the method that will test the push method.
     * @throws Exception 
	 */
	@Test
	public void testPush12() throws Exception {
        setUp();
        int expected = 39;
        for (int i = 0; i < expected; i++) {
            stack.push(i);
        } 
        int result = stack.size();
        assertEquals(expected, result);
        tearDown();
	}  // End of the 'testPush12' method
    
    /**
	 * This is the method that will test the push method.
     * @throws Exception 
	 */
	@Test
	public void testPush13() throws Exception {
        setUp();
        int expected = 40;
        for (int i = 0; i < expected; i++) {
            stack.push(i);
        } 
        int result = stack.size();
        assertEquals(expected, result);
        tearDown();
	}  // End of the 'testPush13' method
    
    /**
	 * This is the method that will test the push method.
     * @throws Exception 
	 */
	@Test
	public void testPush14() throws Exception {
        setUp();
        int expected = 41;
        for (int i = 0; i < expected; i++) {
            stack.push(i);
        } 
        int result = stack.size();
        assertEquals(expected, result);
        tearDown();
	}  // End of the 'testPush14' method
    
    /**
	 * This is the method that will test the push method.
     * @throws Exception 
	 */
	@Test
	public void testPush15() throws Exception {
        setUp();
        int expected = 42;
        for (int i = 0; i < expected; i++) {
            stack.push(i);
        } 
        int result = stack.size();
        assertEquals(expected, result);
        tearDown();
	}  // End of the 'testPush15' method
    
    /**
	 * This is the method that will test the push method.
     * @throws Exception 
	 */
	@Test
	public void testPush16() throws Exception {
        setUp();
        int max = 5;
        for (int i = 0; i < max; i++) {
            stack.push(i);
        } 
        for (int expected = max; expected < 0; expected--) {
        	int result = stack.pop();
            assertEquals(expected, result);
        }
        tearDown();
	}  // End of the 'testPush16' method
    
    /**
	 * This is the method that will test the push method.
     * @throws Exception 
	 */
	@Test
	public void testPush17() throws Exception {
        setUp();
        int max = 19;
        for (int i = 0; i < max; i++) {
            stack.push(i);
        } 
        for (int expected = max; expected < 0; expected--) {
        	int result = stack.pop();
            assertEquals(expected, result);
        }
        tearDown();
	}  // End of the 'testPush17' method
    
    /**
	 * This is the method that will test the push method.
     * @throws Exception 
	 */
	@Test
	public void testPush18() throws Exception {
        setUp();
        int max = 20;
        for (int i = 0; i < max; i++) {
            stack.push(i);
        } 
        for (int expected = max; expected < 0; expected--) {
        	int result = stack.pop();
            assertEquals(expected, result);
        }
        tearDown();
	}  // End of the 'testPush18' method
    
    /**
	 * This is the method that will test the push method.
     * @throws Exception 
	 */
	@Test
	public void testPush19() throws Exception {
        setUp();
        int max = 21;
        for (int i = 0; i < max; i++) {
            stack.push(i);
        } 
        for (int expected = max; expected < 0; expected--) {
        	int result = stack.pop();
            assertEquals(expected, result);
        }
        tearDown();
	}  // End of the 'testPush19' method
    
    /**
	 * This is the method that will test the push method.
     * @throws Exception 
	 */
	@Test
	public void testPush20() throws Exception {
        setUp();
        int max = 40;
        for (int i = 0; i < max; i++) {
            stack.push(i);
        } 
        for (int expected = max; expected < 0; expected--) {
        	int result = stack.pop();
            assertEquals(expected, result);
        }
        tearDown();
	}  // End of the 'testPush20' method

	/**
	 * This is the method that will test the pop method.
	 * @throws Exception 
	 */
	@Test
	public void testPop1() throws Exception {
        setUp();
        int max = 5;
        for (int i = 0; i < max; i++) {
            stack.push(i);
        } 
        for (int expected = max; expected < 0; expected--) {
        	int result = stack.pop();
            assertEquals(expected, result);
        }
        tearDown();
	}  // End of the 'testPop1' method
	
    /**
	 * This is the method that will test the pop method.
     * @throws Exception 
	 */
	@Test
	public void testPop2() throws Exception {
        setUp();
        int max = 19;
        for (int i = 0; i < max; i++) {
            stack.push(i);
        } 
        for (int expected = max; expected < 0; expected--) {
        	int result = stack.pop();
            assertEquals(expected, result);
        }
        tearDown();
	}  // End of the 'testPop2' method
    
    /**
	 * This is the method that will test the pop method.
     * @throws Exception 
	 */
	@Test
	public void testPop3() throws Exception {
        setUp();
        int max = 20;
        for (int i = 0; i < max; i++) {
            stack.push(i);
        } 
        for (int expected = max; expected < 0; expected--) {
        	int result = stack.pop();
            assertEquals(expected, result);
        }
        tearDown();
	}  // End of the 'testPop3' method
    
    /**
	 * This is the method that will test the pop method.
     * @throws Exception 
	 */
	@Test
	public void testPop4() throws Exception {
        setUp();
        int max = 21;
        for (int i = 0; i < max; i++) {
            stack.push(i);
        } 
        for (int expected = max; expected < 0; expected--) {
        	int result = stack.pop();
            assertEquals(expected, result);
        }
        tearDown();
	}  // End of the 'testPop4' method
    
    /**
	 * This is the method that will test the pop method.
     * @throws Exception 
	 */
	@Test
	public void testPop5() throws Exception {
        setUp();
        int max = 30;
        for (int i = 0; i < max; i++) {
            stack.push(i);
        } 
        for (int expected = max; expected < 0; expected--) {
        	int result = stack.pop();
            assertEquals(expected, result);
        }
        tearDown();
	}  // End of the 'testPop5' method
    
    /**
	 * This is the method that will test the pop method.
     * @throws Exception 
	 */
	@Test
	public void testPop6() throws Exception {
        setUp();
        int max = 39;
        for (int i = 0; i < max; i++) {
            stack.push(i);
        } 
        for (int expected = max; expected < 0; expected--) {
        	int result = stack.pop();
            assertEquals(expected, result);
        }
        tearDown();
	}  // End of the 'testPop6' method
    
    /**
	 * This is the method that will test the pop method.
     * @throws Exception 
	 */
	@Test
	public void testPop7() throws Exception {
        setUp();
        int max = 40;
        for (int i = 0; i < max; i++) {
            stack.push(i);
        } 
        for (int expected = max; expected < 0; expected--) {
        	int result = stack.pop();
            assertEquals(expected, result);
        }
        tearDown();
	}  // End of the 'testPop7' method
    
    /**
	 * This is the method that will test the pop method.
     * @throws Exception 
	 */
	@Test
	public void testPop8() throws Exception {
        setUp();
        int max = 41;
        for (int i = 0; i < max; i++) {
            stack.push(i);
        } 
        for (int expected = max; expected < 0; expected--) {
        	int result = stack.pop();
            assertEquals(expected, result);
        }
        tearDown();
	}  // End of the 'testPop8' method
    
    /**
	 * This is the method that will test the pop method.
     * @throws Exception 
	 */
	@Test (expected=IndexOutOfBoundsException.class)
	public void testPop9() throws Exception {
        setUp();
        stack.pop();
        tearDown();
	}  // End of the 'testPop9' method

	/**
	 * This is the method that will test the isEmpty method.
	 * @throws Exception 
	 */
	@Test
	public void testIsEmpty1() throws Exception {
        setUp();
        stack.push(0);
        boolean result = stack.isEmpty();
        assertEquals(false, result);
        tearDown();
	}  // End of the 'testIsEmpty1' method
	
    /**
	 * This is the method that will test the isEmpty method.
     * @throws Exception 
	 */
	@Test
	public void testIsEmpty2() throws Exception {
        setUp();
        boolean result = stack.isEmpty();
        assertEquals(true, result);
        tearDown();
	}  // End of the 'testIsEmpty2' method
    
    /**
	 * This is the method that will test the isEmpty method.
     * @throws Exception 
	 */
	@Test
	public void testIsEmpty3() throws Exception {
        setUp();
        stack.push(3);
        int scrap = stack.pop();
        boolean result = stack.isEmpty();
        assertEquals(true, result);
        tearDown();
	}  // End of the 'testIsEmpty3' method
	
	/**
	 * This is the method that will test the isEmpty method.
     * @throws Exception 
	 */
	@Test
	public void testIsEmpty4() throws Exception {
        setUp();
        int max = 5;
        for (int i = 0; i < max; i++) {
        	stack.push(i);
        	boolean result = stack.isEmpty();
        	assertEquals(false, result);
        }
        System.out.println("First");
        for (int i = max ; i > 0; i--) {
        	boolean result = stack.isEmpty();
        	assertEquals(false, result);
        	int scrap = stack.pop();
        }
//        int scrap = stack.pop();
//        boolean result = stack.isEmpty();
//        assertEquals(true, result);
//        System.out.println("Second");
        tearDown();
	}  // End of the 'testIsEmpty4' method

	/**
	 * This is the method that will test the peek method.
	 * @throws Exception 
	 */
	@Test
	public void testPeek1() throws Exception {
		setUp();
		int expected = 4;
		stack.push(expected);
		int result = stack.peek();
		assertEquals(expected, result);
		tearDown();
	}  // End of the 'testPeek1' method
	
	/**
	 * This is the method that will test the peek method.
	 * @throws Exception 
	 */
	@Test (expected = IndexOutOfBoundsException.class)
	public void testPeek2() throws Exception {
		setUp();
		int scrap = stack.peek();
		tearDown();
	}  // End of the 'testPeek2' method
	
	/**
	 * This is the method that will test the peek method.
	 * @throws Exception 
	 */
	@Test
	public void testPeek3() throws Exception {
		setUp();
		int max = 5;
		for (int i = 0; i < max; i++) {
			int expected = i;
			stack.push(i);
			int result = stack.peek();
			assertEquals(expected, result);
		}
		tearDown();
	}  // End of the 'testPeek3' method
	
	/**
	 * This is the method that will test the peek method.
	 * @throws Exception 
	 */
	@Test
	public void testPeek4() throws Exception {
		setUp();
		int max = 19;
		for (int i = 0; i < max; i++) {
			int expected = i;
			stack.push(i);
			int result = stack.peek();
			assertEquals(expected, result);
		}
		tearDown();
	}  // End of the 'testPeek4' method
	
	/**
	 * This is the method that will test the peek method.
	 * @throws Exception 
	 */
	@Test
	public void testPeek5() throws Exception {
		setUp();
		int max = 20;
		for (int i = 0; i < max; i++) {
			int expected = i;
			stack.push(i);
			int result = stack.peek();
			assertEquals(expected, result);
		}
		tearDown();
	}  // End of the 'testPeek5' method
	
	/**
	 * This is the method that will test the peek method.
	 * @throws Exception 
	 */
	@Test
	public void testPeek6() throws Exception {
		setUp();
		int max = 21;
		for (int i = 0; i < max; i++) {
			int expected = i;
			stack.push(i);
			int result = stack.peek();
			assertEquals(expected, result);
		}
		tearDown();
	}  // End of the 'testPeek6' method
	
	/**
	 * This is the method that will test the peek method.
	 * @throws Exception 
	 */
	@Test
	public void testPeek7() throws Exception {
		setUp();
		int max = 39;
		for (int i = 0; i < max; i++) {
			int expected = i;
			stack.push(i);
			int result = stack.peek();
			assertEquals(expected, result);
		}
		tearDown();
	}  // End of the 'testPeek7' method
	
	/**
	 * This is the method that will test the peek method.
	 * @throws Exception 
	 */
	@Test
	public void testPeek8() throws Exception {
		setUp();
		int max = 40;
		for (int i = 0; i < max; i++) {
			int expected = i;
			stack.push(i);
			int result = stack.peek();
			assertEquals(expected, result);
		}
		tearDown();
	}  // End of the 'testPeek8' method
	
	/**
	 * This is the method that will test the peek method.
	 * @throws Exception 
	 */
	@Test
	public void testPeek9() throws Exception {
		setUp();
		int max = 41;
		for (int i = 0; i < max; i++) {
			int expected = i;
			stack.push(i);
			int result = stack.peek();
			assertEquals(expected, result);
		}
		tearDown();
	}  // End of the 'testPeek9' method

	/**
	 * This is the method that will test the size method.
	 * @throws Exception 
	 */
	@Test
	public void testSize1() throws Exception {
		setUp();
		int expected = 0;
		int result = stack.size();
		assertEquals(expected, result);
		tearDown();
	}  // End of the 'testSize1' method
	
	/**
	 * This is the method that will test the size method.
	 * @throws Exception 
	 */
	@Test
	public void testSize2() throws Exception {
		setUp();
		int max = 5;
		for (int i = 1; i <= max; i++) {
			int expected = i;
			stack.push(i);
			int result = stack.size();
			assertEquals(expected, result);
		}
		tearDown();
	}  // End of the 'testSize2' method
	
	/**
	 * This is the method that will test the size method.
	 * @throws Exception 
	 */
	@Test
	public void testSize3() throws Exception {
		setUp();
		int max = 19;
		for (int i = 1; i <= max; i++) {
			int expected = i;
			stack.push(i);
			int result = stack.size();
			assertEquals(expected, result);
		}
		tearDown();
	}  // End of the 'testSize3' method
	
	/**
	 * This is the method that will test the size method.
	 * @throws Exception 
	 */
	@Test
	public void testSize4() throws Exception {
		setUp();
		int max = 20;
		for (int i = 1; i <= max; i++) {
			int expected = i;
			stack.push(i);
			int result = stack.size();
			assertEquals(expected, result);
		}
		tearDown();
	}  // End of the 'testSize4' method
	
	/**
	 * This is the method that will test the size method.
	 * @throws Exception 
	 */
	@Test
	public void testSize5() throws Exception {
		setUp();
		int max = 20;
		for (int i = 1; i <= max; i++) {
			int expected = i;
			stack.push(i);
			int result = stack.size();
			assertEquals(expected, result);
		}
		tearDown();
	}  // End of the 'testSize5' method
	
	/**
	 * This is the method that will test the size method.
	 * @throws Exception 
	 */
	@Test
	public void testSize6() throws Exception {
		setUp();
		int max = 21;
		for (int i = 1; i <= max; i++) {
			int expected = i;
			stack.push(i);
			int result = stack.size();
			assertEquals(expected, result);
		}
		tearDown();
	}  // End of the 'testSize6' method
	
	/**
	 * This is the method that will test the size method.
	 * @throws Exception 
	 */
	@Test
	public void testSize7() throws Exception {
		setUp();
		int max = 39;
		for (int i = 1; i <= max; i++) {
			int expected = i;
			stack.push(i);
			int result = stack.size();
			assertEquals(expected, result);
		}
		tearDown();
	}  // End of the 'testSize7' method
	
	/**
	 * This is the method that will test the size method.
	 * @throws Exception 
	 */
	@Test
	public void testSize8() throws Exception {
		setUp();
		int max = 40;
		for (int i = 1; i <= max; i++) {
			int expected = i;
			stack.push(i);
			int result = stack.size();
			assertEquals(expected, result);
		}
		tearDown();
	}  // End of the 'testSize8' method
	
	/**
	 * This is the method that will test the size method.
	 * @throws Exception 
	 */
	@Test
	public void testSize9() throws Exception {
		setUp();
		int max = 41;
		for (int i = 1; i <= max; i++) {
			int expected = i;
			stack.push(i);
			int result = stack.size();
			assertEquals(expected, result);
		}
		tearDown();
	}  // End of the 'testSize9' method
	
	/**
	 * This is the method that will test the size method.
	 * @throws Exception 
	 */
	@Test
	public void testSize10() throws Exception {
		setUp();
		int max = 41;
		for (int i = 1; i <= max; i++) {
			int expected = i;
			stack.push(i);
			int result = stack.size();
			assertEquals(expected, result);
		}
//		System.out.println("First done");
		for (int i = max; i > 0; i--) {
			int expected = i;
			int result = stack.size();
			assertEquals(expected, result);
			int scrap = stack.pop();	
		}
//		System.out.println("Second Done");
		tearDown();
	}  // End of the 'testSize10' method

}  // End of the 'StackArrTestInt' class

// END OF FILE
