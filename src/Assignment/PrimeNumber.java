package Assignment;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  start;
        System.out.println("Enter start value:");
        start = sc.nextInt();
        System.out.println("Enter end value: ");
        int end = sc.nextInt();
        System.out.println("list of prime number betweeen " + start +"and" + end);
        for(int i = start;i<=end;i++){

            if (isPrimenumber(i)) {
                System.out.println(i);
            }

        }
    }
    public static boolean isPrimenumber(int n) {
        if (n <= 1) {
            return false;

        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
