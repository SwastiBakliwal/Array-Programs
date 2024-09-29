
class Ex35 
{
  // Java Program to Interchange Elements of the
// First and Last Column in a Matrix
 
// Importing input output classes

 
    // Declare static variable and initialize to
    // order of the matrix
    static int N = 3;
 
    // Method 1
    // To swap first and last column in a matrix
    static void Swap_First_Last(int mat[][])
    {
       // int cls = N;
 
        // Interchanging of elements between the
        // first and last columns
        for (int j = 0; j < N; j++) {
            int temp = mat[j][0];
            mat[j][0] = mat[j][N - 1];
            mat[j][N - 1] = temp;
        }
    }
 
    // Method 2
    // Main driver method
    public static void main(String[] args)
    {
        // Creating 2D integer element matrix
        // Custom input matrix
        int mat[][]
            = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
 
        // Outer loop for rows
        for (int j = 0; j < N; j++) {
 
            // Inner loop for columns
            for (int k = 0; k < N; k++) {
 
                // Print the input matrix
                System.out.print(mat[j][k] + " ");
            }
            // Operations over a row is computed so new line
            System.out.println();
        }
 
        System.out.println("Swapped Matrix as follows : ");
 
        // Now, calling the (Method1) to interchange
        // first and last columns in above matrix
        Swap_First_Last(mat);
 
        // Now simply print the updated matrix
        // Swapped matrix using nested for loops
 
        // Outer loop for rows
        for (int j = 0; j < N; j++) {
 
            // Inner loop for columns
            for (int k = 0; k < N; k++)
 
                // Print the swapped matrix
                System.out.print(mat[j][k] + " ");
 
            // Operations over a row is computed so new line
            System.out.println();
        }
    }
    
}
