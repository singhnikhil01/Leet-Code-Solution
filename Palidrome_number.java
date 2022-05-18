public class Palidrome {
    public static void main(String[] args) 
    {
        
        System.out.println(isPalindrome(-121));
    }
    public static boolean isPalindrome(int x) 
    {
        int num = 0;
        int y = x ;
        while(x!=0)
        {
            num = num*10+ x % 10;
            x = x /10;

        }
        if (num == y  && (num >=0))
        {
            return true; 
        }
        else
        {
            return false;
        }
    }
}
