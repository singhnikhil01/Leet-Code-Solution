/* ***RomanToInteger*** /*
/*
Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
For example, 2 is written as II in Roman numeral, just two one's added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

I can be placed before V (5) and X (10) to make 4 and 9. 
X can be placed before L (50) and C (100) to make 40 and 90. 
C can be placed before D (500) and M (1000) to make 400 and 900.
Given a roman numeral, convert it to an integer.

 

Example 1:

Input: s = "III"
Output: 3
Explanation: III = 3.
Example 2:

Input: s = "LVIII"
Output: 58
Explanation: L = 50, V= 5, III = 3.
Example 3:

Input: s = "MCMXCIV"
Output: 1994
Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
 

Constraints:

1 <= s.length <= 15
s contains only the characters ('I', 'V', 'X', 'L', 'C', 'D', 'M').
It is guaranteed that s is a valid roman numeral in the range [1, 3999].
*/
import java.util.HashMap;

public class Roman_to_integer
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
