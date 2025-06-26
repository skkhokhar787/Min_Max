public class Extraction {
    public static void evenOdd (int [] arr, int i, int [] even,int [] odd,int eIdx,int oIdx){
        // Initialize counters for even and odd numbers
        int eCount = 0 ,oCount = 0;
        // Base case: if we have processed all elements in the array
        if (i == arr.length){
            // Count the even numbers
            for (int k : even) {
                if (k != 0) {
                    eCount++;
                }
            }
            // Count the odd numbers
            for (int k : odd) {
                if (k != 0) {
                    oCount++;
                }
            }
            // Print the even numbers
            for (int j = 0; j < eCount; j++){
                System.out.print(even[j]+" ");
            }
            System.out.println();
            // Print the odd numbers
            for (int l = 0; l < oCount; l++){
                System.out.print(+odd[l]+" ");
            }
            return;
        }
        // Check if the current number is even or odd
        if (arr[i] % 2 == 0){
            even[eIdx++] = arr[i];
        }else {
            odd[oIdx++] = arr[i];
        }
        // Recursive call to process the next element
        evenOdd(arr, i+1, even, odd, eIdx, oIdx);
    }
    public static void main (String [] args){
        // Example array to test the evenOdd function
        int [] arr = {1,2,3,4,5,6,7,8,9,10,11,13,14,15};
        int [] even = new int[arr.length];
        int [] odd = new int[arr.length];
        // Call the evenOdd function starting from index 0
        evenOdd(arr,0,even,odd,0,0);
    }
}
