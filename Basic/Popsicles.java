import java.util.Scanner;

public class Popsicles
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sib = input.nextInt();
        int pop = input.nextInt();

        //your code goes here
        int value = (int)(pop%sib);
        if(value==0){
        System.out.println("give away");
        }
        else
        System.out.println("eat them yourself");

    }
}
