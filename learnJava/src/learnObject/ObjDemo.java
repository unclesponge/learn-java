class ObjDemo {
    static int count = 0;

    ObjDemo()
    {
        count++;
    }
}

class ObjectCount {
    public static void main(String[] args)
    {
        new ObjDemo();
        new ObjDemo();
        new ObjDemo();
        new ObjDemo();
        new ObjDemo();
        new ObjDemo();
        new ObjDemo();
        new ObjDemo();
        new ObjDemo();
        System.out.println(ObjDemo.count);
    }
}
