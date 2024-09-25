class Ex20 
{
    // To calculate Sum of Diagonals
    static void Sum_of_Diagonals(int[][] matrix, int N)
    {
        // Declaring and initializing two variables to zero
        // initially for primary and secondary diagonal
        // count
        int Pd = 0, Sd = 0;
        for(int i=0; i<N; i++)
        {
              // Since for primary diagonal sum the value of
            // row and column are equal 
              Pd += matrix[i][i];
           
            // For secondary diagonal sum values of i'th index
            // and j'th index sum is equal to n-1 at each 
            // stage of matrix
              Sd += matrix[i][N-(i+1)];
        }
         
       
        // Print and display the sum of primary diagonal
        System.out.println("Sum of Principal Diagonal:"
                           + Pd);
        // Print and display the sum of secondary diagonal
        System.out.println("Sum of Secondary Diagonal:"
                           + Sd);
    }
 
   
    // Main driver method
    static public void main(String[] args)
    {
 
        // Input integer array
        // Custom entries in an array
        int[][] b = { { 8, 2, 13, 4 },
                      { 9, 16, 17, 8 },
                      { 1, 22, 3, 14 },
                      { 15, 6, 17, 8 } };
 
        // Passing the array as an argument to the
        // function defined above
        Sum_of_Diagonals(b, 4);
    }
}
