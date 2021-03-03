import java.util.ArrayList;

public class ArrayExp {
    public static void main(String[] args){
        // 数组
//        ArrayList<String> arr = new ArrayList<String>();
//        for (int i=0; i<10; i++){
//            arr.add(Integer.toString(i));
//        }
//        System.out.println(arr.toString());
//        System.out.println(getType(arr));

//        int[] arr = {12,45,98,73,60};
//        int result = 0;
//        for (int i=0; i<arr.length; i++) {
//            int a = arr[i];
//            if (a>result) {
//                result = a;
//            }
//        }
//        System.out.println(result);

        int[] arr = {3,1,6,4,7,9,2};
        ArrayTool tool = new ArrayTool();
        int max = tool.getMax(arr);

        System.out.println("max="+max);

        tool.printArray(arr);
        tool.sort(arr);
        tool.printArray(arr);
    }
}
