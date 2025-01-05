import java.util.Scanner;

public class RemoveVowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ввод строки от пользователя
        System.out.print("Введите строку: ");
        String input = scanner.nextLine();
        
        // Удаляем все гласные (и заглавные, и строчные)
        String result = input.replaceAll("[aeiouAEIOU]", "");
        
        // Вывод результата
        System.out.println("Строка без гласных: " + result);
        
        scanner.close();
    }
}
