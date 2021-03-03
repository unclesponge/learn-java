import java.util.Random;

public class RandomNum {
    public static void main(String[] args){
        //        取随机数
        Random random = new Random();
        int a = random.nextInt(10);
        System.out.println(a);
    }
}
