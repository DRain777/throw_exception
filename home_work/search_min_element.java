 /*  import java.util.Arrays;

public class search_min_element {
    public static void main(String[] args) {
        int array [] = {1,2,4,5,6,7,0};
        min_element(array);
        System.out.println(Arrays.toString(min_element(array)));
     
    }



    public static void min_element(int[]array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i] > min){
                min = array[i];
            }
        }
        
    }
    
}
*/

 public class search_min_element {
     public static void main(String[] args) {
         int array[] = { 1, 2, 4, 5, 6, 7};
         int minValue = minElement(array);
         System.out.println(minValue);
     }

     public static int minElement(int[] array) {
         int min = array[0];
         for (int i = 1; i < array.length; i++) {
             if (array[i] < min) {
                 min = array[i];
             }
         }
         return min;
     }
 }
