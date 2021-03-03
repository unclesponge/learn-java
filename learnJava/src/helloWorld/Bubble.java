import java.util.ArrayList;

public class Bubble {
    public static ArrayList<Integer> maoPao(ArrayList<Integer> data){
        for (int i=0;i<data.size();i++){
            for (int j=0;j<data.size();j++){
                if (data.get(i)<data.get(j)){
                    int temp = data.get(i);
                    data.set(i, data.get(j));
                    data.set(j, temp);
                }
            }
        }
        return data;
    }
    public static void main(String[] args) {
        ArrayList<Integer> data = new ArrayList<>();
        data.add(10);
        data.add(1);
        data.add(14);
        data.add(3);
        data.add(2);
        data.add(7);
        ArrayList<Integer> result = maoPao(data);
        System.out.println(result.toString());
    }
}
