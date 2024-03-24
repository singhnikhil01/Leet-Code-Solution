//Sums of the digits 
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SumofDigits{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int sum = 0; 
        while(x>0)
        {
            sum = sum+ x%10 ; 
            x = x /10 ; 
        }
        System.out.println(sum);
        scan.close();

    }}
    

