package cn.itcast.git.sort;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @Discription  冒泡排序
 * @Author rio
 * @Date 2019/10/12 14:08
 */
public class BubbleSort {

    /**
     * 7个数
     * 第一趟需要比较6次
     * 第二趟需要比较5次
     * 第三趟需要比较4次
     * 。。。。。。
     * 第六趟需要比较1次
     */

    public static int[] change(int[] arr){
        for(int i = 0; i < arr.length-1; i++){
            for(int j = 0; j<arr.length-1-i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {10,5,3,6,2,3,9};
        int[] newArray = BubbleSort.change(arr);
        ArrayList list = new ArrayList(Arrays.asList(newArray));
    }

}
