package Seminar3;

import java.util.ArrayList;

import static java.util.Collections.max;
import static java.util.Collections.min;

public class S3Task3 {

    S3Task2 s3Task2 = new S3Task2();


    public void Value(){
        s3Task2.randomFilling();
        int max = max(s3Task2.arrayList);
        int min = min(s3Task2.arrayList);
        int sumItems = 0;
        for (int item : s3Task2.arrayList) {
            sumItems += item;
        }
        float average = (float)sumItems/s3Task2.arrayList.size();
        System.out.printf("Максимальный элемент %s\n", max);
        System.out.printf("Минимальный элемент %s\n", min);
        System.out.printf("Сумма элементов %s\n", sumItems);
        System.out.printf("Среднее арифметическое %s\n", average);
    }



    //    Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
}
