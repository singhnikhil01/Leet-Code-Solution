/* 
29. Divide Two Integers

Given two integers dividend and divisor, divide two integers without using multiplication, division, and mod operator.

The integer division should truncate toward zero, which means losing its fractional part. For example, 8.345 would be truncated to 8, and -2.7335 would be truncated to -2.

Return the quotient after dividing dividend by divisor.

Note: Assume we are dealing with an environment that could only store integers within the 32-bit signed integer range: [−231, 231 − 1]. For this problem, if the quotient is strictly greater than 231 - 1, then return 231 - 1, and if the quotient is strictly less than -231, then return -231.

 

Example 1:

Input: dividend = 10, divisor = 3
Output: 3
Explanation: 10/3 = 3.33333.. which is truncated to 3.
Example 2:

Input: dividend = 7, divisor = -3
Output: -2
Explanation: 7/-3 = -2.33333.. which is truncated to -2.
 

Constraints:

-231 <= dividend, divisor <= 231 - 1
divisor != 0
*/
class Divide_two_integer {
    public static void main(String[] args)
     {
        System.out.println(divide( -2147483648 ,2));
      
    }
    public static int divide(int dividend, int divisor) 
    {
       
        if (dividend == -2147483648 && divisor==-1){return 2147483647;}
        if (dividend == -2147483648 && divisor== 1){return -2147483648;}
        int quotient = 0;
        int sign = (dividend < 0)^(divisor<0)?-1:1;
        long dividendl  = Math.abs((long)dividend);
        long divisorl = Math.abs((long)divisor);
        
        
        if ((dividendl>= 0 && divisorl>0) )
        {
            
         while(dividendl >= divisorl)
        {   
            dividendl = dividendl-divisorl;
            ++quotient;     
        }   
        }
            
            return sign == -1 ?-quotient :quotient;
     
    }
}