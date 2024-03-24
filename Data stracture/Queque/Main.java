package Queque;


public class Main {
    public static void main(String[] args) 
    {
        Queue queue  = new Queue(5);
        queue.Enqueue(10);
        queue.Enqueue(20);
        queue.Enqueue(30);
        queue.Display();
        System.out.println();
        queue.Dequeue();
        queue.Display();
        
    }
   
    
}
