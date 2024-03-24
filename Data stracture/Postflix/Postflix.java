package Postflix;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Postflix
{
	static int evaluatePostfix(String exp)
	{
	
		Stack<Integer> stack=new Stack<>();

		for(int i=0;i<exp.length();i++)
		{
			char c=exp.charAt(i);
			
		
			if(Character.isDigit(c))
			stack.push(c - '0');
			
		
			else
			{
				int val1 = stack.pop();
				int val2 = stack.pop();
				
				switch(c)
				{
					case '+':
					stack.push(val2+val1);
					break;
					
					case '-':
					stack.push(val2- val1);
					break;
					
					case '/':
					stack.push(val2/val1);
					break;
					
					case '*':
					stack.push(val2*val1);
					break;
			}
			}
		}
		return stack.pop();
	}
	

	public static void main(String[] args) throws IOException
	{
		BufferedReader Br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Expression t: ");
        String expr = Br.readLine();
		System.out.println("postfix evaluation: "+evaluatePostfix(expr));
	}
}
