package Assignment;

import java.util.Scanner;

class StringPalindrom
{
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the word ");
        String name = sc.nextLine();

        String rev = "";

        for (int i = name.length() - 1; i>=0; i--){
            rev = rev + name.charAt(i);
        }
        if (name.equals(rev)){
            System.out.println(name + " is Palindrome letter");
        }
        else{
            System.out.println(name + " is not Palindrome letter");
        }

    }



}