/*Реализуйте очередь с помощью LinkedList со следующими методами:enqueue() - помещает элемент в конец очереди, 
dequeue() - возвращает первый элемент из очереди и удаляет его, first() - возвращает первый элемент из очереди, не удаляя. */

import java.util.LinkedList;

public class Les4_dz2 {
    public static void main(String[] args) {
        Deque dq = new Deque();
        dq.enqueue(6);
        dq.enqueue(7);
        dq.enqueue(8);
        dq.enqueue(9);
        dq.enqueue(10);
        dq.print();
        System.out.println();
        dq.dequeue();
        dq.print();
        System.out.println();
        dq.dequeue();
        dq.print();
        System.out.println();
        System.out.println(dq.first());
        dq.print();
    }
}

class Deque {
    LinkedList<Integer> deque;
    {
        deque = new LinkedList<>();
    }

    void enqueue(int n) {
        this.deque.addLast(n);
    }

    void dequeue() {
        this.deque.removeFirst();
    }

    Integer first() {
        return this.deque.getFirst();
    }

    void print() {
        for (Integer item : this.deque) {
            System.out.printf("%d ", item);
        }
    }
}