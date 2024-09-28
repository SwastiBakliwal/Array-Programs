import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Ex32 
{
  private static void FindCommonElemet(String[] arr1,
                                         String[] arr2)
    {
        Set<String> set = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i].equals(arr2[j])) {

                    // add common elements
                    set.add(arr1[i]);
                    break;
                }
            }
        }
        for (String i : set) {
            System.out.print(i + " ");
        }
    }

    // main method
    public static void main(String[] args)
    {

        // create Array 1
        String[] arr1
            = { "hello","hola","namaste"," chao" };

        // create Array 2
        String[] arr2 = { "hello", "konnichiwa", "hola" };

        // print Array 1
        System.out.println("Array 1: "
                           + Arrays.toString(arr1));

        // print Array 2
        System.out.println("Array 2: "
                           + Arrays.toString(arr2));

        System.out.print("Common Elements: ");

        // Find the common elements
        FindCommonElemet(arr1, arr2);
    }  
}
