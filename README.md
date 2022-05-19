**Use of the Bitwise operator**
image.png

***What are bitwise operators?***
Bitwise operators are just like regular operators, i.g., “&&”, “+”, “||”, etc. The only difference is they deal with the integers at the binary level, i.e., they look at the integers as binary digits or bits.

***Bitwise AND “&”***
The bitwise AND operator goes through the binary representation of integers and compares the two binary equivalents bit by bit. In order for the returning bit to be 1 both bits being compared have to be 1.

image.png

***Bitwise left shift “<<” and right shift “>>”***

Bitwise left shift and right shift, shift the binary number to the left and right by the given number(the number to the right).
Right shift adds zeroes to the right and left shift removes the bits from the end.

The left shift (<<) operator is used for the multiplication whereas the right shift (>>) is used for the division.

The multiplication of two numbers x, y can be written as x * y = (x * 2) * (y / 2) if y is even else it's equal to
 x * y = (x * y) * (y / 2) + x.


So whenever the second number becomes odd, add the first number to the result. Let's see the steps to solve the problem.

***Algorithm(Multiplication of two number using bit wise operator)***
Initialise two numbers.
Write a loop that iterates till the second number becomes 0.
If the second number is odd, then add the first number to the result.
Left shift first number by 1 bit.
Right shift second number by 1 bit.

#include <bits/stdc++.h>
using namespace std;
int multiplyTwoNumbers(int a, int b) {
   int result = 0; 
   while (b > 0) { //checking if the b is greater than Zero
      if (b & 1) { //checking if the b is even or odd 
         result += a;
         }
      a = a << 1;
      b = b >> 1;
   }
   return result;
}
int main() {
   cout << multiplyTwoNumbers(75, 4) << endl;
   cout << multiplyTwoNumbers(90, 9) << endl;
   cout << multiplyTwoNumbers(83, 66) << endl;
   return 0;
}

***Algorithm(Division using bitwise operator)***
Determine the most significant bit in the divisor. This can easily be calculated by iterating on the bit position i from 31 to 1.
Find the first bit for which divisor  **divisor** << i is less than dividend and keep updating the ith bit position for which it is true.
Add the result in temp variable for checking the next position such that (temp + (divisor << i) ) is less than dividend.
Return the final answer of quotient after updating with corresponding sign.