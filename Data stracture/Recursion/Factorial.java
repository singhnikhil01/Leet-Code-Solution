import java.util.Scanner;
public class Factorial 
{
    public static void main (String [] args)
    {
     Scanner scan = new Scanner(System.in);
     System.out.println("Enter a number: ");

     Double y =scan.nextDouble();
     System.out.println("Factorial of : "+factorial(y));
    scan.close();
    }
    public static Double factorial(Double  n )
    {
        
        if(n==0)  //factorial of zero is 1 
        return 1.0 ;

        if(n==1)
            return n ;
        
        return n*factorial(n-1);

    }
}