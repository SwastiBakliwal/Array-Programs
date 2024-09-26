class Ex23 
{
 // Dimension of the matrix
 
    // Initializing to custom values
    static final int P = 3;
    static final int Q = 3;
 
    // Method 1
    // To rotate the stated matrix by K times
    static void rotate_Matrix(int mat[][], int K)
    {
        // Using temporary array of dimension P
        int tempo[] = new int[P];
 
        // Rotating matrix by k times across the size of
        // matrix
        K = K % P;
 
        for (int j = 0; j < Q; j++) {
 
            // Copying first P-K elements
            // to the temporary array
            for (int l = 0; l < P - K; l++)
                tempo[l] = mat[j][l];
 
            // Copying the elements of the matrix
            // from K to the end to the starting
            for (int x = P - K; x < P; x++)
                mat[j][x - P + K] = mat[j][x];
 
            // Copying the elements of the matrix
            // from the temporary array to end
            for (int x = K; x < P; x++)
                mat[j][x] = tempo[x - K];
        }
    }
 
    // Method 2
    // To show the resultant matrix
    static void show_Matrix(int mat[][])
    {
        for (int j = 0; j < Q; j++) {
            for (int x = 0; x < P; x++)
                System.out.print(mat[j][x] + " ");
            System.out.println();
        }
    }
 
    // Method 3
    // Main driver method
    public static void main(String[] args)
    {
        // Custom input array
        int mat[][]
            = { { 1, 2, 5 }, { 3, 4, 6 }, { 8, 10, 9 } };
 
        // Custom value of K
        int K = 2;
 
        // Calling the above created method for
        // rotating matrix by k times
        rotate_Matrix(mat, K);
 
        // Calling the above method for
        // displaying rotated matrix
        show_Matrix(mat);
    }    
}
