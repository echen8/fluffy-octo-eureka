# Deque
An implementation of Deque (a double ended queue) that uses doubly linked nodes

## Method Selection
* `int size()`
* Deque behaving methods
	* `void addFirst( T t )`
	* `void addLast( T t )`
	* `T getFirst()`
	* `T getLast()`
	* `T removeFirst()`
	* `T removeLast()`
* FIFO behaving methods
	* `void add( T t )` -> Equivalent to `void addLast( T t )` 
    * `T remove()` -> Equivalent to `T removeFirst()`
* FILO behaving methods
	* `void push( T t )` -> Equivalent to `void addFirst( T t )`
	* `T pop()` -> Equivalent to `T removeFirst()`
* FIFO/FILO behaving methods
	* `T peek()` -> Equivalent to `T getFirst()`

We chose these methods because we wanted implementations of Deque to be able to behave as double ended quques, first in first out, or first in last out data structures.

## Underlying Data Structure
Our underlying data structure is a doubly linked list (DLList). We chose to use this because implementations of Deque stress actions (i.e, adding/removing/getting) on elements that are either at the very beginning or very end of the list.

DLLists are very strong for this use case as adding, removing, and peeking from anywhere in the list is an O(1) operation.  
Although DLLists have an O(n) runtime for accessing arbritrary indexes, this doesn't come into play as the only indexes that should be accessed are the very beginning and ending indexes, which can be accessed with an O(1) runtime.

The alternative of using an Array(List) for our underlying datastructure isn't as strong. Depending on the implementation, using an Array(List) would result in the following O() runtimes:

| Implementation    | A    | B    |
| ---               | ---  | ---  |
| addFirst()        | O(n) | O(1) |
| addLast()         | O(1) | O(n) |
| removeFirst()     | O(n) | O(1) |
| removeLast()      | O(1) | O(n) |

Array(List)s have the advantage of having an O(1) runtime for accessing arbritrary indexes, but this isn't much of an advantage as stated earlier.

## Team fluffy-octo-eureka
Members:
* Arif Roktim
* Tim Wang
* Allan Wang
