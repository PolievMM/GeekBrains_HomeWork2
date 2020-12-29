package ru.geekbrains.HomeWork2;

public class Main {

    public static void main(String[] args) {
        System.out.println("Упражнение 1");
        ex1();
        System.out.println("Упражнение 2");
        ex2();
        System.out.println("Упражнение 3");
        ex3();
        System.out.println("Упражнение 4");
        ex4();
        System.out.println("Упражнение 4, 2-й вариант");
        ex4Var();
        System.out.println("Упражнение 5");
        ex5();
        System.out.println("Упражнение 5, 2-й вариант");
        ex5Var();
        System.out.println("Упражнение 6");
        int[] name = {1, 1, 1, 3};
        System.out.println(ex6(name));
        System.out.println("С шестым не справился, но могли бы пояснить, в верном направлении ли шел, и что именно с делал не так?");


    }

// 1. Задать целочисленный массив, состоящий из элементов 0 и 1.
// Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
    public static void ex1() {
        int[] arr = {1, 0, 1, 1, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i]++;
                System.out.print(arr[i] + " ");
            } else if (arr[i] == 1) {
                arr[i]--;
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }

// 2. Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;

    public static void ex2() {
        int[] mas = new int[8];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = i * 3;
            System.out.print(mas[i] + " ");
        }
        System.out.println();
    }

// 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2

    public static void ex3() {
        int[] cyc = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < cyc.length; i++) {
            if (cyc[i] < 6) {
                cyc[i] *= 2;
            }
            System.out.print(cyc[i] + " ");
        }
        System.out.println();


    }

// 4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
// с помощью цикла(-ов) заполнить его диагональные элементы единицами

    public static void ex4() {
        int[][] sq = new int[3][3];
        for (int i = 0; i < 3; i++) {
            sq[i][i] = 1;
            sq[i][sq.length - 1 - i] = 1;
            for (int j = 0; j < 3; j++) {
                System.out.print(sq[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void ex4Var() {
        int[][] sq = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sq[0][0] = 1;
                sq[0][2] = 1;
                sq[1][1] = 1;
                sq[2][0] = 1;
                sq[2][2] = 1;
                System.out.print(sq[i][j] + " ");
            }
            System.out.println();
        }
    }

// 5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);

    public static void ex5() {
        int[] maxMin = {5, 30, 432, 24, 1, 45, 304, 3, 6};
        int min = maxMin[0];
        int max = maxMin[0];
        for (int i : maxMin) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }
        System.out.println("Min number for massive is: " + min + " ");
        System.out.println("Max number for massive is: " + max + " ");
    }

    public static void ex5Var() {
        int[] mas = {-5, 5, -34, 3, 234, 543};
        int min = mas[0];
        int max = mas[0];
        for (int i = 0; i < mas.length; i++) {

            if (min > mas[i]) {
                min = mas[i];

            }
            if (max < mas[i]) {
                max = mas[i];
            }

        }
        System.out.println("Минимальное число массива: " + min);
        System.out.println("Максимальное число массива: " + max);
    }
// ** 6. Написать метод, в который передается не пустой одномерный целочисленный массив,
// метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.
// Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true, граница показана символами ||, эти символы в массив не входят.

    public static boolean ex6(int[] mas) {
        int a = 0;
        int b = 0;
        for (int i = 0; i < mas.length; i++) {
            a += mas[i];
        }
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
            b += mas[i];
        }
            if (b == a / 2) {
                System.out.print("|| ");
                return true;
            }
            else {
                return false;
            }

    }
}

