/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;
public class Program
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input1 = sc.nextInt();
        int input2 = sc.nextInt();
        int tickets = (input1/12);
        if(tickets>=input2){
        System.out.println("Buy it!");
        } 
        else{
            System.out.println("Try again");
        }
    }
}