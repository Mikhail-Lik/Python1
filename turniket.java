import java.util.Scanner;

public class EmployeeCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ввод массива значений
        System.out.print("Введите массив значений в формате [1, 0, 1, 1, 1]: ");
        String input = scanner.nextLine();
        
        // Убираем квадратные скобки и разбиваем строку на элементы
        input = input.replaceAll("\\[|\\]", ""); // Удаляем скобки
        String[] values = input.split(","); // Разделяем по запятой
        
        int employeeCount = 0; // Счетчик работников
        
        // Подсчет работников
        for (String value : values) {
            value = value.trim(); // Убираем пробелы
            if (value.equals("1")) { // Если это работник
                employeeCount++;
            }
        }
        
        // Вывод результата
        System.out.println("Количество сотрудников, зашедших на предприятие: " + employeeCount);
        
        scanner.close();
    }
}
