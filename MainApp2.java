package ru.dorzhievavika.lesson2;

import java.util.Arrays;

public class MainApp {
    public static void main(String[] args){
        //1
        int[] arr1 = {0,1,0,1,1,1,0,0,1,0,1};
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i]==1){
                arr1[i]=0;
            } else arr1[i]=1;
        }
        System.out.println(Arrays.toString(arr1));
        //2
        int[] arr2 = new int[8];
        for (int i = 0; i < arr2.length ; i++) {
            arr2[i] = i*3;
        }
        System.out.println(Arrays.toString(arr2));
        //3
        int[] arr3 = {1,5,3,2,11,4,5,2,4,8,9,1};
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i]<6){
                arr3[i]=arr3[i]*2;
            }
        }
        System.out.println(Arrays.toString(arr3));
        //4
        int[][] arr2d = new int[4][4];
        for (int i = 0; i < arr2d.length ; i++) {
            for (int j = 0; j < arr2d.length ; j++) {
                if (i==j || i+j== arr2d.length-1)
                {
                    arr2d[i][j]=1;
                }
                System.out.print(arr2d[i][j] + " ");
            }
            System.out.println();
        }
        //5
        int[] arr5 = {4,8,12,7,3,8,20,3,0};
        int min = arr5[0];
        int max = arr5[0];
        for (int i = 0; i < arr5.length; i++) {
            if (arr5[i] > max) {
                max = arr5[i];
            } else if (arr5[i] < min){
                min= arr5[i];
            }
        }
        System.out.println("Минимум = " + min + "; Максимум = " + max);

        //6
        int[] arr6 = {1,1,1,2,3,2};
        System.out.println(checkBalance(arr6));

        //7
        int[] arr7 = {1,2,3,4,5,6,7};
        int n = -1;
        shiftArray(arr7,n);

    }
    public static boolean checkBalance(int[] array){
        int sum1=0;
        int sum2=0;
        boolean response = false;

        for (int i = 0; i < array.length; i++) {
            sum1 += array[i];
            sum2 = 0;
            for (int j = array.length - 1; j > i; j--) {
                sum2 += array[j];
            }
            if (sum1 == sum2) {
                response = true;
                break;
            }
        }

        return response;
    }

    public static void shiftArray(int[] array, int n){
        if (n > 0){
            for (int i = 0; i < n; i++) {
                int tmp = array[array.length-1];
                for (int j = array.length-1; j > 0; j--) {
                    array[j] = array[j - 1];
                }
                array[0] = tmp;
            }
        } else if (n < 0){
            for (int i = 0; i < n * (-1); i++) {
                int tmp = array[0];
                for (int j = 0; j < array.length -1; j++) {
                    array[j] = array[j + 1];
                }
                array[array.length-1] = tmp;
            }
        }

        System.out.print(Arrays.toString(array));

    }
}
