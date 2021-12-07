package Assignment;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the mass:");
        int weight = sc.nextInt();
        System.out.println("Enter the height in metre:");
        int height = sc.nextInt();

        int BMI = name(weight,height);
        System.out.println("BMI is " + BMI);
    }



    public static int name(int weight, int height) {
        return weight/(height*height)  ;

    }
}
