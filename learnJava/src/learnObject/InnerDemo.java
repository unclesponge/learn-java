/*
内部类可以直接访问外部类中的成员。
而外部类访问内部类需要建立内部类对象。
类是用于描述事物的。
当描述的事物当中还有事物的时候，通过内部类来描述。
当内部类是static的时候，
访问内部类中非静态成员：new 外部类.内部类().show();
当访问的内部类中的成员是静态的时候：外部类.内部类.show();
但是不建议将内部类定义成静态，因为会出现访问局限性。
当内部类需要定义静态成员时，内部类一定要被静态修饰。
注意；只有内部类定义在外部类的成员位置上，才可以被private static等成员修饰符所修饰。
非静态的内部类之所以可以直接访问外部类中的成员，
是因为内部类持有了外部类的引用。外部类.this;
*/
class Outer{
    private int x = 3;
    private int z = 9;
    class Inner{
        int x = 4;
        void show(){
            int x = 5;
            System.out.println(Outer.this.z);
        }
    }
    public void method(){
        System.out.println(this.z);
        Inner in = new Inner();
        in.show();
    }
}

class Outer2{
    int x = 5;
    public void function(final int a){
        final int z = 3;
        class Inner2{
            void show(){
                System.out.println(a);
            }
        }
        Inner2 i = new Inner2();
        i.show();
    }
}
public class InnerDemo {
    public static void main(String[] args) {
        Outer2 o = new Outer2();
        o.function(7);
        o.function(1);
    }
//    Outer.Inner.show();
//    new Outer.Inner.show();
//    Outer out = new Outer();
//    out.method();
//    Outer.Inner in = new Outer().new Inner();
//    in.show();
}
