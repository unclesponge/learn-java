/*
抽象类：
将方法声明向上抽取，
该方法没有主体，需要被abstract关键字修饰。
抽象方法一定存在于抽象类中。
抽象类的特点：
1，抽象类不可以用new关键字实例化。
2，抽象类需要被子类复写所有的抽象方法后，该子类才可以实例化。否则该子类还是抽象类。
*/

abstract class Test1{
    abstract void show();
}

class TestA extends Test1 {
    void show()
    {
        System.out.println("Testa show");
    }
}


class TestB extends Test1 {
    void show()
    {
        System.out.println("Testb show");
    }
}
class AbstractDemo {
public static void main(String[] args) {
        TestA t1 = new TestA();
        t1.show();
        TestB t2 = new TestB();
        t2.show();
        }
}

/*
通过学员的示例，发现抽象方法的出现可以强制子类去做某些事。
*/

/*
abstract class XueYuan {
    void 睡觉() {

    }
    abstract void 学习内容();
}

class YuRe extends XuYaun {
    void 学习内容() {
        System.out.println("java se");
    }
}

class JiuYe extends XuYuan {
    void 学习内容() {
        System.out.println("java ee");
    }

}

class ChongCi extends XuYuan {
    void 学习内容() {
        System.out.println("java ee");
    }
}
 */


/*
1，抽象类一定是一个父类。
	abstract class A
	{
		abstract void show();
	}
	abstract class B extends A
	{}
	class C extends B//B还是一个父类。
	{
		void show(){}
	}
2，抽象类中是否有构造函数。
	有构造函数，抽象类的构造函数给其子类进行初始化。
3，抽象类中可不可以不定义抽象方法。
	可以的。只有一个意义，不让该类实例化。
4，抽象关键字和哪些关键字不可以共存。
	abstract  class Demo
	{
		 abstract  void show();
	}
	1,final.//
	2,private
	3,static
*/
