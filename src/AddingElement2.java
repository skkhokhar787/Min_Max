public class AddingElement2 {
    public static void addEle (int [] arr, int i, int ele, int idx, int [] newArr) {
        // Base case: if we have processed all elements in the original array
        if (i == newArr.length) {
            newArr[idx] = ele; // Insert the new element at the specified index
            return;
        }
        // If we are at the index where we need to insert the new element
        if (i < idx) {
            newArr[i] = arr[i];
            addEle(arr, i+1, ele, idx, newArr);
        } else if (i == idx) {
            newArr[i] = ele;
            addEle(arr, i+1, ele, idx, newArr);
        } else {
            newArr[i] = arr[i-1];
            addEle(arr, i+1, ele, idx, newArr);
        }
    }
    public static void main (String [] args) {
        int [] arr = {1, 3, 4, 5, 6, 7, 8, 9, 10};
        int ele = 2; // Element to be added
        int idx = 1; // Index at which the element should be added
        int [] newArr = new int[arr.length + 1]; // New array with one extra space

        addEle(arr, 0, ele, idx, newArr); // Start the recursive addition
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " "); // Print the new array
        }
    }
}
