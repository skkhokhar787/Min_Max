public class AddingElement {
    public static void main (String [] args) {
        int [] arr = {1,3,4,5,6,7,8,9,10};
        int ele = 2 , idx = 1;
        int [] newArr = new int[arr.length + 1];

        for (int i = 0; i < newArr.length; i++) {
            if (i < idx) {
                newArr[i] = arr[i];
            } else if (i == idx) {
                newArr[i] = ele;
            } else {
                newArr[i] = arr[i - 1];
            }
        }
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }

    }
}
