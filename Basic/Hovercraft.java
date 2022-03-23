import java.util.Scanner;
public class Hovercraft
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sale = sc.nextInt();
        int cost = 21000000;
        sale = sale*3000000;
        if(sale>cost){
            System.out.println("Profit");
        }
        else if(sale<cost){
            System.out.println("Loss");
        }
        else{
            System.out.println("Broke Even");
        }
    }
}
