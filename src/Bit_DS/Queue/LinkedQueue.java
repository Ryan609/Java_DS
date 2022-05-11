package Bit_DS.Queue;

import java.util.NoSuchElementException;

class Node<E> {
    E val;
    Node<E> next;

    public Node(E val) {
        this.val = val;
    }
}

public class LinkedQueue<E> implements Queue<E> {

    private int size;
    private Node<E> head;
    private Node<E> tail;

    @Override
    public void offer(E val) {
        Node<E> node = new Node<>(val);
        if (head == null) {
            head = tail = node;
        }
        tail.next = node;
        tail = node;
        size++;
    }

    @Override
    public E poll() {
        E val = head.val;
        head = head.next;
        size --;
        return val;
    }

    @Override
    public E peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("queue is empty!cannot peek!");
        }
        return head.val;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("front [");
        for (Node x = head; x != null; x = x.next) {
            sb.append(x.val);
            if (x.next != null) {
                sb.append(",");
            }
        }
        sb.append("] tail");
        return sb.toString();
    }
}
