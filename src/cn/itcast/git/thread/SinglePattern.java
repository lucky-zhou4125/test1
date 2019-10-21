package cn.itcast.git.thread;

/**
 * @Discription
 * @Author rio
 * @Date 2019/10/12 14:00
 */
public class SinglePattern {

    private SinglePattern(){}

    private static volatile SinglePattern singlePattern;

    public static SinglePattern getSinglePattern(){
        if(singlePattern == null){
            synchronized (SinglePattern.class) {
                if(singlePattern == null){
                    singlePattern = new SinglePattern();
                }
            }
        }
        return singlePattern;
    }
}
