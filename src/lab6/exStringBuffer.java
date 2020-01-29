package lab6;

import java.util.StringTokenizer;

public class exStringBuffer {
    public static void main(String[] args) {

        // StringBuffer เป็นคลาส ที่มีเมธอดต่างๆ
        // ซึ่งสามารถปรับปรุงแก้ไขข้อมูลที่เป็น String ได้มากกว่าคลาส String ทั่วไป

        StringBuffer strBut = new StringBuffer("Hello");
        System.out.println(strBut);
        //append()ใช้สำหรับต่อ String
        strBut.append("Saiyai");
        System.out.println(strBut);
        System.out.println(strBut.reverse());
        strBut.delete(0,6);
        System.out.println(strBut);


        //StringTokenizer
        String s = "Young people are talking less on their mobile phones." +
                "Join Sian and Clare to find out more about this story " +
                "and to learn vocabulary relating to phones." +
                "(Background image: Getty Images)";

        StringTokenizer tokenizer = new StringTokenizer(s);
        int countWord = tokenizer.countTokens();
        System.out.println("Word count from message: "+countWord);

        // word cutting
        while (tokenizer.hasMoreTokens()) {
            System.out.println(tokenizer.nextToken());
        }


    }//main
}//class
