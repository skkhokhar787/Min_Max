public class Table {
    public static void table (int n, int i){
        // Base case: if i exceeds 10, stop the recursion
        if (i > 10) {
            return;
        }
        // Print the multiplication table for n at index i
        System.out.println(n + " * " + i + " = " + (n * i));
        // Recursive call to print the next line of the table
        table(n, i + 1);
    }
    public static void main (String [] args){
        int n = 2;
        // Call the table function to print the multiplication table for n
        table(n, 1);
    }
}
