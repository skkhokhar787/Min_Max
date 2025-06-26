public class Extraction {
    public static void evenOdd (int [] arr, int i, int [] even,int [] odd,int eIdx,int oIdx){
        int eCount = 0 ,oCount = 0;
        if (i == arr.length){
            for (int k : even) {
                if (k != 0) {
                    eCount++;
                }
            }
            for (int k : odd) {
                if (k != 0) {
                    oCount++;
                }
            }
            for (int j = 0; j < eCount; j++){
                System.out.print(even[j]+" ");
            }
            System.out.println();
            for (int l = 0; l < oCount; l++){
                System.out.print(+odd[l]+" ");
            }
            return;
        }

        if (arr[i] % 2 == 0){
            even[eIdx++] = arr[i];
        }else {
            odd[oIdx++] = arr[i];
        }
        evenOdd(arr, i+1, even, odd, eIdx, oIdx);
    }
    public static void main (String [] args){
        int [] arr = {1,2,3,4,5,6,7,8,9,10,11,13,14,15};
        int [] even = new int[arr.length];
        int [] odd = new int[arr.length];
        evenOdd(arr,0,even,odd,0,0);
    }
}
