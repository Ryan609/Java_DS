package DS.zuoClass.前缀树;


/**
 * @author: xinyan
 * @data: 2022/10/06/16:40
 **/
public class TrieArray {
    class Node {
        public int pass;
        public int end;
        public Node[] nexts;

        public Node() {
            pass = 0;
            end = 0;
            nexts = new Node[26];
        }
    }

    private Node root;
    public TrieArray() {
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
            index = chars[i] - 'a';
            if (node.nexts[index] == null) {
                node.nexts[index] = new Node();
            }
            node = node.nexts[index];
            node.pass++;
        }
        node.end++;
    }

    public void erase(String word) {
        if (countWordsEqualTo(word) != 0) {
            char[] chars = word.toCharArray();
            Node node = root;
            node.pass--;
            int index = 0;
            for (int i = 0; i < chars.length; i++) {
                index = chars[i] - 'a';
                if (--node.nexts[index].pass == 0) {
                    node.nexts[index] = null;
                    return;
                }
                node = node.nexts[index];
            }
            node.end--;
        }
    }

    // 总共有多少个word
    public int countWordsEqualTo(String word) {
        if (word == null) {
            return 0;
        }
        char[] chars = word.toCharArray();
        Node node = root;
        int index = 0;
        for (int i = 0;  i < chars.length; i++) {
            index = chars[i] - 'a';
            if (node.nexts[index] == null) {
                return 0;
            }
            node = node.nexts[index];
        }
        return node.end;
    }

    // 总共有多少个以pre为开始的string
    public int countWordsStartingWith(String pre) {
        if (pre == null) {
            return 0;
        }
        char[] chars = pre.toCharArray();
        Node node = root;
        int index = 0;
        for (int i = 0;  i < chars.length; i++) {
            index = chars[i] - 'a';
            if (node.nexts[index] == null) {
                return 0;
            }
            node = node.nexts[index];
        }
        return node.pass;
    }
}
