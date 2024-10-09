import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public double fraction(double x) {
        return x - (int) x;
    }

    public int charToNum(char x) {
        return x - '0';
    }

    public boolean is2Digits(int x) {
        return (x / 100 == 0);
    }

    public boolean isInRange(int a, int b, int num) {
        return (num >= a && num <= b && b > a) || (num >= b && num <= a && a > b);
    }

    public boolean isEqual(int a, int b, int c) {
        return (a == b && b == c);
    }

    public int abs(int x) {
        if (x < 0) {
            return -x;
        } else {
            return x;
        }
    }

    public boolean is35(int x) {
        return (x % 3 == 0 || x % 5 == 0) && !(x % 3 == 0 && x % 5 == 0);
    }

    public int max3(int x, int y, int z) {
        int max = x;
        if (y > max) {
            max = y;
        }
        if (z > max) {
            max = z;
        }
        return max;
    }

    public int sum2(int x, int y) {
        if (x + y >= 10 && x + y <= 19) {
            return 20;
        } else {
            return x + y;
        }
    }

    public String day(int x) {
        switch (x) {
            case 1:
                return "Понедельник";
            case 2:
                return "Вторник";
            case 3:
                return "Среда";
            case 4:
                return "Четверг";
            case 5:
                return "Пятница";
            case 6:
                return "Суббота";
            case 7:
                return "Воскресенье";
            default:
                return "Это не день недели.";
        }
    }

    public String listNums(int x) {
        String result = "";
        for (int i = 0; i < x; i++) {
            result += i + " ";
        }
        if (x >= 0) {
            result += x;
        }
        return result;
    }

    public String chet(int x) {
        String result = "";
        for (int i = 0; i < x; i++) {
            if (i % 2 == 0) {
                result += i + " ";
            }
        }
        if (x % 2 == 0 && x >= 0) {
            result += x;
        }
        return result;
    }

    public int numLen(long x) {
        if (x == 0) {
            return 1;
        }
        int len = 0;
        while (x != 0) {
            x /= 10;
            len++;
        }
        return len;
    }

    public void square(int x) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void rightTriangle (int x) {
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= x - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public int findFirst(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public int maxAbs(int[] arr) {
        int maxAbsValue = 0;
        for (int i = 0; i < arr.length; i++) {
            int absValue = (arr[i] < 0) ? -arr[i] : arr[i];
            if (absValue > maxAbsValue) {
                maxAbsValue = absValue;
            }
        }
        return maxAbsValue;
    }

    public int[] add(int[] arr, int[] ins, int pos) {
        int[] result = new int[arr.length + ins.length];
        for (int i = 0; i < pos; i++) {
            result[i] = arr[i];
        }
        for (int i = 0; i < ins.length; i++) {
            result[pos + i] = ins[i];
        }
        for (int i = pos; i < arr.length; i++) {
            result[pos + ins.length + i - pos] = arr[i];
        }
        return result;
    }

    public int[] reverseBack(int[] arr) {
        int[] reversedArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversedArr[i] = arr[arr.length - i - 1];
        }
        return reversedArr;
    }

    public int[] findAll(int[] arr, int x) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                count++;
            }
        }
        int[] result = new int[count];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                result[j++] = i;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Выберите действие от 0 до 20: ");
            while (!scanner.hasNextInt()) {
                System.out.print("Введите целое число: ");
                scanner.next(); // очистка ввода
            }
            int s = scanner.nextInt();
            if (s < 0 || s > 20) {
                System.out.println("Введено неверное значение!");
                continue;
            }
            switch (s) {
                case 0:
                    System.out.println("Программа завершена.");
                    return;

                case 1: // вывести только дробную часть числа
                    System.out.println("Задание 1.1: Дробная часть.");
                    System.out.print("Введите x: ");
                    while (!scanner.hasNextDouble()) {
                        System.out.print("Введите вещественное число: ");
                        scanner.next(); 
                    }
                    double x = scanner.nextDouble();
                    System.out.println("Дробная часть: " + main.fraction(x));
                    break;

                case 2: // преобразовать символ в соответствующее число
                    System.out.println("Задание 1.3: Букву в число.");
                    System.out.print("Введите символ (цифру от '0' до '9'): ");
                    String d = scanner.next();
                    if (d.length() != 1 || !Character.isDigit(d.charAt(0))) { // проверка на ввод
                        System.out.println("Введено неверное значение! Введите цифру.");
                        continue;
                    }
                    char x2 = d.charAt(0);
                    System.out.println("Результат: " + main.charToNum(x2));
                    break;

                case 3: // проверка числа на двузначность
                    System.out.println("Задание 1.5: Двузначное.");
                    System.out.print("Введите x: ");
                    while (!scanner.hasNextInt()) {
                        System.out.print("Введите целое число: ");
                        scanner.next(); 
                    }
                    int x3 = scanner.nextInt();
                    System.out.println("Двузначность числа: " + main.is2Digits(x3));
                    break;

                case 4: // входит ли число в диапазон
                    System.out.println("Задание 1.7: Диапазон.");
                    System.out.print("Введите a: ");
                    while (!scanner.hasNextInt()) {
                        System.out.print("Введите целое число! ");
                        scanner.next(); 
                    }
                    int a = scanner.nextInt();
                    System.out.print("Введите b: ");
                    while (!scanner.hasNextInt()) {
                        System.out.print("Введите целое число! ");
                        scanner.next(); 
                    }
                    int b = scanner.nextInt();
                    System.out.print("Введите num: ");
                    while (!scanner.hasNextInt()) {
                        System.out.print("Введите целое число! ");
                        scanner.next(); 
                    }
                    int num = scanner.nextInt();
                    System.out.println("Результат: " + main.isInRange(a, b, num));
                    break;

                case 5: // проверка на равенство трёх чисел
                    System.out.println("Задание 1.9: Равенство чисел.");
                    System.out.print("Введите a: ");
                    while (!scanner.hasNextInt()) {
                        System.out.print("Введите целое число! ");
                        scanner.next(); 
                    }
                    int a2 = scanner.nextInt();
                    System.out.print("Введите b: ");
                    while (!scanner.hasNextInt()) {
                        System.out.print("Введите целое число! ");
                        scanner.next(); 
                    }
                    int b2 = scanner.nextInt();
                    System.out.print("Введите c: ");
                    while (!scanner.hasNextInt()) {
                        System.out.print("Введите целое число! ");
                        scanner.next(); 
                    }
                    int c = scanner.nextInt();
                    System.out.println("Результат: " + main.isEqual(a2, b2, c));
                    break;

                case 6: // вывести модуль числа
                    System.out.println("Задание 2.1: Модуль числа.");
                    System.out.print("Введите x: ");
                    while (!scanner.hasNextInt()) {
                        System.out.print("Введите целое число! ");
                        scanner.next(); 
                    }
                    int x4 = scanner.nextInt();
                    System.out.println("Результат: " + main.abs(x4));
                    break;

                case 7: // проверка деления числа нацело на 3 и 5
                    System.out.println("Задание 2.3: Деление нацело на 3 и 5.");
                    System.out.print("Введите x: ");
                    while (!scanner.hasNextInt()) {
                        System.out.print("Введите целое число! ");
                        scanner.next(); 
                    }
                    int x5 = scanner.nextInt();
                    System.out.println("Результат: " + main.is35(x5));
                    break;

                case 8: // возврат максимального из трёх чисел
                    System.out.println("Задание 2.5: Максимальное число.");
                    System.out.print("Введите x: ");
                    while (!scanner.hasNextInt()) {
                        System.out.print("Введите целое число! ");
                        scanner.next(); 
                    }
                    int x6 = scanner.nextInt();
                    System.out.print("Введите y: ");
                    while (!scanner.hasNextInt()) {
                        System.out.print("Введите целое число! ");
                        scanner.next();
                    }
                    int y = scanner.nextInt();
                    System.out.print("Введите z: ");
                    while (!scanner.hasNextInt()) {
                        System.out.print("Введите целое число! ");
                        scanner.next(); 
                    }
                    int z = scanner.nextInt();
                    System.out.println("Результат: " + main.max3(x6, y, z));
                    break;

                case 9: // возврат суммы двух чисел
                    System.out.println("Задание 2.7: Двойная сумма.");
                    System.out.print("Введите x: ");
                    while (!scanner.hasNextInt()) {
                        System.out.print("Введите целое число! ");
                        scanner.next();
                    }
                    int x7 = scanner.nextInt();
                    System.out.print("Введите y: ");
                    while (!scanner.hasNextInt()) {
                        System.out.print("Введите целое число! ");
                        scanner.next();
                    }
                    int y2 = scanner.nextInt();
                    System.out.println("Результат: " + main.sum2(x7, y2));
                    break;

                case 10: // вывод дня недели по соответствующему числу
                    System.out.println("Задание 2.9: День недели.");
                    System.out.print("Введите x: ");
                    while (!scanner.hasNextInt()) {
                        System.out.print("Введите целое число! ");
                        scanner.next(); 
                    }
                    int x8 = scanner.nextInt();
                    System.out.println("Результат: " + main.day(x8));
                    break;

                case 11: // вывод чисел от 0 до x
                    System.out.println("Задание 3.1: Числа подряд.");
                    System.out.print("Введите x: ");
                    while (!scanner.hasNextInt()) {
                        System.out.print("Введите целое число! ");
                        scanner.next();
                    }
                    int x9 = scanner.nextInt();
                    System.out.println("Результат: " + main.listNums(x9));
                    break;

                case 12: // вывод чётных чисел от 0 до x
                    System.out.println("Задание 3.3: Чётные числа подряд.");
                    System.out.print("Введите x: ");
                    while (!scanner.hasNextInt()) {
                        System.out.print("Введите целое число! ");
                        scanner.next(); 
                    }
                    int x10 = scanner.nextInt();
                    System.out.println("Результат: " + main.chet(x10));
                    break;

                case 13: // вывод длины числа
                    System.out.println("Задание 3.5: Длина числа.");
                    System.out.print("Введите x: ");
                    while (!scanner.hasNextInt()) {
                        System.out.print("Введите целое число! ");
                        scanner.next();
                    }
                    int x11 = scanner.nextInt();
                    System.out.println("Результат: " + main.numLen(x11));
                    break;

                case 14: // вывод квадрата из "*" размером x
                    System.out.println("Задание 3.7: Квадрат.");
                    System.out.print("Введите x: ");
                    while (!scanner.hasNextInt()) {
                        System.out.print("Введите целое число! ");
                        scanner.next(); 
                    }
                    int x12 = scanner.nextInt();
                    main.square(x12);
                    break;

                case 15: // вывод правого треугольника из "*"
                    System.out.println("Задание 3.9: Правый треугольник.");
                    System.out.print("Введите x: ");
                    while (!scanner.hasNextInt()) {
                        System.out.print("Введите целое число! ");
                        scanner.next(); 
                    }
                    int x13 = scanner.nextInt();
                    main.rightTriangle(x13);
                    break;

                case 16: // поиск первого вхождения числа в массив
                    System.out.println("Задача 4.1: Поиск первого значения.");
                    System.out.print("Введите массив в формате [1,2,3,4...]: ");
                    String input1 = scanner.next();
                    if (!input1.matches("\\[(-?\\d+,?)+\\]")) { // проверка на правильность ввода массива
                        System.out.println("Ошибка! Введите массив в формате [1,2,3,4...]");
                        break;
                    }
                    String[] parts = input1.substring(1, input1.length() - 1).split(","); // преобразование массива из строки в int
                    int[] arr = new int[parts.length];
                    for (int i = 0; i < parts.length; i++) {
                        arr[i] = Integer.parseInt(parts[i].trim());
                    }
                    System.out.print("Введите число х: ");
                    while (!scanner.hasNextInt()) { // проверка на ввод
                        System.out.print("Введите целое число! ");
                        scanner.next();
                    }
                    int x14 = scanner.nextInt();
                    int result = main.findFirst(arr, x14);
                    if (result == -1) {
                        System.out.println("Число x не найдено в массиве.");
                    } else {
                        System.out.println("Индекс первого вхождения числа: " + result);
                    }
                    break;

                case 17: // поиск максимального значения в массиве по модулю
                    System.out.println("Задача 4.3: Поиск максимального.");
                    System.out.print("Введите массив в формате [1,2,3,4...]: ");
                    String input = scanner.next();
                    if (!input.matches("\\[(-?\\d+,?)+\\]")) { 
                        System.out.println("Ошибка! Введите массив в формате [1,2,3,4...]");
                        break;
                    }
                    String[] parts1 = input.substring(1, input.length() - 1).split(","); 
                    int[] arr1 = new int[parts1.length];
                    for (int i = 0; i < parts1.length; i++) {
                        arr1[i] = Integer.parseInt(parts1[i].trim());
                    }
                    int result1 = main.maxAbs(arr1);
                        System.out.println("Максимальное по модулю значение: " + result1);
                    break;

                case 18: // добавление массива в массив
                    System.out.println("Задача 4.5: Добавление массива в массив.");
                    System.out.print("Введите массив в формате [1,2,3,4...]: ");
                    String input2 = scanner.next();
                    if (!input2.matches("\\[(-?\\d+,?)+\\]")) {
                        System.out.println("Ошибка! Введите массив в формате [1,2,3,4...]");
                        break;
                    }
                    String[] parts2 = input2.substring(1, input2.length() - 1).split(","); 
                    int[] arr2 = new int[parts2.length];
                    for (int i = 0; i < parts2.length; i++) {
                        arr2[i] = Integer.parseInt(parts2[i].trim());
                    }
                    System.out.print("Введите массив для вставки в формате [1,2,3,4...]: ");
                    String input3 = scanner.next();
                    if (!input3.matches("\\[(-?\\d+,?)+\\]")) { 
                        System.out.println("Ошибка! Введите массив в формате [1,2,3,4...]");
                        break;
                    }
                    String[] parts3 = input3.substring(1, input3.length() - 1).split(","); 
                    int[] ins = new int[parts3.length];
                    for (int i = 0; i < parts3.length; i++) {
                        ins[i] = Integer.parseInt(parts3[i].trim());
                    }
                    System.out.print("Введите позицию для вставки: ");
                    while (!scanner.hasNextInt()) { 
                        System.out.print("Ошибка! Введите целое число: ");
                        scanner.next();
                    }
                    int pos = scanner.nextInt();
                    System.out.println("Результат: " + Arrays.toString(main.add(arr2, ins, pos)));

                case 19: // возвращение массива задом наперёд
                    System.out.println("Задача 4.9: Возвратный реверс.");
                    System.out.print("Введите массив в формате [1,2,3,4...]: ");
                    String input4 = scanner.next();
                    if (!input4.matches("\\[(-?\\d+,?)+\\]")) { 
                        System.out.println("Ошибка! Введите массив в формате [1,2,3,4...]");
                        break;
                    }
                    String[] parts4 = input4.substring(1, input4.length() - 1).split(","); 
                    int[] arr3 = new int[parts4.length];
                    for (int i = 0; i < parts4.length; i++) {
                        arr3[i] = Integer.parseInt(parts4[i].trim());
                    }
                    System.out.println("Результат: " + Arrays.toString(main.reverseBack(arr3)));

                case 20: // поиск всех вхождений числа в массив
                    System.out.println("Задача 4.1: Поиск первого значения.");
                    System.out.print("Введите массив в формате [1,2,3,4...]: ");
                    String input5 = scanner.next();
                    if (!input5.matches("\\[(-?\\d+,?)+\\]")) { 
                        System.out.println("Ошибка! Введите массив в формате [1,2,3,4...]");
                        break;
                    }
                    String[] parts5 = input5.substring(1, input5.length() - 1).split(","); 
                    int[] arr4 = new int[parts5.length];
                    for (int i = 0; i < parts5.length; i++) {
                        arr4[i] = Integer.parseInt(parts5[i].trim());
                    }
                    System.out.print("Введите число х: ");
                    while (!scanner.hasNextInt()) { 
                        System.out.print("Ошибка! Введите целое число: ");
                        scanner.next();
                    }
                    int x15 = scanner.nextInt();
                    System.out.println("Все вхождения числа: " + Arrays.toString(main.findAll(arr4, x15)));
            }
        }
    }
}
