
//реализуй метод принимающий в качестве аргумента целочисленный двумерный массив 
// необходимо посчитать и вернуть сумму элементов этого массива
// При этом накладываем на метод 2 ограничения:метод может работать только с квадратными массивами
//количество строк=количествустолбцов) и в кажной яцейки может лижать только  значение 0 или 1
// если нарушается одно из условий , метод должен просить   RuntimeException   с сообщением об ошибки.

public class lesson_1_task2 {
public static void main(String[] args) {
    int arr [][] = {{0,1,0,1}, {0,1,0,1},{0,1,0,1},{0,1,0,1}};
    
    System.out.println("Сумма значений элементов в массиве = " + arraySum(arr));

}
     

    

    public static int arraySum(int arr[][]){
     int sum = 0;
     if(arr.length != arr[0].length){
        throw new RuntimeException("Длина не равна ширине массива ");
     }
     for (int i = 0; i < arr.length; i++) {
        for(int j = 0;j < arr.length; j++){
            if(arr[i][j] != 0 && arr[i][j] != 1 ) {
                throw new RuntimeException("Массив не содержит элементы 0 и 1");
            }
            sum +=arr[i][j];

        }
        
        
     }
    return sum;



    }






    
}
