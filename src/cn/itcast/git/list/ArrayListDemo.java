package cn.itcast.git.list;

import java.util.ArrayList;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Discription
 * @Author rio
 * @Date 2019/10/06 7:39
 */
public class ArrayListDemo {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        System.out.println("arrayList.size() = " + arrayList.size());

        arrayList.add(1);
        arrayList.add(3);
        arrayList.add(5);
        arrayList.add(7);
        arrayList.add(9);

        System.out.println("arrayList.size() = " + arrayList.size());
        System.out.println(arrayList);

        String[] arr = {"aa", "bb", "cc"};
        System.out.println(arr.length);
        System.out.println(arr);

        Lock lock = new ReentrantLock();
        Condition condition1 = lock.newCondition();
        Condition condition2 = lock.newCondition();

        System.out.println("仙剑奇侠传一");

    }
}
