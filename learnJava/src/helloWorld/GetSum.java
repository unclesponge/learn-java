public class GetSum {
    public static void main(String[] args) {
//        获取1~100之间的和
        int sum = 0;
        for(int x=0; x<=100; x++)
        {
            sum += x;
        }
        System.out.println("sum="+sum);
    }
}
