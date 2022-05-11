package Bit_DS.Queue;

import java.util.NoSuchElementException;

public class LoopQueue implements Queue<Integer>{

    private Integer[] data;
    private int head;
    private int tail;

    public LoopQueue(int size) {
        // 因为循环队列中要浪费一个空间判断是否已满
        data = new Integer[size + 1];
    }

    @Override
    public void offer(Integer val) {
        if (isFull()) {
            throw new ArrayIndexOutOfBoundsException("loopQueue is full,cannot offer");
        }
        data[tail] = val;
        tail = (tail+1) % data.length;
    }

    @Override
    public Integer poll() {
        if (isEmpty()) {
            throw new NoSuchElementException("loopQueue is empty!cannot poll");
        }
        Integer val = data[head];
        head = (head+1) % data.length;
        return val;
    }

    @Override
    public Integer peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("loopQueue is empty!cannot peek");
        }
        return data[head];
    }

    @Override
    public boolean isEmpty() {
        return head == tail;
    }

    public boolean isFull() {
        return (tail + 1) % data.length == head;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("front [");
        int lastIndex = tail == 0 ? data.length - 1 : tail - 1;
        for (int i = head; i != tail;) {
            sb.append(data[i]);
            // 最后一个有效元素的索引是多少？
            if (i != lastIndex) {
                sb.append(", ");
            }
            i = (i + 1) % data.length;
        }
        sb.append("] tail");
        return sb.toString();
    }
}
