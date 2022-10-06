package DS.zuoClass.前缀树;

import java.util.HashMap;

/**
 * @author: xinyan
 * @data: 2022/10/06/16:23
 **/
public class Trie {
    class Node {
        public int pass;
        public int end;
        public HashMap<Integer, Node> nexts;

        public Node() {
            pass = 0;
            end = 0;
            nexts = new HashMap<>();
        }
    }

    private Node root;
    public Trie() {
        root = new Node();
    }

    public void insert(String word) {
        if (word == null) {
            return;
        }
        char[] chars = word.toCharArray();
        Node node = root;
        node.pass++;
        int index = 0;
        for (int i = 0; i < chars.length; i++) {
            index = (int) chars[i];

        }
    }
}
