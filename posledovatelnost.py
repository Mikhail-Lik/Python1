def longest_increasing_subsequence(arr):
    if not arr:
        return []

    # Массив для хранения длины наибольшей возрастающей подпоследовательности
    n = len(arr)
    lis = [1] * n  # Инициализируем массив длиной n единиц
    predecessor = [-1] * n  # Массив для отслеживания предшественников

    # Заполнение массива lis
    for i in range(1, n):
        for j in range(i):
            if arr[i] > arr[j] and lis[i] < lis[j] + 1:
                lis[i] = lis[j] + 1
                predecessor[i] = j

    # Находим максимальную длину
    max_length = max(lis)
    max_index = lis.index(max_length)

    # Восстанавливаем наибольшую возрастающую подпоследовательность
    longest_subseq = []
    while max_index != -1:
        longest_subseq.append(arr[max_index])
        max_index = predecessor[max_index]

    return longest_subseq[::-1]  # Возвращаем в обратном порядке

# Пример использования
input_array = [10, 22, 9, 33, 21, 50, 41, 60, 80]
result = longest_increasing_subsequence(input_array)
print("Наибольшая возрастающая подпоследовательность:", result)
