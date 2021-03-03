/*
构造函数之间调用使用this语句。
注意：this语句。只能放在构造函数的第一行。
因为初始化动作一定要先执行。
*/
class Person3 {
    private int age;
    private String name;

    Person3()
    {
        this("hah");
        this.name = "heihei";

    }
    private Person3(String name)
    {
        this.name = name;
    }
    Person3(String name,int age)
    {
        this.name = name;
        this.age = age;
    }

    public void show()
    {
        System.out.println("name="+name);
    }

}
class ThisDemo2
{
    public static void main(String[] args)
    {
        Person3 p = new Person3();
        p.show();

        //Person3 pp = new Person3();

    }
}
