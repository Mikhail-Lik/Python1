import java.util.ArrayList;
import java.util.List;

public class CityTrip {
    public static void main(String[] args) {
        int maxDistance = 175; // Максимальное расстояние
        int numberOfCities = 3; // Количество городов
        List<Integer> distances = List.of(50, 55, 57, 58, 61); // Список расстояний

        int result = chooseBestSum(maxDistance, numberOfCities, distances);
        System.out.println("Максимально возможное расстояние: " + result);
    }

    public static int chooseBestSum(int maxDistance, int numberOfCities, List<Integer> distances) {
        List<List<Integer>> combinations = new ArrayList<>();
        findCombinations(distances, new ArrayList<>(), combinations, numberOfCities, 0);

        int bestSum = 0;

        // Проверяем каждую комбинацию
        for (List<Integer> combination : combinations) {
            int sum = combination.stream().mapToInt(Integer::intValue).sum();
            if (sum <= maxDistance && sum > bestSum) {
                bestSum = sum;
            }
        }

        return bestSum;
    }

    private static void findCombinations(List<Integer> distances, List<Integer> currentCombination,
                                         List<List<Integer>> combinations, int numberOfCities, int start) {
        // Если достигли нужного количества городов
        if (currentCombination.size() == numberOfCities) {
            combinations.add(new ArrayList<>(currentCombination));
            return;
        }

        // Генерация всех возможных комбинаций
        for (int i = start; i < distances.size(); i++) {
            currentCombination.add(distances.get(i));
            findCombinations(distances, currentCombination, combinations, numberOfCities, i + 1);
            currentCombination.remove(currentCombination.size() - 1); // Удаляем последний элемент для следующей итерации
        }
    }
}
