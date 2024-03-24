import java.util.Scanner;
public class Reversestring 
{
     
    public static String reverseString(String str)
    {
        if(str.equals(""))
            return str;
        
        return reverseString(str.substring(1))+str.charAt(0);
    }

    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String y = scan.nextLine();
        System.out.println(reverseString(y));
        scan.close();
    }
    
}
