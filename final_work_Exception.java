// Напишите приложение, которое будет запрашивать у пользователя следующие данные 
// в произвольном порядке, разделенные пробелом:
// Фамилия Имя Отчество датарождения номертелефона пол
//  Форматы данных:
// фамилия, имя, отчество - строки
// датарождения - строка формата dd.mm.yyyy
// номертелефона - целое беззнаковое число без форматирования
// пол - символ латиницей f или m. female-женский male -мужской
// 
// Приложение должно проверить введенные данные по количеству. Если количество не совпадает 
// с требуемым, вернуть код ошибки, обработать его и показать пользователю сообщение,
//  что он ввел меньше и больше данных, чем требуется.
//  
// Приложение должно попытаться распарсить полученные значения
//  и выделить из них требуемые параметры. Если форматы 
// данных не совпадают, нужно бросить исключение, соответствующее типу проблемы.
// Можно использовать встроенные типы  java и создать свои. 
// Исключение должно быть корректно обработано, пользователю выведено 
//  сообщение с информацией, что именно неверно.

// Если всё введено и обработано верно, должен создаться файл с названием, 
// равным фамилии, в него в одну строку должны записаться полученные данные, вида
// <Фамилия><Имя><Отчество><датарождения> <номертелефона><пол>
// Однофамильцы должны записаться в один и тот же файл, в отдельные строки.
// Не забудьте закрыть соединение с файлом. 
// При возникновении проблемы с чтением-записью в файл, исключение должно быть 
// корректно обработано, пользователь должен увидеть стектрейс ошибки.



import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class final_work_Exception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter user data separated by spaces:");
            // Введите пользовательские данные, разделенные пробелами
            String userInput = scanner.nextLine();

            String[] userData = userInput.split("\\s+");

            if (userData.length != 6) {
                System.out.println("Invalid number of data elements entered.");
                // Введено недопустимое количество элементов данных
                return;
            }

            String lastName = userData[0];
            String firstName = userData[1];
            String patronymic = userData[2];
            String dateOfBirthString = userData[3];
            String phoneNumberString = userData[4];
            String genderString = userData[5];

            // Разбор даты рождения
            LocalDate dateOfBirth;
            try {
                DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern(UserDataFormat.DATE_PATTERN);
                dateOfBirth = LocalDate.parse(dateOfBirthString, dateFormatter);
            } catch (DateTimeParseException e) {
                System.out.println("Invalid date format for date of birth.");
                // Неверный формат даты для даты рождения
                return;
            }

            // Parsing phone number
            long phoneNumber;
            try {
                phoneNumber = Long.parseLong(phoneNumberString);
            } catch (NumberFormatException e) {
                System.out.println("Invalid format for phone number.");
                // Неверны формат телефонного номера
                return;
            }

            // Parsing gender
            Gender gender;
            try {
                gender = Gender.parseGender(genderString);
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid gender value. Must be 'm' or 'f'.");
                // Недопустимое значение гендера. Должно быть, "м" или "ф"."
                return;
            }

            // Write data to file
            String fileName = lastName + ".txt";
            try (FileWriter writer = new FileWriter(fileName, true)) {
                writer.write(lastName + firstName + patronymic + dateOfBirth + " " + phoneNumber + gender + "\n");
            } catch (IOException e) {
                System.out.println("Error writing to file: " + e.getMessage());
                return;
            }

            System.out.println("Data saved successfully to file: " + fileName);
            // Данные успешно сохранены в файл:
        } catch (InputMismatchException e) {
            System.out.println("Invalid input format.");// Недопустимый формат ввода.
        } finally {
            scanner.close();
        }
    }
}

class UserDataFormat {
    public static final String DATE_PATTERN = "dd.MM.yyyy";
    public static final UserDataFormat DATE_FORMAT = new UserDataFormat(DATE_PATTERN);

    private final String pattern;

    public UserDataFormat(String pattern) {
        this.pattern = pattern;
    }

    public String getPattern() {
        return pattern;
    }
}

