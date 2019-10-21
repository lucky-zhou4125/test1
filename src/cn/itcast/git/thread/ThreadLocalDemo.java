package cn.itcast.git.thread;

/**
 * @Discription
 * @Author rio
 * @Date 2019/10/06 20:33
 */
public class ThreadLocalDemo {

    public static void main(String[] args) {

        ThreadLocal threadLocal = new ThreadLocal();

        threadLocal.set("aa");

        Object o = threadLocal.get();

        System.out.println(o);
    }
}
