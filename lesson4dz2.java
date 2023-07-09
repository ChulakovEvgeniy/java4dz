import java.util.LinkedList;
import java.util.Queue;

public class lesson4dz2 {
    //    Реализуйте очередь с помощью LinkedList со следующими методами:
    //    enqueue() - помещает элемент в конец очереди,
    //    dequeue() - возвращает первый элемент из очереди и удаляет его,
    //    first() - возвращает первый элемент из очереди, не удаляя.
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        enqueue(queue,"q");
        enqueue(queue,"w");
        enqueue(queue,"e");
        enqueue(queue,"r");
        enqueue(queue,"t");
        System.out.println(dequeue(queue));
        System.out.println(queue);
        System.out.println(first(queue));
        System.out.println(queue);


    }
    static void enqueue(Queue queue, String str){
        queue.add(str);
    }

    static String dequeue(Queue queue){
        String st= (String) queue.poll();
        return st;
    }

    static String first(Queue queue){
        String st1 = (String) queue.peek();
        return st1;
    }
}
