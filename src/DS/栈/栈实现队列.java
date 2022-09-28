package DS.栈;

import java.util.Stack;

/**
 * @author: xinyan
 * @data: 2022/09/28/09:16
 **/
public class 栈实现队列 {

    public static class twoStackToQueue<E> {
        public Stack<E> stackPush;
        public Stack<E> stackPoP;

        public twoStackToQueue() {
            stackPush = new Stack<>();
            stackPoP = new Stack<>();
        }

        public void pushToPop() {
            if (stackPoP.isEmpty()) {
                while (!stackPush.isEmpty()) {
                    stackPoP.push(stackPush.pop());
                }
            }
        }

        public void offer(E valus) {
            stackPush.push(valus);
            pushToPop();
        }

        public E poll() {
            if (stackPush.isEmpty() && stackPoP.isEmpty()) {
                throw new RuntimeException("队列为空");
            }
            pushToPop();
            return stackPoP.pop();
        }

        public E peek() {
            if (stackPush.isEmpty() && stackPoP.isEmpty()) {
                throw new RuntimeException("队列为空");
            }
            pushToPop();
            return stackPoP.peek();
        }

        public boolean isEmpty() {
            pushToPop();
            if (!stackPoP.empty()) {
                return false;
            }
            return true;
        }
    }

    public static void main(String[] args) {
        twoStackToQueue<String> queue = new twoStackToQueue<>();

//        while (!queue.isEmpty()) {
//            System.out.println(queue.poll());
//        }

    }
}
