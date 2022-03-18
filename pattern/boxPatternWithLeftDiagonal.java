import java.util.Scanner;
public class boxPatternWithLeftDiagonal {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        int z=0;
        for(int i=0;i<value;i++)
        {
            for (int j=0;j<value;j++)
            {
                if((i==z) && (j==(value-z-1))) {
                    System.out.print(" * ");
                    z++;
                    continue;
                }
                if(i==0 || i==(value-1)){
                    System.out.print(" * ");
                }
                else if(j==0 || j==(value-1)) {
                    System.out.print(" * ");
                }

                else {
                    System.out.print("   ");
                    continue;
                }

            }
            System.out.println(" ");
        }
    }
}
