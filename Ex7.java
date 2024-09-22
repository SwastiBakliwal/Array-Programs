import java.util.Arrays;
class Ex7 
{
    public static void main(String[] args) 
    { 
        // Initializing the first array 
        int a[] = { 30, 25, 40, 23 }; 
  
        // Initializing the second array 
        int b[] = { 30, 26, 40 }; 
  
        // store the result 
        // Arrays.equals(a, b) function is used to check 
        // whether two arrays are equal or not 
        boolean result = Arrays.equals(a, b); 
  
        // condition to check whether the 
        // result is true or false 
        if (result == true) { 
            // Print the result 
            System.out.println("Two arrays are equal"); 
        } 
        else { 
            // Print the result 
            System.out.println("Two arrays are not equal"); 
        } 
    }     
}
