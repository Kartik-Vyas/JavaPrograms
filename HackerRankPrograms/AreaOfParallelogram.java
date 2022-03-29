import java.io.*;
import java.util.*;

public class AreaOfParallelogram {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int breadth=0;
        int height = 0;
        int b = sc.nextInt();
        int h = sc.nextInt();
        if(b>0 && b<=100)
        {
         breadth = breadth + b;
        }
        if(h>0 && h<=100)
        {
         height = height +h;
        }
        int area = breadth*height;
        if(area ==0)
        {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
        else 
        {
            System.out.println(area);
        }
    }
}

  
