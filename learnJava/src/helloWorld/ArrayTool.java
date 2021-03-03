public class ArrayTool {

        /**
         获取最大值。
         @param arr 接收一个int型数组。
         @return 返回该数组的最大值。
         */
        public  int getMax(int[] arr)
        {
            int max = arr[0];
            for(int x=1; x<arr.length; x++)
            {
                if(arr[x]>max)
                    max = arr[x];
            }
            return max;
        }

        /**
         选择排序。
         @param arr 接收一个int型数组。
         */
        public  void sort(int [] arr)
        {
            for(int x=0; x<arr.length-1; x++)
            {
                for(int y=x+1; y<arr.length; y++)
                {
                    if(arr[x]>arr[y])
                    {
                        int temp = arr[x];
                        arr[x] = arr[y];
                        arr[y] = temp;
                    }
                }
            }
        }

        /**
         打印数组
         */
        public void printArray(int[] arr)
        {
            for(int x=0; x<arr.length; x++)
            {
                if(x!=arr.length-1)
                    System.out.print(arr[x]+",");
                else
                    System.out.println(arr[x]);
            }
        }
        /*这是一个show方法*/
        public void show(){}

        /**
         这是一个method方法。
         */
        private void method(){}
}
