package Basic;

import java.util.Scanner;

public class InverseOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int count = 1;
        int result=0;
        //num=25134
        // 4-1
        // 3-2
        // 1-3
        // 5-4
        // 2-5
        while(num!=0)
        {
        int value = num%10; //4
        result = result + (int)(count*Math.pow(10,value-1));
        num = num/10;
        count++;
        }
        System.out.println("The inversion of your number is : " +  result);
    }
}
