package collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueCollection {

    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<String>();
        //offer : return (true false : ds con trong/het cho);
        queue.offer("SAMSUNG");
        queue.offer("LG");
        queue.offer("APPLE");
        queue.offer("BPHONE");
        queue.add("HTC");
        queue.add("VPHONE");
        while (true){
            String value = queue.poll();
            if(value == null) break;
            System.out.println(value);
        }

    }
}
