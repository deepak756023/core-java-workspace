package Generics;

public class List {
    private Object[] list = new Object[10];
    private int count;
    public void add(Object item){
        list[count++] = item;
    }
    public Object show(int index){
        return list[index];
    }
}
