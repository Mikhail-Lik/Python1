def is_palindrome(s):
    # Убираем пробелы и приводим к нижнему регистру
    cleaned_string = ''.join(char.lower() for char in s if char.isalnum())
    
    # Проверяем, является ли строка палиндромом
    return cleaned_string == cleaned_string[::-1]

# Пример использования
input_string = input("Введите строку для проверки на палиндром: ")
if is_palindrome(input_string):
    print("Строка является палиндромом.")
else:
    print("Строка не является палиндромом.")
