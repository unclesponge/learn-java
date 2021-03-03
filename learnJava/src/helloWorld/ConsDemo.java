import java.nio.file.NotLinkException;

class Person{
    private int age;
    private String name;
    Person(){
        System.out.println(name+"::"+age);
    }
    Person(String n){
        this.name = n;
    }
    public void setName(String n){
        this.name = n;
    }
    public String getName(){
        return this.name;
    }
    Person(String n, int a){
        name = n;
        age = a;
        cry();
    }
    public void speak(){
        System.out.println(name+"::"+age);
    }
    public void cry(){
        System.out.println(name+" cry");
    }
}

/*
对象一旦建立, 构造函数就运行了
构造函数的作用:用于给对象进行初始化
构造函数和一般函数的区别:
构造函数对象已建立就会运行
而一般方法，需要被对象调用才会被执行
Person p2 = new Person("wangwu",30);
Person p1=new Person();
1,先加载Person.class文件
2，在堆内存中开辟空间，
3，对该空间的属性进行初始化
	3.1默认初始化
	3.2显示初始化
	3.3构造函数初始化
4，在栈中开辟空间，p2存在，并将对象的内存地址值付给p2
5，p2就指向了该对象。
通过class定义的类中，
都有一个默认的空参数构造函数
这个函数是系统自动帮你加上的
但是，当类中有了自定的构造函数时，默认的构造函数就没有了
什么时候定义构造函数呢？
描述类是为了建立对象，建立对象时就需要执行的内容，定义在构造函数中
 */

public class ConsDemo {
    public static void main(String[] args) {
        Person p = new Person();
        Person p1 = new Person("lisi");
        p1.speak();

        Person p2 = new Person("wangwu",30);

        p2.setName("wangcai");
        p2.setName("小强");
        System.out.println(p2.getName());
        p2.speak();

        Person zhangsan=new Person();
        Person lisi=new Person();
//        System.out.println("zhangsan.name="+zhangsan.name);
//        System.out.println("zhangsan.age="+zhangsan.age);
        zhangsan.setName("张三");
        lisi.setName("李四");
    }
}
