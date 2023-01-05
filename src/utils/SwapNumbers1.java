package utils;

public class SwapNumbers1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        System.out.println("-------------------------------------------------------");

        //swapping value of two numbers without using temp variable

        a = a + b; //now a is 30 and b is 20 // 30 = 10 + 20;
        b = a - b; //now a = 30 and new value of b = 10 (original value of a) // 10 = 30 - 20
        a = a - b; //now a = 20 and b is 10, numbers are swapped// 20 = 30 - 10

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
