package Basic;
class loop
{
    private static int number;
    public MyNumber(int n)
    {
        this.number = n;
    }
    public boolean isPrime()
    {
        int n1 = (int) Math.round(Math.sqrt(number));
        for(int i = 2; i<=n1 ;i++)
        {
            if(n1%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public int sumUptoN()
    {
        int sum = 0;
        for(int i = 1;i<=number;i++)
        {
            sum = sum +i;
        }
        return sum;
    }
    public int sumOfDivisor()
    {
        int sum = 0;
        for(int i = 2;i<=number-1;i++)
        {
            if(number%i ==0)
            sum = sum +i;
        }
        return sum;
    }
    public static void PrintNoTriangle()
    {
        for(int i=1;i<=number;i++)
        {
            for(int j =1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
public class MyNumber {
    public static void main(String[] args) {

        MyNumber number = new MyNumber(9);
        boolean n1 = number.isPrime();
        System.out.println(n1);

        int sum = number.sumUptoN();
        System.out.println(sum);

        int Divsum = number.sumOfDivisor();
        System.out.println(Divsum);

        loop.PrintNoTriangle();
    }
}
