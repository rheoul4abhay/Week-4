package QueueInterface.generateBinaryUsingQueue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class GenerateBinaryNumberUsingQueue {
    public static List<String> generateBinaryNumbers(int n){
        List<String> result = new ArrayList<>();
        if(n <= 0) return result;

        Queue<String> queue = new LinkedList<>();
        //initializing first element of the queue as "1"
        queue.offer("1");

        while(result.size() < n){
            //remove first element
            String currentELement = queue.poll();
            //add it to the result list
            result.add(currentELement);

            queue.offer(currentELement + "0");
            queue.offer(currentELement + "1");
        }
        return result;
    }

    public static void main(String[] args){
        int n = 10;
        List<String> binaryNumbers = generateBinaryNumbers(n);
        System.out.println("Generated " + n + " binary numbers are : " + binaryNumbers);
    }
}
