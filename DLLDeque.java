public class DLLDeque<T> implements Deque<T>{

    private int _size;
    private DLLNode<T> _front, _end;

    public DLLDeque(){
	_front = _end = null;
	_size = 0;
    }

    public void addFirst(T newVal){
      DLLNode<T> newNode = new DLLNode<T>(newVal, null, _front);
      if (isEmpty()){
        _front = _end = newNode;
      }
      else {
        _front.setPrev(newNode);
        _front = _front.getPrev();
      }
      _size++;
    }

    public void addLast(T t){
      DLLNode<T> newNode =  new DLLNode<T>(t, _end, null);
      if (isEmpty()){
        _front = _end = newNode;
      }
      else {
        _end.setNext(newNode);
        _end = _end.getNext();
      }
      _size++;
    }

    public T getFirst(){
      return _front.getCargo();
    }

    public T getLast(){
      return _end.getCargo();
    }

    public T removeFirst(){
      T retVal = _front.getCargo();
      _front = _front.getNext();
      if (_front == null){
        _end = null;
      } else {
          _front.setPrev( null );
      }
      _size--;
      return retVal;
    }

    public T removeLast(){
      T retVal = _end.getCargo();
      _end = _end.getPrev();
      _end.setNext( null );
      if( _end == null ){ _front = null; }
      _size--;
      return retVal;
    }

    //FIFO
    public void add(T t){
	addLast(t);
    }

    public T remove(){
	return removeFirst();
    }

    //FILO
    public void push(T t){
	addFirst(t);
    }

    public T pop(){
	return removeFirst();
    }

    public T peek(){
	return getFirst();
    }

    public boolean isEmpty(){
      return _size == 0;
    }

    public int size(){
      return _size;
    }

    public String toString(){
        String retStr = "=====FRONT, ";
        DLLNode<T> ptr = _front;
        while( ptr != null ){
            retStr += ptr.toString() + ", ";
            ptr = ptr.getNext();
        }
        retStr += "END=====";
        return retStr;
    }

    public static void main( String[] args ){
        DLLDeque<String> test;

        System.out.println( "==========Testing as a Deque==========\nAdding to end: bob, dog, test" );
        test = new DLLDeque<String>();
        test.addLast( "bob" );
        test.addLast( "dog" );
        test.addLast( "test" );
        System.out.println( test );

        System.out.println( "Adding to beginning: jake, alan, nodes" );
        test.addFirst( "jake" );
        test.addFirst( "alan" );
        test.addFirst( "nodes" );
        System.out.println( test );

        System.out.println( "Removed from first: " + test.removeFirst() );
        System.out.println( "Removed from first: " + test.removeFirst() );
        System.out.println( test );
        System.out.println( "Removed from last: " + test.removeLast() );
        System.out.println( "Removed from last: " + test.removeLast() );
        System.out.println( test );


        System.out.println( "\n==========Testing as a FILO============\nPushed: bob, dog, test" );
        test = new DLLDeque<String>();
        test.push( "bob" );
        test.push( "dog" );
        test.push( "test" );
        System.out.println( test + "\nPopping..." );
        while( ! test.isEmpty() ){
            System.out.println( "Popped: " + test.pop() );
        }
	
        System.out.println( "\n==========Testing as a FIFO============\nAdded: bob, dog, test" );
        test = new DLLDeque<String>();
        test.add( "bob" );
        test.add( "dog" );
        test.add( "test" );
        System.out.println( test + "\nRemoving..." );
        while( ! test.isEmpty() ){
            System.out.println( "Removed: " + test.remove() );
        }

        System.out.println( "\nThrow in an exception just for the lulz" );
        test.remove();
	
    }
}
