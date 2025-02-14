import java.util.Scanner;

public class PowerSumChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод положительного числа и числа для начала ряда
        System.out.print("Введите положительное число: ");
        int number = scanner.nextInt();
        System.out.print("Введите число для начала ряда (w): ");
        int w = scanner.nextInt();

        // Проверка условия
        boolean result = checkPowerSum(number, w);
        
        // Вывод результата
        if (result) {
            System.out.println("Сумма степеней цифр равна произведению числа на множитель 2^6.");
        } else {
            System.out.println("Сумма степеней цифр не равна произведению числа на множитель 2^6.");
        }

        scanner.close();
    }

    private static boolean checkPowerSum(int number, int w) {
        String numStr = String.valueOf(number);
        int sum = 0;

        // Вычисление суммы последовательных степеней цифр
        for (int i = 0; i < numStr.length(); i++) {
            int digit = Character.getNumericValue(numStr.charAt(i));
            sum += Math.pow(digit, w + i);
        }

        // Проверка условия
        for (int k = 1; k <= 64; k++) { // Проверяем множители от 1 до 64 (2^6)
            if (sum == number * k) {
                return true;
            }
        }
        
        return false;
    }
}
