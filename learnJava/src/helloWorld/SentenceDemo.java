public class SentenceDemo {
    public static void main(String[] args) {
            getLine();
            getSix();
    }

    public static void getSix(){
//        获取1~100之间6的倍数的个数。
        int count = 0;
        for(int x=1; x<=100; x++)
        {
            if(x%6==0)
                count++;
        }
        System.out.println("count="+count);
    }

    public static void getLine(){
//        3000米绳子，每天减一半，问，多少天绳子会小于5米？

        int day = 0;
        for(int x=3000; x>=5; x/=2)
        {
            day++;
        }

//		for(int x=3000; x>=5; day++)
//		{
//			x/=2;
//		}

        System.out.println("day="+day);


        int y = 1;
        for(System.out.println("a");y<3; System.out.println("c"))
        {
            System.out.println("d");
            y++;
        }
    }
}
