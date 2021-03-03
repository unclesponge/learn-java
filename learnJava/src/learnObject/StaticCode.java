/*
静态代码块。
static
{
}
随着类的加载而执行，优先于主函数执行。而且只执行一次。
可以对类进行初始化。
*/

class Demo{
    static {
        System.out.println("c");
    }{
        System.out.println("haha");
    }
    Demo(){
        System.out.println("kk");
    }
    public static void show(){
        System.out.println("show run");
    }
}

public class StaticCode {
    public static void main(String[] args) {
        new Demo().show();
    }
}
