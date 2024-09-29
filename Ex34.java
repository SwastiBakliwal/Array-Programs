import java.io.IOException;
class Ex34 
{
    // Method 1
    // To swap First and Last Row
    static void swap_First_last(int mat[][])
    {
        int rws = mat.length;
 
        // Interchanging of elements between the
        // first and last rows
        for (int j = 0; j < mat[0].length; j++) {
 
            // Using temporary variable so in order
            // not to lose the values of the matrix
            // Simply, swapping the values stored
            int temp = mat[0][j];
            mat[0][j] = mat[rws - 1][j];
            mat[rws - 1][j] = temp;
        }
    }
 
    // Method 2
    // Main driver method
    public static void main(String args[])
        throws IOException
    {
        // Input integer matrix
        int mat[][] = { { 2, 3, 4, 5 },
                        { 8, 9, 6, 15 },
                        { 13, 22, 11, 18 },
                        { 19, 1, 2, 0 } };
 
        // Display message only
        System.out.println("Input matrix is as follows : ");
 
        // Printing the Input matrix
        for (int j = 0; j < mat.length; j++) {
            for (int k = 0; k < mat[0].length; k++)
 
                // Print the elements of the input matrix
                System.out.print(mat[j][k] + " ");
 
            // New line as row ended
            System.out.println();
        }
 
        System.out.println(
            "Swapped matrix is as follows : ");
 
        // Calling the (method1) to swap rows in a matrix
        swap_First_last(mat);
 
        // Printing the Swapped matrix
        for (int j = 0; j < mat.length; j++) {
            for (int k = 0; k < mat[0].length; k++)
 
                // Print the elements of the swapped matrix
                System.out.print(mat[j][k] + " ");
 
            // New line as row ended
            System.out.println();
        }
    }
}
