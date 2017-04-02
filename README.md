# Deque
An implementation of Deque (i.e, a double ended queue) that uses doubly linked nodes

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
	* `void add( T t )`
    * `T remove()`
* FILO behaving methods
	* `void push( T t )`
	* `T pop()`

We chose these methods because we wanted implementations of Deque to be able to behave as double ended quques, first in first out, or first in last out.

## Underlying Data Structure
Our underlying data structure is a doubly linked list. We chose to use this because _**\<put reason for choosing dllnode here...\>**_
