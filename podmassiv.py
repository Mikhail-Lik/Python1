def max_subarray_sum(arr):
    if not arr:
        return 0, []  # Если массив пустой, возвращаем 0 и пустой список

    max_sum = current_sum = arr[0]
    start = end = s = 0  # Индексы для отслеживания подмассива

    for i in range(1, len(arr)):
        current_sum += arr[i]

        # Если текущая сумма меньше текущего элемента, начинаем новый подмассив
        if current_sum < arr[i]:
            current_sum = arr[i]
            s = i  # Начинаем новый подмассив с текущего элемента

        # Обновляем максимальную сумму и индексы, если нашли новую максимальную сумму
        if current_sum > max_sum:
            max_sum = current_sum
            start = s
            end = i

    return max_sum, arr[start:end + 1]  # Возвращаем максимальную сумму и сам подмассив

# Пример использования
input_array = [-2, 1, -3, 4, -1, 2, 1, -5, 4]
max_sum, subarray = max_subarray_sum(input_array)
print("Максимальная сумма подмассива:", max_sum)
print("Подмассив с максимальной суммой:", subarray)
