package cn.itcast.git;

/**
 * @Discription
 * @Author rio
 * @Date 2019/10/06 21:13
 */
public class Outer {

    static ThreadLocalMap createInheritedMap(ThreadLocalMap parentMap) {
        return new Outer.ThreadLocalMap(parentMap);
    }

    static class ThreadLocalMap{
        private ThreadLocalMap(ThreadLocalMap parentMap){
            System.out.println("ThreadLocalMap init ......");
        }
    }

    static {
        System.out.println("load outer class ......");
    }

    static class StaticInner{
        static {
            System.out.println("load static inner class ...");
        }

        static void staticInnerMethod(){
            System.out.println("static inner method ...");
        }
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.StaticInner.staticInnerMethod();


    }
}
