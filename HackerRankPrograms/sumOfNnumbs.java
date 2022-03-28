import java.io.*;
import java.util.*;

public class sumOfNnumbs {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
   //Math.pow(2,2)
   Scanner sc = new Scanner(System.in);
   int iteration = sc.nextInt();
   for(int i=0;i<iteration; i++)
   {
       int a = sc.nextInt();
       int b = sc.nextInt();
       int c = sc.nextInt();
       int value = ((int)(a+((Math.pow(2,0))*b)));
       System.out.print(value + " ");
       for(int j=1;j<c;j++)
       {
        value = ((int)(((Math.pow(2,j))*b)))+ value;
          System.out.print(value +" ");
       }
       System.out.println();
   }
   
    }
}
