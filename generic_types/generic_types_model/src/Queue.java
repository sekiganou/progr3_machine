import java.util.List;

public class Queue<T>
{
    private final List<T> queue;
    public Queue(List <T> queue)
    {
        this.queue = queue;
    }

    public void enqueue(T item)
    {
        queue.add(item);
    }

    public T dequeue()
    {
        return queue.removeFirst();
    }

    public boolean empty()
    {
        return queue.isEmpty();
    }

    public String toString()
    {
        return queue.toString();
    }

}
