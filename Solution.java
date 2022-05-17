import java.util.HashMap;

public class Solution
{
 public static void main(String[] args) {
     romanToInt("XLVIII");
     
 }
 public static int romanToInt(String s)
 {
     int sum = 0;
     int i =0;
     HashMap<Character,Integer> map = new HashMap<Character,Integer>();
     map.put('I',1);
     map.put('V',5);
     map.put('X',10);
     map.put('L',50);
     map.put('C',100);
     map.put('D',500);
     map.put('M',1000);
    char[] arr = s.toCharArray();
    //System.out.print(arr);
    for ( i = 0; i < s.length();i++)
    { 
        if ((i < s.length()-1))
        {
        if(map.get(arr[i])<map.get(arr[i+1] ) )
        {
            sum = sum-map.get(arr[i]) ;
        }
        else
        {
            sum = sum + map.get(arr[i]);
        }
         }
         
        

    }

    sum = sum+map.get(arr[s.length()-1]);
    //System.out.println(sum);
     return sum;
 }
}
