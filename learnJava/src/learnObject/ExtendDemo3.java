/*
子父类中构造函数的特点。(子类实例化过程)
之所以父类构造函数会运行，是因为，子类的构造函数第一行有一条隐式的语句 super();
为什么要调用父类中的构造函数呢？
因为子类继承了父类，也就是获取了父类中的成员。
子类在使用该成员之前，应该看一下父类中是如何对该成员进行初始化的。
子类中所有的构造函数都会默认访问父类中空参数的构造函数。
因为每一个构造第一行都是super().还因为父类中至少有一个默认空参数构造函数。
当父类中没有空参数的构造函数时，子类必须在构造函数中，
通过super语句来指定要访问的父类中的构造函数。
或者通过this语句来指定要访问的本类构造函数。
为什么super语句或者this语句要放在子类构造函数的第一行呢？
因为初始化动作要先执行。
*/

class SupClass //extends Object
{
    SupClass() {
        //super();
        System.out.println("sup run");
    }
    SupClass(int x) {
        System.out.println("hah");
    }
}

class SubClass extends SupClass {
    SubClass() {
        //super();
        System.out.println("sub run");
    }
    SubClass(int x) {
        this();
        System.out.println("hehe");
    }
}

class  ExtendsDemo3 {
    public static void main(String[] args) {
        SubClass sc = new SubClass(4);//sup run  sub run

    }
}

/*
默认构造函数是有权限的，权限和所属类的权限一致。
class Demo extends Object {
    Demo(){super();}
}
 */
