class Person2
{
    private int age;
    private String name;


    Person2(int age)
    {
        this.age = age;
    }
    Person2(String name)
    {
        this.name = name;
    }
    public void setName(String name)
    {
        this.name = name;
    }

    /*
    在Person类中，定义一个比较同龄的方法。
    */
    public boolean compare(Person2 p)
    {
		/*
		if(this.age==p.age)
			return true;
		return false;
		*/
        return this.age==p.age;

    }
    public void show()
    {
        System.out.println(this.name);
    }
    public void method()
    {
        this.show();
    }
}

/*
this:代表是一个对象的引用。
this.name：对象中的name。name是成员变量
1，用于区分局部变量和成员变量同名的情况。、
this到底代表哪个对象呢？
this就代表所在函数所属对象的引用。
this代表，哪个对象调用this所在函数，this就代表哪个对象。
什么时候使用this呢？
当定义功能是，该功能使用到了本类对象。这是就用this来表示这个对象。
*/
class ThisDemo
{
    public static void main(String[] args)
    {
        Person2 p1 =new Person2(30);
        Person2 p2 = new Person2(24);
        System.out.println(p1.compare(p2));
        p1.show();


//        Person2 p = new Person2("xili");
//        p.setName("haha");
//        Person2 p1 = new Person2("fengjie");
//        p1.setName("hehe");
//        p1.method();

    }
}
