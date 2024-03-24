/*
7. Reverse Integer
Medium
Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

 

Example 1:

Input: x = 123
Output: 321
Example 2:

Input: x = -123
Output: -321
Example 3:

Input: x = 120
Output: 21
*/
public class Reverse_Integer {
   
        public static  int reverse(int x)
        {
            int num =0;
            int sign = 0;
            long y = 0;
         
            while (x !=0)
                {
                    if (x<0)
                    {
                       x = Math.abs(x);
                       sign = -1; 
                    }
                    num = num*10+ x % 10;
                    y = y*10+ x % 10;
                    x = x/ 10;
                } 
                if (y >(( Math.pow(2, 31)-1)) || y < (-Math.pow(2, 21)) )
                { 
                    return 0;
                }
                else 
                {return sign == -1?-num:num;}
            }
            
        

        public static void main(String[] args) 
        {
            System.out.println(reverse(-2147483412));
            
            System.out.println(reverse(1534236469));
            
        }
    
}
