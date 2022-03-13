package com.first;
import java.util.Scanner;
public class vowel {
    public static void main(String[] args) {
        System.out.println("Enter your letter");
        Scanner sc = new Scanner(System.in);
        String letter = sc.next();
        if (letter.equals("a") || letter.equals("e") || letter.equals("i") || letter.equals("o") || letter.equals("u")) {
            System.out.println("is a vowel");
        } else {
            System.out.println("not a vowel");
        }
    }
}
