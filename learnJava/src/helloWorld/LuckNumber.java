public class LuckNumber {
    public static void main(String[] args) {


        int[] arr = {1,2,3,4,5,6,7,8};

        int pos = -1;

        for(int x=0; x<arr.length-1; x++)
        {
            for(int y=0; y<3; y++)
            {
                pos++;
                if(pos==arr.length)
                    pos = 0;
                while(arr[pos]==0)
                {
                    pos++;
                    if(pos==arr.length)
                        pos = 0;
                }
            }
            //System.out.println(pos+"...."+arr[pos]);
            arr[pos] = 0;
        }
        for(int x=0; x<arr.length; x++)
        {
            System.out.print(arr[x]+" ");
        }
    }
}
