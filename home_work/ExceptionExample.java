//Разработайте программу, которая выбросит Exception, 
// когда пользователь вводит пустую строку. Пользователю должно 
// показаться сообщение, что пустые строки вводить нельзя.


import java.util.Scanner;

public class ExceptionExample {
    public static void main(String[] args) {
        try {
            String input = getInput();
            processInput(input);
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }

    public static String getInput() throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();

        if (input.isEmpty()) {
            throw new Exception("Blank lines cannot be entered.");
            // Пустые строки не могут быть введены
        }

        return input;
    }

    public static void processInput(String input) {
        System.out.println("Input: " + input);
    }
}
