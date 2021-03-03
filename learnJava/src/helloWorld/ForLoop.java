public class ForLoop {
    public static void main(String[] args){
//        for循环
        for (int i=100; i < 1000; i++) {
            int a = i/100;
            int b = (i - a*100)/10;
            int c = i - a*100 - b*10;
            int result = a*a*a + b*b*b + c*c*c;
            if (result== i){
                System.out.println(result);
            }
        }
    }
}
