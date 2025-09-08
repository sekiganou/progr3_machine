import java.util.ArrayList;

public class generic_types_main {

    public static void main(String[] args) {
        Queue<Integer> queue1 = new Queue<>(new ArrayList<>());
        queue1.enqueue(5);
        queue1.enqueue(3);
        queue1.enqueue(4);

        System.out.println(queue1.toString());
        queue1.dequeue();
        System.out.println(queue1.toString());

        Queue<Double> queue2 = new Queue<>(new ArrayList<>());
        queue2.enqueue(5.4);
        queue2.enqueue(3.1);
        queue2.enqueue(2.5);

        System.out.println("----------------------");

        System.out.println(queue2.toString());
        queue2.dequeue();
        queue2.dequeue();
        System.out.println(queue2.toString());

    }
}