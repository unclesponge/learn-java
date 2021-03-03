/*
需求：
获取自定义程序运行的时间。
模版方法设计模式：
解决问题：定义功能时，一部分功能确定，一部分不确定的时候。
	将不确定的部分暴露出去，由子类是完成。
*/

abstract class GetTime {
    public final void getTime() {
        long start = System.currentTimeMillis();
        run();
        long end = System.currentTimeMillis();
        System.out.println("毫秒:"+(end-start));
    }

    public abstract  void run();
}

class Sub extends GetTime {
    public void run() {
        for(int x=0; x<10000; x++) {
            System.out.println(x);
        }
    }
}

class  TemplateDemo {
    public static void main(String[] args) {
        new Sub().getTime();
    }
}
