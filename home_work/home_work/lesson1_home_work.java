package home_work;
// 1 Реализуйте 3 метода, чтобы в каждом из них получить разные исключения
// 2 Посмотрите на код, и подумайте сколько разных типов исключений вы тут сможете получить? 
//public static int sum2d(String[][] arr){ int sum = 0; for (int i = 0; i < arr.length; i++)
//{ for (int j = 0; j < 5; j++) { int val = Integer.parseInt(arr[i][j]); sum += val; } } return sum; }    

// 3 Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый
// массив, каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке. Если длины
//массивов не равны, необходимо как-то оповестить пользователя. Важно: При выполнении метода единственное
// исключение, которое пользователь может увидеть - RuntimeException, 

public class lesson1_home_work {

    public static void main(String[] args) {
        int arr[][] = { { 0, 1, 0, 1 }, { 0, 1, 0, 1 }, { 0, 1, 0, 1 }, { 0, 1, 0, 1 } };

        System.out.println(arraySum(arr));
        checkArrayLength(arr);
        checkArrayElements(arr);

    }

    // 1
    public static int arraySum(int arr[][]) { // сумма масива
        int sum = 0;
        if (arr.length != arr[0].length) {
            throw new RuntimeException("Array length is not equal to array width");
            // Длина массива не равна ширине массива
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                sum += arr[i][j];
            }
        }
        return sum;
    }

    public static void checkArrayLength(int arr[][]) { // проверить длину массива
        if (arr.length > 4) {
            throw new RuntimeException("Array length exceeds the limit");// Длина массива превышает лимит
        }
    }

    public static void checkArrayElements(int arr[][]) { // проверить элементы массива
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] != 0 && arr[i][j] != 1) {
                    throw new RuntimeException("Array contains elements other than 0 and 1");
                    // Массив содержит элементы, отличные от 0 и 1
                }
            }
        }


    }

                         //2


    public static int sum2d(String[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 5; j++) {
                try {
                    int val = Integer.parseInt(arr[i][j]);
                    sum += val;
                } catch (NumberFormatException e) {
                    System.out.println("Invalid number format: " + arr[i][j]);// "Неверный формат числа
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Array index out of bounds at row " + i + ", column " + j);
                    // Индекс массива выходит за пределы строки

                }
            }
        }
        return sum;
    }
                           //3
    public static int[] divideArrays(int[] arr1, int[] arr2) { // разделить массивы
        if (arr1.length != arr2.length) {
            throw new RuntimeException("Array lengths are not equal");// Длины массивов не равны
        }
        int[] result = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            result[i] = arr1[i] / arr2[i];
        }
        return result;
    }

}



