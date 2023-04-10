package Seminar4;

import java.util.LinkedList;
import java.util.Random;

public class S4Task1 {

    Random random = new Random();
    LinkedList<Integer> list = new LinkedList<>();

    public void RandomFilling() {

        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(10));
        }
        System.out.println(list);
    }
        public void RevertList(){
        for (int i = 0; i < 10; i++) {
            System.out.println("[" + list.getLast() + "]");
            list.removeLast();
        }

    }
}
