class MinMaxFind{
    public static void minMax (int [] arr,int i, int min, int max){
        if (i == arr.length){
            System.out.println("Minimum number in array is : "+min);
            System.out.println("Maximum number in array is : "+max);
            return;
        }
        int currentNum = arr[i];
        if (currentNum > max){
            max = currentNum;
        }
        if (currentNum < min){
            min = currentNum;
        }
        minMax(arr, i+1, min, max);
    }
    public static void main (String[] args){
        int [] arr = {4,1,2,5,8,9,6,3,7};
        minMax(arr,0,Integer.MAX_VALUE,Integer.MIN_VALUE);
    }
}