package Bit_DS.Stack;

import java.util.ArrayList;
import java.util.List;

public class MyStack<E> {
    private int size;
    private List<E> data = new ArrayList<>();

    public void push(E val) {
        data.add(val);
        size++;
    }

    public E pop() {
        E val = data.remove(size - 1);
        size --;
        return val;
    }

    public E peek() {
       E val =  data.get(size - 1);
       return val;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < size; i++) {
            sb.append(data.get(i));
            if (i != size - 1) {
                sb.append(",");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
