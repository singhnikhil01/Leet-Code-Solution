package Queque;
//Implementation of the Queue 
public class Queue
 {
    private static int front, rear ,capacity;
    private static int[] queue ;
    Queue(int c ) 
    {
        front = 0;
        rear = 0;
        capacity = c; 
       queue = new int[capacity];

    }
    public  void Enqueue(int data)
    {
        if (capacity  == rear)
        {
            System.out.println("The queque is full");
        }
        else
        {
            queue[rear] = data;
            rear++;
        }
    }
    public  void Dequeue()
    {
        if (front == rear)
        {
            System.out.println("The Queue is empty");
        }
        //shift all the elements from index 2  till rear
    else 
    {
        for (int i = 0; i<= rear-1 ; i++ )
        {
            queue[i] = queue[i+1];
        }
        if (rear< capacity)
        {
            queue[rear] = 0;
        rear--;
        }

        
    }

    }

    // to print all the emements form the Queue
    public  void Display()
    {
        int i ;
        if(front == rear)
        {
            System.out.println("The queue is empty");
    
        }
      //Transverse the element to print
            for(i= front;i<rear;i++)
            {
                System.out.println(queue[i]);
            }
    }


    }

    

