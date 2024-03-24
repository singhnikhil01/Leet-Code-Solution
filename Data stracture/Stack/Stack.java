package Stack;
//Stack implementatiuon using Arraylist 
import java.util.ArrayList;
public class Stack<E>
{
    int top = -1;
    int size;
    ArrayList<E> arr;   
    Stack(int size)
    {
        this.size = size ;
        this.arr = new ArrayList<E>(size);
    }
    
    //It will add an element in the stack
    public void push(E data)
    {
        
        if(top + 1 == size )
        {
            System.out.println("StackOverFlow");
        }
        else
        {
            //increment the top to go to the next position
            top++;
            if(arr.size() > top)
            arr.set(top, data); //replace the existing data in the top if the stack 
        else 
           arr.add(data);}


    }
    //it will remove element from the Stack
    public void pop()
    {
        if (top == -1)
        {
            System.out.println("EmptyStack");
        
        }
        else 
        {
            top--;
        }
    }

    E top()
    {
        // If stack is empty
        if (top == -1) {
 
            // Display message when there are no elements in
            // the stack
            System.out.println("Stack Underflow");
 
            return null;
        }
 
        // else elements are present so
        // return the topmost element
        else
            return arr.get(top);
    }
    boolean isEmpty(){ return top == -1; }

    //this method will print all the elements in  the stack 
    public String toString()
    {
        
        int i = 0;
 
        String Ans = "";
 
        for (int y = top; y > i; y--) {
            Ans += String.valueOf(arr.get(y)) + " ";
        }
 
        Ans += String.valueOf(arr.get(i));
 
        return Ans;
    }

}