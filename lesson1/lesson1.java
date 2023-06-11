//  зеализуйте метод , принимающий в качестве аргумента целочисленный массив.
//  если длина массива меньше некоторогозаданного минимума,метод возвращает -1,в качестве кода 
// кода ошибки, иначи длинну массива



public class lesson1 {


    public static void main(String[] args) {

        int[] array = new int[] {1,2,3,4,5,6};
        int a = ex0(array);
        if(a == -1){
            System.out.println("длинна массива не соответствует ");
        }else {
            System.out.println(array);
        }
     
    
    }

    static int ex0(int[] array )  {
      int minSize = 3;
      if (array.length  < minSize){
          return -1;  

        }else {
            return array.length;
        }
      




    }








    
}