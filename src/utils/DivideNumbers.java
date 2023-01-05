package utils;

public class DivideNumbers {
    public static void main(String[] args) {

        System.out.println("DivisibleBy15: ");
        for (int i = 1; i <= 100; i++) {
            if(i % 3 == 0 && i % 5 == 0 && i % 15 == 0){
                System.out.print(i + " ");
            }
        }

        System.out.println("\n\nDividedBy3: ");
        for (int i = 1; i <= 100 ; i++) {
            if(i % 3 == 0){
                System.out.print(i+ " ");
            }
        }

        System.out.println("\n\nDividedBy5: ");
        for (int i = 1; i <= 100 ; i++) {
            if(i % 5 == 0){
                System.out.print(i+ " ");
            }
        }

    }
}
