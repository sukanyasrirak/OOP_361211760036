package lab5;

import java.util.Scanner;

public class ExArray2D {
    //Array 2 มิติ คือ ตัวแปรที่เก็บข้อมูลในลักษณะตาราง แถวแนวนอน(row) และแถวแนวตั้ง(column)
    //โดยใช้เลข index 2 ตัว ในการเข้าข้อมูลใน Array เช่น x [0] [0]
    public static void main(String[] args) {


        int x[][] = new int[2][3];//=6 [5][10] = 50 , last block = [4][49]

        // input data to array 2 D
        x = inputDataArray(x);
        //display data in array
        showDataArray(x);

    }//main

    public static void showDataArray(int[][] x) {
        System.out.println("Data in Array:");
        int total = 0;


        for (int i = 0; i < x.length; i++) { //วนลูปแนวนอน
            for (int j = 0; j < x[i].length; j++) { //วนลูปแนวตั้ง
                System.out.print(x[i][j]+"");
                total+= x[i][j]; //นำข้อมูลทุกบล็อกมาบวกรวมกันแล้วเก็บใน total
            }//j
            System.out.println();
        }//i
        //show total and average
        System.out.println("Total Value:");
        System.out.println("Average Value:"+(total/6));
    }

    private static int[][] inputDataArray(int[][] x) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please,enter integer to array below:");

        for (int i = 0; i < x.length; i++) { //วนลูปแนวนอน
            for (int j = 0; j < x[i].length; j++) { //วนลูปแนวตั้ง
                System.out.print("Input:");
                x[i][j] = sc.nextInt();
            }//j
        }//i
        return x;
    }


}//calss