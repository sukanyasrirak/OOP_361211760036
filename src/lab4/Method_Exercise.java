package lab4;

public class Method_Exercise {

    public static void main(String[] args) {
        //1.
        System.out.println("Hello from Main().");
        int summation = A(14,22);
        System.out.println("The summation of x and y : "+summation);
        int summation1 = B(22,14);
        System.out.println("The summation of x and y : "+summation1);
        int summation2 = C(2,2);
        System.out.println("The summation of x and y : "+summation2);
        int summation3 = D(5,5);
        System.out.println("The summation of x and y : "+summation3);

    }//main

    public static int A(int x, int y) {
        System.out.println("Hello from บวก().");
        int sum = x + y;
        return sum;

    }//A
    public static int B(int x, int y) {
        System.out.println("Hello from ลบ().");
        int sum = x - y;
        return sum;

    }//B

    public static int C(int x, int y) {
        System.out.println("Hello from คูณ().");
        int sum = x * y;
        return sum;

    }//C

    public static int D(int x, int y) {
        System.out.println("Hello from หาร().");
        int sum = x / y;
        return sum;

    }//D
}//class