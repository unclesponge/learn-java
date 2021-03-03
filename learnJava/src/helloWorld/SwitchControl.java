import java.util.Scanner;

public class SwitchControl {
    public static void main(String[] args) {
//            switch条件控制
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        switch (month){
            case 3:
            case 4:
            case 5:
                System.out.println("春季");
                break;
                //注意使用break,防止穿透
            case 6:
            case 7:
            case 8:
                System.out.println("夏季");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("秋季");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("冬季");
                break;
            default:
                System.out.println("输入错误");
                break;
        }
    }
}
