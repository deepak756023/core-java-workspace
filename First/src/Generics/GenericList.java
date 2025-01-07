package Generics;

public class GenericList<T> {
    private  T[] items = (T[])new Object[10];
    private int count;

    public void add(T item){
        items[count++] = item;
    }
    public T show(int index){
        return items[index];
    }

}
