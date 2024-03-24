import java.util.Scanner;
public class SumofNaturalNumber 
{
    public static int sum(int n )
    {
        if (n<=0)
        return n;
    
    return n + sum(n-1);
    }
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int x = scan.nextInt();
        System.out.println("Sum of "+ x + " Natural number :"+ sum(x));
        scan.close();
        
    }
}