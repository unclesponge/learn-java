class MySystem
{
    public static void main(String[] args)
    {

		/*
		输出语句的原理：
		其实是通过System这个类中的静态属性out。所对应的对象PrintStream。
		并使用了该对象print方法。
		*/
        System.out.println("Hello World!");

        //PrintStream ps = System.out;

        //ps.println("hello");

//		MPrint p = MSystem.out;
//		p.print("hah");

        MSystem.out.print("haha");
    }
}


class MPrint
{
    public void print(String  s)
    {

    }
}

class MSystem
{
    static MPrint out = new MPrint();

}
