public class Positive_Integer_power_using_Bitwise {
    public static void main(String[] args) 
    {

        System.out.println(pow(2.0,-10));
    }
    public static Double pow(Double x ,int n) 
    {
        double result =0;

            int  tmp =0;
             //int pro=1;
            while(n!=1 && n>0)
            {
                int b = (int) Math.round(x) ;
                
                if(tmp==0)
                {
                    tmp =(int) Math.round(x);
                }
                else
                {
                    tmp=(int)result;
                    result = 0;
                }
                
                //System.out.println(tmp+"X"+b);
                while (b>0)
                {
                    if (b % 2 != 0 )
                    {
                        result = result + tmp ;

                    }
                tmp = tmp << 1;
                b = b >> 1;
                    
                }
                //pro = pro*result;
                //pro = result;
                //System.out.println("Result:" +result);
                n--;
            
            }
            return result;
    
            
        }
        
    }

