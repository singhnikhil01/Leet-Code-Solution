/*The test has a total of N question, each question carries 3 marks for a correct answer and −1 for an incorrect answer.
 Chef is a risk-averse person so he decided to attempt all the questions. It is known that Chef got X questions correct and the rest of them incorrect. 
For Chef to pass the course he must score at least P marks.

Will Chef be able to pass the exam or not?

Input Format
First line will contain T, number of testcases. Then the testcases follow.
Each testcase contains of a single line of input, three integers N,X,P.
Output Format

For each test case output "PASS" if Chef passes the exam and "FAIL" if Chef fails the exam.

You may print each character of the string in uppercase or lowercase (for example, the strings "pAas", "pass", "Pass" and "PASS" will all be treated as identical).
*/
import java.util.Scanner;
public class Pass_or_fail
{
   public static void main(String[] args) 
   {
       try (Scanner scan = new Scanner (System.in)) {
        System.out.println("Enter the number of test cases");
           int T = scan.nextInt();
           for (int i =0; i<T;i++)
           {
               System.out.println("Enter N, X and P");
               int N = scan.nextInt();
               int X = scan.nextInt();
               int P = scan.nextInt();
               if (X*3 -(N-X)>=P)
               {
                   System.out.println("PASS");
               }    
               else 
               {
                System.out.println("Fail");
               }

           }
    }

   } 
}
