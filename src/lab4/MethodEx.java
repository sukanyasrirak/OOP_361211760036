package lab4;

public class MethodEx {

    //1. No return No parameter : คือ เมธอดที่ไม่้มีการรับค่าพารามิเตอร์ และไม่คืนค่าใดกลับหลังจาก process แล้ว
    //2. No return 1 or more parameter : คือ เมธอดที่มีการรับค่าพารามิเตอร์ตั้งแต่ 1 หรือมากกว่า และไม่คืนค่าใดกลับหลังจาก process แล้ว
    //3. Return 1 value, 1 or more parameter : คือ เมธอดที่มีการรับค่าพารามิเตอร์ตั้งแต่ 1 หรือมากกว่า และมีการคืนค่ากลับไปยังส่วนที่เรียกใช้งาน (เรียกใช้จากที่ไหน คืนค่าไปที่นั้น)
    public static void main(String[] args) {

        System.out.println("Hello from Main().");
        //calling method A()
        A();
        A();
        A();
        //calling method B()
        B("MIT","RUTS");
        //calling method C()
        //1. ประกาศตัวแปรชนิดเดียวงกันมาเก็บค่าที่เมธอดส่งกลับมาได้
        int summation = C(10,20);
        System.out.println("The summation of x and y : "+summation);
        //2. เรียกใช้เมธอดโดยไม่ประกาศค่าตัวแปรใดๆ มาเก็บค่าที่ส่งกลับมา
        System.out.println("The summation of x and y (2) : "+C(50,50));
    }//main

    public static void A(){
        System.out.println("Hello from A().");
    }//A
    public static void B(String msg,String msg2){
        System.out.println("Hello from B().");
        System.out.println("Message: "+msg);
        System.out.println("Message2: "+msg2);
    }//B
    public static int C(int x,int y){
        System.out.println("Hello from C().");
        int sum = x + y;
        return sum;
    }
}//class
