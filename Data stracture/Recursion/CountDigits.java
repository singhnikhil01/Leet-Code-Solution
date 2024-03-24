import java.util.Scanner;
public class CountDigits 
{
    public static int countdigits(int n )
    {
        if (n<=1)
        return n;
    
    return 1 + countdigits(n/10);
    }
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int x = scan.nextInt();
        System.out.println(countdigits(x));
        scan.close();
        
    }
}