public class Main {
    public static void main(String[] args) {
        //Задача 1 - объявление массивов
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;

        double[] arr1 = {1.57, 7.654, 9.986};

        int[] monthLength = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        //Задача 2 - Распечатка элементов массива
        for (int i=0; i < arr.length; i++) {
            if (i != arr.length - 1) {
                System.out.print(arr[i] + ", ");
            } else {
                System.out.println(arr[i]);
            }
        }
        for (int i = 0; i < arr1.length; i++) {
            if (i != arr1.length - 1) {
                System.out.print(arr1[i] + ", ");
            } else {
                System.out.println(arr1[i]);
            }
        }
        for (int i = 0; i < monthLength.length; i++) {
            if (i != monthLength.length - 1) {
                System.out.print(monthLength[i] + ", ");
            } else {
                System.out.println(monthLength[i]);
            }
        }
        System.out.println(" ");

        //Задача 3 - Распечатка элементов массива в обратном порядке
        for (int i = arr.length - 1; i >= 0; i = i - 1) {
            if (i != 0) {
                System.out.print(arr[i] + ", ");
            } else {
                System.out.println(arr[i]);
            }
        }
        for (int i = arr1.length - 1; i >= 0; i = i - 1) {
            if (i != 0) {
                System.out.print(arr1[i] + ", ");
            } else {
                System.out.println(arr1[i]);
            }
        }
        for (int i = monthLength.length - 1; i >= 0; i = i -1) {
            if (i != 0) {
                System.out.print(monthLength[i] + ", ");
            } else {
                System.out.println(monthLength[i]);
            }
        }
    }
}