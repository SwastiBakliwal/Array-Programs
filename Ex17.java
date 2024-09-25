class Ex17 
{
    public static void main(String[] args) 
    { 
        // Initializing the first array 
        int a[] = { 10, 30, 12 }; 
        // Initializing the second array 
        int b[] = { 10, 30, 12 }; 
  
        // store the result 
        boolean result = true; 
  
        // Check if length of the two arrays are equal or 
        // not 
        if (a.length == b.length) { 
            
            // Loop to check elements of arrays one by one 
            for (int i = 0; i < a.length; i = i + 1) { 
                
                // To check if any element is different 
                if (a[i] != b[i]) { 
                    
                    // If any element is different then it 
                    // will assign false into boolean 
                    // variable 
                    result = false; 
                } 
            } 
        } 
        else { 
            
            // If the length of two arrays is 
            // different then it will assign 
            // false into boolean variable 
            result = false; 
        } 
        
        // After completion to check whether 
        // result is true of false 
        if (result == true) { 
            
            // Print the result 
            System.out.println("Arrays are equal"); 
        } 
        else { 
            
            // Print the result 
            System.out.println("Arrays are not equal"); 
        } 
    } 
}
