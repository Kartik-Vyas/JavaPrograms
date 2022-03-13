package com.first;
import java.util.Scanner;
import java.lang.String;
public class CheckVowel {

    public static void main(String[] args) {
	// write your code
        System.out.println("Enter your letter");
        Scanner sc = new Scanner(System.in);
        String letter = sc.next();
        int flag = 0;
        String[] vowel = {"a","e","i","o","u"};
        for(int i=0;i<vowel.length;i++){
          //  System.out.println(vowel[i]);
            if(letter.equals(vowel[i]))
            {
               flag = 1;
                break;
            }

        }
        if(flag == 1){
            System.out.println("Vowel found");
        }
        else{
            System.out.println("Not a Vowel");
        }
    }
}
