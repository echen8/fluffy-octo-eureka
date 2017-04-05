// Eric Chen
// APCS2 pd4
// HW29 -- Stress is the Best
// 2017-04-04

public class DequeTester {

    public static void main( String[] args ) {

	// CHANGE THIS PART IF YOU HAVE A DIFFERENT CLASS NAME
	DLLDeque<String> deque = new DLLDeque<String>();

	// Test toString()
	System.out.println( "\nTesting toString()..." );
	System.out.println( deque );

	// Test isEmpty()
	System.out.println( "\nTesting isEmpty()..." );
	System.out.println( "isEmpty: " + deque.isEmpty() );
	// Test add()
	// System.out.println( "Added: " + deque.add( "hi" ) );
	deque.add( "hi" );
	// Test isEmpty() again
	System.out.println( "isEmpty: " + deque.isEmpty() );

	// Test size()
	System.out.println( "\nTesting size()..." );
	System.out.println( "Size: " + deque.size() );

	// Test add() methods
	System.out.println( "\nTesting add() methods..." );
	System.out.println( "Pre-add: " + deque );
	deque.addFirst( "hello" );
	deque.addLast( "sup" );
	System.out.println( "Post-add: " + deque );

	// Test peek() methods
	System.out.println( "\nTesting peek() methods..." );
	System.out.println( "First Item: " + deque.getFirst() );
	System.out.println( "Last Item: " + deque.getLast() );

	// Test poll() methods
	System.out.println( "\nTesting poll() methods..." );
	System.out.println( "Removing first item... " + deque.removeFirst() + " removed." );
	System.out.println( "Removing last item... " + deque.removeLast() + " removed." );

	// Test Error Handling
	System.out.println( "\nTesting Error Handling in poll() methods..." );
	deque.removeFirst(); // Removes final item
	deque.removeFirst(); // Trying to remove from an empty deque
	deque.removeLast(); // Trying to remove from an empty deque

	// Done!
	System.out.println( "\nTesting Done." );
    }
    
}
