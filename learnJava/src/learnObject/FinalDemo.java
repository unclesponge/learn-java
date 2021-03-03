/*
final
1，final可以修饰类，成员（属性和行为），局部变量。
2，被final修饰的类不可以被继承。
3，被final修饰的方法不可以被覆盖。
4，被final修饰的变量是一个常量，只能赋值一次。
5，内部类在局部时，只能访问被final修饰的局部变量。
*/
class Test2 {
    void show(){}
}
class SubTest extends Test2 {
    public static final int x = 9;
    public static final double PI = 3.14;
    SubTest() {
        //x = 10;
    }
    SubTest(String s) {
        //x = 9;
    }
    void show(){}
}

class  FinalDemo {
    public static void main(String[] args) {
        new SubTest();
        new SubTest("haha");
    }
}
