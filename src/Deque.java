public class Deque extends Queue{
    private final static int DEFSIZE = 16;
    //private int[] array;
    //private int size, head, tail;
    public Deque(int capacity){
        super(capacity);
    }
    public Deque(){
        super();
    }
    //Вернуть индекс предыдущего за данным элемента.
    public int backward(int index) {
        return --index > 0 ? index : tail;
    }
    //Добавить число в начало дека
    public void pushFront(int val) throws Exception{
        if(++size > array.length)
            throw new Exception();
        array[head = backward(head)] = val;
    }

    //Получить последний элемент дека (не удаляя его).
    public int back() throws Exception {
        if(empty())
            throw new Exception();
        return array[tail];
    }
    //Удалить последний элемент дека.
    public int popBack() throws Exception {
        int val = back();
        tail = backward(tail);
        size -= 1;
        return val;
    }
}

