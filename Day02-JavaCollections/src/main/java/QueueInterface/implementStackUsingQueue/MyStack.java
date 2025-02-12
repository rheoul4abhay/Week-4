package QueueInterface.implementStackUsingQueue;

import java.util.LinkedList;
import java.util.Queue;

public class MyStack <T> {
    public Queue<T> queue1;
    public Queue<T> queue2;

    public MyStack(){
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }

    public void push(T element){
        if(queue1.isEmpty()){
            queue1.offer(element);
            while(!queue2.isEmpty()){
                queue1.offer(queue2.poll());
            }
        } else {
            queue2.offer(element);
            while(!queue1.isEmpty()){
                queue2.offer(queue1.poll());
            }
        }
    }

    public T pop(){
        if(empty()) {
            return null;
        }
        if(!queue2.isEmpty()){
            return queue2.poll();
        } else {
            return queue1.poll();
        }
    }

    public T top(){
        if(empty()){
            return null;
        }
        if(!queue2.isEmpty()){
            return queue2.peek();
        } else {
            return queue1.peek();
        }
    }

    public boolean empty(){
        return queue1.isEmpty() && queue2.isEmpty();
    }

    @Override
    public String toString(){
        if(!queue1.isEmpty()) return queue1.toString();
        else return queue2.toString();
    }
}
