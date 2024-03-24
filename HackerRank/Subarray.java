import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Subarray{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for(int x=0; x<t;x++)
        {
            int n = scan.nextInt();
            String[] arr = new String[n];
            scan.nextLine();
            arr = scan.nextLine().split(" ");
            
            for(int i =0; i<n ;i++)
            {
                for(int j =i ;j<n;j++)
                {
                    for(int k =i;k<=j;k++)
                    {
                        System.out.print(arr[k]+" ");
                    }
                    System.out.println();
                }
            }
        }
        scan.close();
    }
}