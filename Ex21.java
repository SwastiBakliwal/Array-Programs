class Ex21 
{
    public void Boundary_Elements(int mat[][]) 
    { 
        // Printing Input Matrix; 
        System.out.println("Input Matrix is : "); 
  
        for (int i = 0; i < mat.length; i++) { 
            for (int j = 0; j < mat[i].length; j++) { 
  
                System.out.print(mat[i][j]); 
            } 
  
            System.out.println(); 
        } 
  
        // Printing Boundary Values of Matrix 
        System.out.println("Resultant Matrix is :"); 
  
        for (int i = 0; i < mat.length; i++) { 
            for (int j = 0; j < mat[i].length; j++) { 
  
                if (i == 0 || j == 0 || i == mat.length - 1
                    || j == mat[i].length - 1) { 
                    System.out.print(mat[i][j]); 
                } 
                else { 
                    // Printing Space if element 
                    // is not at Boundary 
                    System.out.print(" "); 
                } 
            } 
  
            System.out.println(); 
        } 
    } 
    public static void main(String[] args) 
    { 
        // Input Matrix 
        int mat[][] = new int[][] { { 1, 2, 3 }, 
                                    { 4, 5, 6 }, 
                                    { 7, 8, 9 } }; 
  
        Ex21 B_Values = new Ex21(); 
  
        B_Values.Boundary_Elements(mat); 
    }     
}
