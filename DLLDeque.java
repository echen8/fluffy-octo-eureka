public class DLLDeque<T> implements Deque<T>{

    private int _size;
    private DLLNode<T> _front, _end;

    public DLLDeque(){
	_front = _end = null;
	_size = 0;
    }

    public void addFirst(T t){
      DLLNode<T> newNode = new DLLNode<T>(t, null, null);
      if (isEmpty()){
        _front = _end = newNode;
      }
      else {
        _front.setPrev(newNode);
        _front = _front.getPrev();
      }
    }

    public void addLast(T t){
      DLLNode<T> newNode =  new DLLNode<T>(t, null, null);
      if (isEmpty()){
        _front = _end = newNode;
      }
      else {
        _end.setNext(newNode);
        _end = _end.getNext();
      }
    }

    public T getFront(){
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
      }
      return retVal;
    }

    public T removeLast(){
      T retVal = _end.getCargo();
      _end = _end.getPrev();
      return retVal;
    }

    public boolean isEmpty(){
      return _size == 0;
    }

    public int size(){
      return _size;
    }

    
}
