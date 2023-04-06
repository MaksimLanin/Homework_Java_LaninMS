package Seminar3;

import java.util.ArrayList;

import java.util.Random;

public class S3Task2 {

    Random random = new Random();
    ArrayList<Integer> arrayList = new ArrayList<>();

    public ArrayList<Integer> randomFilling() {

        for (int i = 0; i < 10; i++) {
            arrayList.add(random.nextInt(100));
        }
        System.out.println("UnSort: " + arrayList);
        return arrayList;
    }
    public void Checking() {
        for (int i = 0; i < arrayList.size(); i++) {
            if ((arrayList.get(i) % 2) == 0) {
                arrayList.remove(i);
                i--;
            }
        }
        System.out.println("Sort: " + arrayList);
    }
    //    Пусть дан произвольный список целых чисел, удалить из него чётные числа
}
