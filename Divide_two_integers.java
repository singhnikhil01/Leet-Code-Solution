//Divide two numbers using subtraction and Loop
class Solution {
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