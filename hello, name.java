import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод имени
        System.out.print("Введите ваше имя: ");
        String name = scanner.nextLine();

        // Преобразование имени: первая буква заглавная, остальные строчные
        String formattedName = formatName(name);

        // Вывод приветствия
        System.out.println("Привет, " + formattedName + "!");

        scanner.close();
    }

    // Метод для форматирования имени
    private static String formatName(String name) {
        if (name == null || name.isEmpty()) {
            return "";
        }
        
        // Преобразуем первую букву в верхний регистр, остальные в нижний
        return name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
    }
}
