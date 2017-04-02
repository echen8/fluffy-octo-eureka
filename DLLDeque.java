public class DLLDeque<T> implements Deque<T>{

    private int _size;
    private DLLNode<T> _front, _end;

    public DLLDeque(){
	_front = _end = null;
	_size = 0;
    }
}
