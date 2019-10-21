package cn.itcast.git;

import java.util.HashMap;

/**
 * @Discription
 * @Author rio
 * @Date 2019/10/04 17:34
 */
public class TestGit3 {


    public static void main(String[] args) {
        String s1 = "aa";
        String s2 = "aa";
        System.out.println( s1.equals(s2));

        String s3 = new String("bb");
        String s4 = new String("bb");
        System.out.println("s3==s4 = " + s3==s4);
        System.out.println("s3.equals(s4) = " + s3.equals(s4));
        System.out.println("s3.hashCode() = " + s3.hashCode());
        System.out.println("s4.hashCode() = " + s4.hashCode());

        HashMap<String, Object> map = new HashMap<>();
        map.put(s3, "aaa");
        map.put(s4, "aaaa");
        System.out.println(map);


    }
}
