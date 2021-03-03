import java.util.Scanner;

public class GetMax {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while (true) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int result = getMax(a, b);
            System.out.println(result);
        }
    }
    public static int getMax(int a, int b){
        if (a>b){
            return a;
        }else {
            return b;
        }
    }
}
