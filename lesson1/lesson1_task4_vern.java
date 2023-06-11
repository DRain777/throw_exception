import java.util.ArrayList;
import java.util.List;

import javax.management.RuntimeErrorException;

public class lesson1_task4_vern {

    public static void main(String[] args) {
        String[] arr = new String[] { "1", null, "2" };
        System.out.println(checkArray(arr));
    }

    public static List<Integer> checkArray(String[] arr) {
        List<Integer> newArr = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                newArr.add(i);
            }
        //    if (newArr.isEmpty()) {
          //      throw new RuntimeErrorException("Null is not found");

            //}
            
        }
        return newArr;
    }
}
