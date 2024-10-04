package _1_Exercises;

public class ObjectArray<T> {
    private T[] array;
    private int size;

   
    public ObjectArray() {
        array = (T[]) new Object[10]; 
        size = 0;
    }

      public void add(T element) {
        ensureCapacity();
        array[size++] = element;
    }

    
    public void insert(int index, T element) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        ensureCapacity();
        for (int i = size; i > index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = element;
        size++;
    }

