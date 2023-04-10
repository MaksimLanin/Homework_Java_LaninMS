package Seminar4;


import java.util.LinkedList;
import java.util.Random;

public class S4Task2 {
    S4Task1 s4Task1 = new S4Task1();
    Random random = new Random();

    public void Metod() {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            enqueue(list, random.nextInt(10));
        }
        System.out.println(list);

        System.out.println("возвращает первый элемент из очереди и удаляет его: " + dequeue(list));
        System.out.println(list);

        System.out.println("возвращает первый элемент из очереди, не удаляя: " + first(list));
        System.out.println(list);
    }

    public void enqueue(LinkedList<Integer> list, int num) {
        list.addLast(num);
    }

    public static int dequeue(LinkedList<Integer> list) {
        int num = list.get(0);
        list.remove(0);
        return num;
    }

    public static int first(LinkedList<Integer> list) { // возвращает первый элемент из очереди, не удаляя
        int num = list.get(0);
        return num;


//    Реализуйте очередь с помощью LinkedList со следующими методами:
//            • enqueue() — помещает элемент в конец очереди,
//            • dequeue() — возвращает первый элемент из очереди и удаляет его,
//            • first() — возвращает первый элемент из очереди, не удаляя.
    }
}
