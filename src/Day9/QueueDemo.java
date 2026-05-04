package Day9;
import java.util.*;//Include All
public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
       // System.out.println(q.element());
        System.out.println(q.peek());
        q.offer(10);
        q.offer(20);
        q.offer(30);
        q.offer(40);
        q.offer(50);
        q.add(60);
        System.out.println("Queue :"+q);
        System.out.println("Front element: "+q.peek());
        System.out.println("Head Element :"+q.element());
        System.out.println( "Poll Removal"+q.poll());
        System.out.println("Remove removal"+q.remove());
    }
}
