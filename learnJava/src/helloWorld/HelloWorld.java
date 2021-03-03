import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");
//        double a = 127.0;
//        double b = 10;
//        System.out.println(a / b);
//        System.out.println(getType(a / b));
//        int a = 127;
//        int b = 10;
//        System.out.println(a / b);
//        System.out.println(getType(a / b));
//        int a = 127;
//        int b = 10;
//        System.out.println(a % b);
//        System.out.println(getType(a % b));
//        char a = '1';
//        int b = 10;
//        System.out.println(a + b);
//        System.out.println(getType(a + b));
//        String a = "1";
//        int b = 10;
//        System.out.println(a + b);
//        System.out.println(getType(a + b));
        int a = 180;
        int b = 200;
        boolean c = (a == b) ? true : false;
        System.out.println(c);
        if ((a == b) ? true : false) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        int personOne = 150;
        int personTwo = 210;
        int personThree = 165;
        int tempHeight = (personOne > personTwo) ? personOne : personTwo;
        int topHeight = (tempHeight > personThree) ? tempHeight : personThree;
        System.out.println(topHeight);
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        System.out.println(i);
    }
    private static String getType(Object a) {
        return a.getClass().toString();
    }
}
