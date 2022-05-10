package dom_zadanie;

public class Lesson15 {
    public static void main(String[] args) {

//        Задача №1
        {
            int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
            int sum = 0;
            for (int i = 0; i < array.length; i++) {
                sum = sum + array[i];
            }
            System.out.println("Сумма всех значений массива: " + sum);
        }

        //    Задача №2
        {
            int[] array1 = {9, 2, 6, 4, 5, 12, 7, 8, 6};
            int maxNum = array1[0];
            for (
                    int j : array1) {
                if (j > maxNum)
                    maxNum = j;
            }
            System.out.println("Максимальное значение массива равно: " + maxNum);
        }

        //    Задача №3
        {
            int[] array2 = {9, 2, 6, 4, 5, 12, 7, 8, 6};
            int minNum = array2[0];
            for (int z : array2) {
                if (z < minNum)
                    minNum = z;
            }
            System.out.println("Минимальное значение массива равно: " + minNum);
        }

        //    Задача №4
        {
            int[] array3 = {1, 2, 3, 4, 5, 6, 7, 8, 10};
            double sum = 0;
            for (int x : array3) {
                sum += x;
            }
            System.out.println("Среднее арифметическое чисел равно: " + sum / array3.length);
        }

        //        Задача №5
        {
            int[][] array4 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
            int sum = 0;
            for (int i = 0;
                 i < array4.length; i++) {
                for (int j = 0; j < array4[i].length; j++) {
                    sum += array4[i][j];
                }
            }
            System.out.println("Сумма всех элементов массивов равно: " + sum);
        }

        //        Задача №6
        {
            int[][] array5 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
            int max = 0;
            for (int c = 0;
                 c < array5.length; c++) {
                for (int d = 0; d < array5[c].length; d++) {
                    if (array5[c][d] > max) {
                        max = array5[c][d];
                    }
                }
            }
            System.out.println("Максимальное значение массивов равно: " + max);
        }
    }
}


