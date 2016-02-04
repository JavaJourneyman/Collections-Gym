import java.util.LinkedList;
import java.util.Stack;

/**
 * Created by yusufjones on 2/3/16.
 */
public class Queues {//First in first out, bottom up.
    public static void main(String[] args) {
        LinkedList<String> queueExample= new LinkedList<String>();
        queueExample.add("One");
        queueExample.add("Two");

        System.out.println(queueExample.peek());//Return the first item but doesn't remove
        System.out.println(queueExample.poll());//Returns and removes the head element of only queue

        Stack<String> stackExample= new Stack<String>();//Last in first out from top
        stackExample.add("One");
        stackExample.add("Two");

        System.out.println(stackExample.peek());//Return the first item but doesn't remove from either
        System.out.println(stackExample.pop());//Returns and removes the head element of only stack

    }

}
