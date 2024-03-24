package inflixtoPostflix;
class Stack 
{
    int top = -1 ;
    char [] arr = new char[100];
    
    //push function 
    void push(char a)
    {
        try 
    {
        arr[++top]=a ;
    }
    catch(StringIndexOutOfBoundsException e)
    {
        System.out.println("Stack full, no room to push, size=100");  
        System.exit(0); 
    }
       
    }
    //pop function
    char pop()
    {
       return arr[top--];
    }
    boolean isempty()
    {
        if (top==-1)
       { return true;}
        else {return false;}
    } 
    char peek()
    {
        return arr[top];
    }
}