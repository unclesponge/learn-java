import java.util.Scanner;

public class InputOuput {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int personOne = sc.nextInt();
        int personTwo = sc.nextInt();
        int personThree = sc.nextInt();
        int tempHeight = (personOne > personTwo)? personOne:personTwo;
        int topHeight = (tempHeight > personThree)? tempHeight:personThree;
        System.out.println(topHeight);
        int a = sc.nextInt();
        if (a%2==0){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
    }
}
