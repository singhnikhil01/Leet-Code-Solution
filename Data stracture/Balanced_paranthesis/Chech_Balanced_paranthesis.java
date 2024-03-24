package Balanced_paranthesis;
import java.io.BufferedReader;
import java.io.IOException;
//import java.util.Stack;
import java.io.InputStreamReader;

 class Paranthesis 
{
    static Stack stack = new Stack();
    
    public static boolean check(String expr) 
    {
         //iterate through each element in the input string 
        for (int i = 0; i<expr.length();i++)
        {
            char x = expr.charAt(i);

            if(x == '(' || x =='{' || x ==']' )
            {
                stack.push(expr.charAt(i));
                continue;
            }
                // cannot be empty at this point.
                  if (stack.isempty())
                  return false;
              char check;
              switch (x) {
              case ')':
                  check = stack.pop();
                  if (check == '{' || check == '[')
                      return false;
                  break;
   
              case '}':
                  check = stack.pop();
                  if (check == '(' || check == '[')
                      return false;
                  break;
   
              case ']':
                  check = stack.pop();
                  if (check == '(' || check == '{')
                      return false;
                  break;
              }
          }
          return (stack.isempty());
        }
    

   
      // Driver code
      public static void main(String[] args) throws IOException
      {
        BufferedReader Br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Expression to check balanced paranthesis: ");
        String expr = Br.readLine();
   
          // Function call
          if (check(expr))
              System.out.println("Balanced ");
          else
              System.out.println("Not Balanced ");
      }
  }
    
        
    
    
