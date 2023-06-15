package home_work_;
// 1)Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение.
// Ввод текста вместо числа не должно приводить к падению приложения,           
// вместо этого, необходимо повторно запросить у пользователя ввод данных.


import java.util.Scanner;

public class home_work_lesson2 {

    public static void main(String[] args) {
        float number = readFractionalNumber();
        System.out.println("Fractional number entered: " + number); // Введено дробное число:
    }

    public static float readFractionalNumber() {
        try (Scanner scanner = new Scanner(System.in)) {
            float number = 0.0f;
            boolean validInput = false;

            while (!validInput) {
                System.out.print("Enter a fractional number: "); //Введите дробное число:
                if (scanner.hasNextFloat()) {
                    number = scanner.nextFloat();
                    validInput = true;
                } else {
                    System.out.println("Invalid input. Please enter a fractional number.");
                    // Неверный Ввод. Пожалуйста, введите дробное число
                    scanner.nextLine(); // Очистить входной буфер
                }
            }

            return number;
        }
    }
}
                 // 2 задание исправить код 

 /*
  * try {
  * int d = 0; // 1
  * double catchedRes1 = intArray[8] / d; // ДЕЛИТЬ НА 0 НЕЛЬЗЯ
  * System.out.println("catchedRes1 = " + catchedRes1);
  * } catch (ArithmeticException e) {
  * System.out.println("Catching exception: " + e);
  * }
  */                




                // 3 fix bugs in code 
  /*
   * public static void main(String[] args) throws Exception {
   * try {
   * int a = 90;
   * int b = 3;
   * System.out.println(a / b);
   * printSum(23, 234);
   * int[] abc = { 1, 2 };
   * abc[3] = 9;
   * } catch (Throwable ex) {
   * System.out.println("Что-то пошло не так...");
   * } catch (NullPointerException ex) {
   * System.out.println("Указатель не может указывать на null!");
   * } catch (IndexOutOfBoundsException ex) {
   * System.out.println("Массив выходит за пределы своего размера!");
   * }
   * }
   * public static void printSum(Integer a, Integer b) throws
   * FileNotFoundException {
   * System.out.println(a + b);
   * }
   * 
   * 
   * 
   * public class Main {
   * 
   * public static void main(String[] args) {
   * try {
   * int a = 90;
   * int b = 3;
   * System.out.println(a / b);
   * printSum(23, 234);
   * int[] abc = new int[2];
   * abc[1] = 9;
   * } catch (ArithmeticException ex) {
   * System.out.println("Деление на ноль!");
   * } catch (NullPointerException ex) {
   * System.out.println("Указатель не может указывать на null!");
   * } catch (ArrayIndexOutOfBoundsException ex) {
   * System.out.println("Массив выходит за пределы своего размера!");
   * } catch (Exception ex) {
   * System.out.println("Что-то пошло не так...");
   * }
   * }
   * 
   * public static void printSum(Integer a, Integer b) {
   * System.out.println(a + b);
   * }
   * }
   * 
   * 
   * 
   * 
   * 
   */


   
