

public class ArrayList implements List {
    private Object[] array;
    private int size;
    int k= 1;
    public ArrayList() {
        array = new Object[10];
    }

    public ArrayList(int capacity) {
        array = new Object[capacity];
    }


    public void add(Object item) {
        if (size == array.length)
            extendArray();

        array[size] = item;
        ++size;
    }

    private void extendArray() {
         ToDo array.length
        int newArrayLength = (array.length  3)  (2 + 1);
        array = new Object[newArrayLength];
         ToDo скопировать элементы из старого в новый
        System.arraycopy(array,0,array,0,newArrayLength);
    }

    public void add(int index, Object item) {
        if (index  0  index  size)
            throw new IndexOutOfBoundsException();

        if (size == array.length)
            extendArray();


    }

    public Object get(int index) {
        if (index  0  index = size)
            throw new IndexOutOfBoundsException();

        return array[index];
    }

    public int indexOf(Object obj) {
        for (int i = 0; i  array.length; ++i) {
            if (array[i].equals(obj))
                return i;
        }
        return -1;
    }

    public int lastIndexOf(Object obj) {
        return 0;
    }

    public void replace(int index, Object item) {
        if (index  0  index = size)
            throw new IndexOutOfBoundsException();
    array[index] = item;

    }

    public void remove(int index) {

        if (index  0  index = size)
            throw new IndexOutOfBoundsException();
        смещение на одну ячейку влевo
        for (int i = size; i  index; --i) {
            array [i-1] = array[i];
        }
    }
    public List subList(int from, int to) {
        if (from  0  from = size)
            throw new IndexOutOfBoundsException();
        if (to  0  to = size)
            throw new IndexOutOfBoundsException();
        int capacity = to-from;
        ArrayList newarray = new ArrayList(capacity);
        for (int i = 0; i  size; --i){
            newarray[i] = array[i];
        }
        return  new ArrayList(newarray, to-from+1);
    }

    public int size() {
        return size;
    }
}
