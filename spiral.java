public class SpiralMatrix {

    public static int[][] generateSpiralMatrix(int n) {
        int[][] matrix = new int[n][n];

        int value = 1;       // Текущее значение для записи
        int top = 0;         // Верхняя граница
        int bottom = n - 1;  // Нижняя граница
        int left = 0;        // Левая граница
        int right = n - 1;   // Правая граница

        while (value <= n * n) {
            // Заполняем верхнюю строку слева направо
            for (int col = left; col <= right && value <= n * n; col++) {
                matrix[top][col] = value++;
            }
            top++;

            // Заполняем правый столбец сверху вниз
            for (int row = top; row <= bottom && value <= n * n; row++) {
                matrix[row][right] = value++;
            }
            right--;

            // Заполняем нижнюю строку справа налево
            for (int col = right; col >= left && value <= n * n; col--) {
                matrix[bottom][col] = value++;
            }
            bottom--;

            // Заполняем левый столбец снизу вверх
            for (int row = bottom; row >= top && value <= n * n; row--) {
                matrix[row][left] = value++;
            }
            left++;
        }

        return matrix;
    }

    // Метод для печати матрицы в консоль
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.printf("%4d", num);
            }
            System.out.println();
        }
    }

    // Пример использования
    public static void main(String[] args) {
        int n = 5;
        int[][] spiralMatrix = generateSpiralMatrix(n);
        printMatrix(spiralMatrix);
    }
}
