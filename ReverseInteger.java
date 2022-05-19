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
