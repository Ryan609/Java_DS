package Bit_DS.Queue;

public interface Queue<E> {
    //入队操作
    void offer(E val);
    //出队操作
    E poll();
    //查看队首元素
    E peek();

    boolean isEmpty();
}
