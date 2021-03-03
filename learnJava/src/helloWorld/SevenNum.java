public class SevenNum {
    public static void main(String[] args) {
        printSevenNumber();
    }
    public static void printSevenNumber(){
        for (int i=1; i<101; i++){
            if (i%10==7){
                System.out.println(i);
            }else if(i/10%10==7){
                System.out.println(i);
            }else if(i%7==0){
                System.out.println(i);
            }
        }
    }
}
