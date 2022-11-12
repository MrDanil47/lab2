package start1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class lab2_1 {
    public lab2_1() {
    }

    public static void main(String[] args) {
        try {

            Scanner in = new Scanner(System.in);
            System.out.print("Введите количество строк массива: ");
            int a = in.nextInt();

            System.out.print("Введите количество столбцов массива: ");
            int b = in.nextInt();


            int[][] arr = new int[a][b];

            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.print("Введите элемент arr[" + i + "][" + j + "]:");
                    arr[i][j] = in.nextInt();
                }
            }
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.print(arr[i][j] + "\t");
                }
                System.out.println();
            }


            System.out.print("Введите строку массива: ");
            int c = in.nextInt();
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[c - 1][i] + " ");
            }

        }
        catch (InputMismatchException e){
            System.err.println("Невірний тип введення даних");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.err.println("Індекс за межами масиву");
        }
    }
}
