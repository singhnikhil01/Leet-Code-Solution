import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

import java.util.Scanner;

public class ATM {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner scan = new Scanner(System.in);
        int X = scan.nextInt(); 
        float Y = scan.nextFloat(); 
        
        

        if ((X%5==0 &&(X+0.5)<Y))
        {
            double temp = Y - X - 0.5;
            String result = String.format("%.2f", temp);
            System.out.println(result);
        }
        else 
        {
            String result = String.format("%.2f", Y);
            System.out.println(result);
     }

    
}
}
