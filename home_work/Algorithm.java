import java.util.Arrays;

public class Algorithm {
    public static void main(String[] args) {
        int array[] = { 4, 5, 3, 8, 2, 1, 7 };
        bubbleSort(array);

        System.out.println(Arrays.toString(array));
    }

    static void bubbleSort(int[] array) {
        int tmp = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
    }
}
