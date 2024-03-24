import java.util.Scanner;
public class Fabonacci
 {
    //int x = 0;
    public static int Series(int n )
    {
        //find the sum of fabonacci Series 
        if (n <= 1)
         return n;
        
        return Series(n-1)+Series(n-2);
    }
    public static void main(String[] args)
    {
       Scanner scan = new Scanner(System.in);
       System.out.println("Enter the position: ");
       int x = scan.nextInt();
       System.out.println("The "+ x +" th element of Fabonacii Series is : "+Series(x));
       scan.close();

    } 
    
}
