class Car{
    int loop = 4;
    String color = "red";
    public void run(){
        System.out.println(loop + "---" + color);
    }
}


public class CarDemo {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.color = "blue";
        c1.run();
        Car c2 = new Car();
        c2.loop = 8;
        c2.run();

        show(c1);
        show(c2);

        new Car();
        // 匿名对象,其实就是对象的一种简写形式
        //当对方法进行一次调用的时候可以使用匿名对象
        //匿名对象可以作为实际参数进行传递
        show(new Car());
    }

    private static void show(Car c) {
        c.loop = 3;
        c.color = "black";
        c.run();
    }
}
