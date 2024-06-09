# TZ2_TP
Проект NumberOperations

Обзор
Проект NumberOperations - это Java-приложение, предназначенное для выполнения базовых операций с списком целых чисел, прочитанных из файла. Оно предоставляет функции для нахождения минимума, максимума, суммы и произведения чисел. Кроме того, включает тесты производительности для измерения эффективности этих операций с различными размерами входных данных.

Структура проекта
NumberOperations: Содержит методы для чтения чисел из файла и выполнения различных операций над ними.
NumberOperationsTest: JUnit тесты для класса NumberOperations для обеспечения корректности операций.
PerformanceTest: Измеряет производительность операции суммирования на списках разного размера.

Файлы и директории
src/main/java/com/example/NumberOperations.java
src/test/java/com/example/NumberOperationsTest.java
src/main/java/com/example/PerformanceTest.java
resources/numbers.txt

Использование
NumberOperations
Класс NumberOperations предоставляет следующие методы:

readNumbersFromFile(String filePath): Читает список целых чисел из файла.
getMin(List<Integer> numbers): Возвращает минимальное значение из списка чисел.
getMax(List<Integer> numbers): Возвращает максимальное значение из списка чисел.
getSum(List<Integer> numbers): Возвращает сумму чисел в списке.
getMult(List<Integer> numbers): Возвращает произведение чисел в списке.

Тестирование
Класс NumberOperationsTest содержит набор JUnit тестов для проверки правильности работы методов:

testMin(): Тестирует метод getMin().
testMax(): Тестирует метод getMax().
testSum(): Тестирует метод getSum().
testMult(): Тестирует метод getMult().

Производительность
Класс PerformanceTest измеряет время выполнения операции суммирования для списков разного размера и выводит результаты в наносекундах:
