package Bit_DS.HashTable;

import java.util.NoSuchElementException;

/**
 * @author: xinyan
 * @data: 2022/05/23/20:28
 **/
public class MyHashTable {
    // 有效节点个数
    private int size;
    // 实际存储元素的Node数组
    private Node[] hashTable;
    // 取模数
    private int M;
    // 负载因子
    private static final double LOAD_FACTOR = 0.75;

    public MyHashTable() {
        this(16);
    }

    public MyHashTable(int init) {
        this.hashTable = new Node[init];
        this.M = init;
    }

    public int hash(int key) {
        return Math.abs(key) % M;
    }

    public int put(int key,int val) {
        //首先计算哈希
        int index = hash(key);
        //遍历数组第一个位置及后续链表.
        for (Node x = hashTable[index]; x != null; x = x.next) {
            //如果存在key, 就直接修改key的value
            if (x.key == key) {
                int oldVal = x.value;
                x.value = val;
                return oldVal;
            }
        }
        //此前不存在这个key, 就头插入一个新的到数组index处
        Node node = new Node(key,val);
        node.next = hashTable[index];
        hashTable[index] = node;
        size++;
        return val;
    }

    //判断key是否存在
    public boolean containsKey(int key) {
        int index = hash(key);
        for (Node x = hashTable[index]; x != null; x = x.next) {
            if (x.key == key) {
                return true;
            }
        }
        return false;
    }

    //判断value是否存在
    public boolean containsValue(int value) {
        for (int i = 0; i < hashTable.length; i++) {
            for (Node x = hashTable[i]; x != null; x = x.next) {
                if (x.value == value) {
                    return true;
                }
            }
        }
        return false;
    }


    //删除指定键值对
    public boolean remove(int key,int value) {
        int index = hash(key);
        //先判断头结点是不是要删除的节点
        Node head = hashTable[index];
        if (head.key == key && head.value == value) {
            hashTable[index] = head.next;
            size--;
            return true;
        }
        //走到这里说明头节点不是待删除的节点
        Node prev = hashTable[index];
        while (prev.next != null) {
            if (prev.next.key == key && prev.next.value == value) {
                prev.next = prev.next.next;
                size--;
                return true;
            } else {
                prev = prev.next;
            }
        }
        throw new NoSuchElementException("not has this key and value");
    }

    //扩容数组
    private void resize() {
        //先创建一个新的数组
        Node[] newHashTable = new Node[hashTable.length * 2];
        //进行元素搬移, 先进行新的取模计算
        this.M = newHashTable.length;
        for (int i = 0; i < hashTable.length; i++) {
            for (Node x = hashTable[i]; x != null;) {
                Node next = x.next;
                int index = hash(x.key);
                x.next = newHashTable[index];
                newHashTable[index] = x;
                x = next;
            }
        }
        hashTable =  newHashTable;
    }

}


class Node {
    // 对key进行hash运算
    int key;
    int value;
    // 下一个节点地址
    Node next;

    public Node(int key, int value) {
        this.key = key;
        this.value = value;
    }
}