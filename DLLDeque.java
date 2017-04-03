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
      if( _end == null ){ _front = null; }
      _size--;
      return retVal;
    }

    public boolean isEmpty(){
      return _size == 0;
    }

    public int size(){
      return _size;
    }

    public String toString(){
        String retStr = "=====FRONT=====\n";
        DLLNode<T> ptr = _front;
        while( ptr != null ){
            //retStr += ptr.toString() + ", ";
            retStr += "Node cargo:\t" + ptr.toString() + "\tPrev:\t" + ptr.getPrev() + "\tNext:\t" + ptr.getNext() + "\n";
            ptr = ptr.getNext();
        }
        retStr += "=====END=====";
        return retStr;
    }

    public static void main( String[] args ){
        DLLDeque<String> test;

        test = new DLLDeque<String>();
        test.addLast( "bob" );
        test.addLast( "dog" );
        test.addLast( "test" );
        System.out.println( test );
        //Output: =====FRONT, bob, dog, test, END=====

        test.addFirst( "jake" );
        test.addFirst( "alan" );
        test.addFirst( "nodes" );
        System.out.println( test );
        //Output: =====FRONT, bob, dog, test, bob, dog, test, END=====

        //System.out.println( "Removed from last: " + test.removeLast() );
        //System.out.println( "Removed from last: " + test.removeLast() );
        System.out.println( "Removed from first: " + test.removeFirst() );
        System.out.println( "Removed from first: " + test.removeFirst() );
        System.out.println( test );


    }
}
