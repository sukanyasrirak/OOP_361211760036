package lab3;

import java.util.Scanner;

public class Control3 {
    public static void main(String[] args) {
        // if-else -> เป็นคำสั่งที่เลือกคำอย่างใดอย่างหนึ่ง
        //โครงสร้างคำสั่ง
        // if (เงื่อนไข)}
        // คำสั่งของ if เมื่อเงื่อนไขเป็นจริง;
        // }else{
        // คำสั่งของ if เมื่อเงื่อนไขเป็นเท็จ;
        // }



        Scanner sc = new Scanner(System.in);
        System.out.print("How old are you?");
        int age = sc.nextInt();

        if (age > 60){
            System.out.println("You are old (คุณชราแล้ว).");
        }else {
            System.out.println("You are not old yet.(คุณยังไม่แก่)");
        }





    }
}