package ru.andrchud;

public class HomeWork {
    static void overflow(){
        int intMaximum = Integer.MAX_VALUE;
        System.out.println("Переполнение:\n1.Предел значения int: " + intMaximum);

        int result = intMaximum + 1;
        System.out.println("\n2.Максимальное значение Integer + 1: " + result);

        int resultSecond = intMaximum * 2;
        System.out.println("\n3.Максимальное значение Integer * 2: " + resultSecond);
    }

    static void logicOper() {
        int a = 2;
        double b = 6.1;
        boolean result;


        result = (a > 1) && (b < 5);
        System.out.println("\nЛогические операции:\n2 > 3 и 6.1 < 5 = " + result);

        result = (a > 1) || (b > 6.2);
        System.out.println("\n2 > 3 или 6.1 > 6.2 = " + result);

        result = !(a < 10) && a > 3.1;
        System.out.println("\n2 не < 10 и 2 > 3.1 = " + result);
    }

    static void intDoubleCombination(int a, double b) {

        double result = a + b;
        System.out.println("\nКомбинации вычислений между int и double:\n1.Cложение: " + result);


        result = a - b;
        System.out.println("\n2.Вычитание: " + result);


        result = a * b;
        System.out.println("\n3.Умножение: " + result);


        result = a / b;
        System.out.println("\n4.Деление: " + result);

    }

    public static void main(String[] args) {
        overflow();
        logicOper();
        intDoubleCombination(16, 3.43);
    }
}