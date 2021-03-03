/*
子父类中成员变量，和一般方法的特点。
*/

class Fu {
    //int x = 3;
    public  void show() {
        System.out.println("number--");
    }
}

/*
当子类定义了与父类中一模一样的方法的时，就会发生一个操作：覆盖（重写）。
覆盖只发生在函数上。
覆盖使用的注意事项：
1，子类覆盖父类时，权限一定要大于等于父类权限。
2，静态只能覆盖静态。
super:和this的用法一样，
不同之处是：
this代表本类对象的引用。
super代表的是父类对象的引用。
*/

class Zi extends Fu {
    //int x = 4;
    public void show() {
        super.show();
        System.out.println("name");
        System.out.println("photo");
    }
}

class  ExtendsDemo2 {
    public static void main(String[] args) {
        Zi z = new Zi();
        z.show();
    }
}