/*
abstract class AbsDemo{
	abstract void show1();
	abstract void show2();
}
接口可以理解为是一个特殊的抽象类。
接口中的方法都是抽象的。
接口可以定义的变量是一个常量。
*/

/*
一个类必须覆盖接口中所有的抽象方法后，才可以被实例化。否则，该类是一个抽象类。
java中不支持多继承，但是保留了多继承机制，通过多实现的方式来体现。
而java中的接口是可以多继承的。
通过主板的例子来说明接口的特点：
1，接口是功能的扩展。
2，接口其实就是对外暴露的规则。
3，降低了藕合性。
4，一个类继承了一个类的同时可以实现多个接口。
    通过学员类的抽烟接口示例演示。
	class Wangwu extends XuYuan implments ChouYan,HeJiu{
		public void 学习内容(){}
		public void smoke(){}
		public void jiu(){}
	}
*/
interface AbsDemo {
    public static final int x = 3;
    public abstract void show1();
    public abstract void show2();
}

interface A {
    void show4();
}

interface AbsDemo1 extends AbsDemo,A {
    public void show3();
}

class SubDemo implements AbsDemo1 {
    public void show1(){}
    public void show2(){}
    public void show3(){}
    public void show4(){}
}


class InterfaceDemo {
    public static void main(String[] args) {
        SubDemo s = new SubDemo();
        System.out.println(s.x);
        System.out.println(SubDemo.x);
        System.out.println(AbsDemo.x);
    }
}
