public class GCD{
    public static void main(String[] args) {
        System.out.println(GCD.find_gcd(10, 10));
        System.out.println(GCD.find_lcm(75, 30));
        // int[] numbers = {90,15};
        // System.out.println(GCD.gcd_array(numbers));
    }

    public static int find_gcd(int a , int b){
        while(b!=0)
        {
            int temp =b; 
            b = a % b;
            a = temp;
        }
        return a;

    }

    public static int find_lcm(int a , int b)
    {
        int lcm =0;
        //need to find the gcd , gcd X lcm =  a*b 
        int temp = a*b; 
        lcm = temp/(GCD.find_gcd(a, b));
        return lcm ;
    }

    public static int gcd_array(int[] arr)
    {
        int gcd = arr[0];

        for (int i = 0;i< arr.length;i++)
        {
            gcd = GCD.find_gcd(arr[i], gcd);
        }

        return gcd;
    }
}

