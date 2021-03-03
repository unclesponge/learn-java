/*
设计模式：就是解决问题行之有效的方法。
单例设计模式：保证一个类在内存中的对象唯一性。
思路：
1，不让其他类建立该类对象，因为其他类建立对象会有很多。无法控制。
2，在该类中，建立一个本类对象。
3，对外提供方法获取该对象即可。
步骤：
1，私有化构造函数，不让其他类建立对象初始化，那么其他类就无法建立该类对象了。
2，建立一个本类对象。并私有和静态，
3，对外提供一个静态方法让其他类可以获取该对象。
*/

class Single{
    private static final Single s = new Single();
    private Single(){}
    public static Single getInstance(){
        return s;
    }
}

class Single2{
    private static Single2 s = null;
    private Single2(){}
    public static synchronized Single2 getInstance(){
        if (s==null){
            s = new Single2();
        }
        return s;
    }
}

class Test{

}

public class SingleDemo {
    public static void main(String[] args)
    {
        Single s1 = Single.getInstance();
        Single s2 = Single.getInstance();
        System.out.println(s1==s2);
        Single2 s21 = Single2.getInstance();
        Single2 s22 = Single2.getInstance();
        System.out.println(s21==s22);
        Test t1 = new Test();
        Test t2 = new Test();
        System.out.println(t1==t2);

    }
}
