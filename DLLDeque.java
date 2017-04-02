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

    public boolean isEmpty(){
      return _size == 0;
    }
}
