package fundamentals.matrix_reloaded;

import java.util.Scanner;

public class ArrayLab {
    public static void main(String[] args) {
        int [][] arr=new int[2][3];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[i].length; j++) {
                System.out.println("arr["+i+"]["+j+"]=");
                arr[i][j]=new Scanner(System.in).nextInt();
            }
        }

        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]+" ");

            }
            System.out.println();
        }
    }
}
