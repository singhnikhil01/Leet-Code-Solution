//code to print all the primr numbers from 1 to 100
public class Primenumber{

    public static void main(String[] args)
    {
        int a = 100; 
        for(int i = 2; i<=a;i++)
        {
            boolean isPrime = true;

            for (int j = 2;j<= Math.sqrt(i);j++)
            {
                if(i%j==0)
                {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime)
            {
                System.out.println(i);
            }
        }
    }
}