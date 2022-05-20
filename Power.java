/*50. Pow(x, n)

Implement pow(x, n), which calculates x raised to the power n (i.e., xn).

 

Example 1:

Input: x = 2.00000, n = 10
Output: 1024.00000
Example 2:

Input: x = 2.10000, n = 3
Output: 9.26100
Example 3:

Input: x = 2.00000, n = -2
Output: 0.25000
Explanation: 2-2 = 1/22 = 1/4 = 0.25
 

Constraints:

-100.0 < x < 100.0
-231 <= n <= 231-1
-104 <= xn <= 104
*/
public class Power {
    public static void main(String[] args) 
    {
        //2.00000
        //-2147483648
        System.out.println(myPow(-1,-345677));
    }

        public static double myPow(double x, int n) 
        {
           // int sign = (x < 0)^(n<0)?-1:1;
           
           if (x == 1) return 1;
           if (x == -1)
           {
               n = Math.abs(n);
               if(n%2==0)
               {
                   return 1;
               }
               else
               {return -1;}
            
           }
            
           if (n == 1) return x ;
           if(n <= -2147483648 && (x !=1 || x !=-1) ){return 0;}

            
             if ( n < 0 )
            {
                double result=1;
                n = Math.abs(n);
                
                while(n!=0)
                {
                   
                    result = result/x;
                    //System.out.println(result);
                    n--;
                }
                return result;

            }
            else
            {
                double result=1;
                
                

                while(n!=0)
                {
                    result = result*x;
                    n--;
                }
                return result;

            }
}
}
