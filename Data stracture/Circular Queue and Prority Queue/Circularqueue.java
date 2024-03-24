public class Circularqueue 
{
    int max = 1000;
    int size ;
    int front;
    int rear;
    int arr[]= new int[max];
    Circularqueue(int size)
    {
        this.size = size;
        this.front=-1;
        this.rear = -1;

    }

    public void enqueue(int data)
    {
        if(rear == size - 1 )
        {
            System.out.println("The queue is full");
        }
        else if(rear == size -1 && front !=0 )
        {
            rear = 0;
            arr[rear]=data;
        }
        else if(rear == -1 && front == -1 )
        {
            front = 0;
            rear = 0;
            arr[rear]=data;
        }
        else
        {
            rear++;
            if(front<=rear)
            {
                arr[rear]=data;
            }
            else 
            {
                arr[rear]=data;
            }
        }
    }

    public int Dequeue()
    {
        int temp;
        if(front == -1 && rear == -1 )
        {
            System.out.println("Queue is empty");
        }
        temp = arr[front];
        if(front == rear)
        {
            front = -1;
            rear = -1; 
        }
        else if(front == size - 1)
        {
            front = 0;
        }
        else
        {
            front = front +1 ;
        }
        return temp;
        
    }
    public void display()
    {
        if(front == -1 && rear == -1 )
        {
            System.out.println("Queue is empty");
        }
        if(rear>=front)
        {
            for(int i = front;i<=rear;i++)
            {
                System.out.println(arr[i]+" ");
            }
        }
        else 
        {
            for(int i = front;i<size;i++)
            {
                System.out.println(arr[i]+" ");
            }
            for(int i = 0; i <= rear; i++)
            {
            System.out.print(arr[i]+" ");
            }
        }
    }
    public static void main(String[] args)
{
	
	Circularqueue q = new Circularqueue(5);
	
	q.enqueue(10);
	q.enqueue(23);
	q.enqueue(12);
	q.enqueue(-6);
    q.enqueue(100);
    q.enqueue(-6);
    q.enqueue(100);
	int x = q.Dequeue();
    q.display();
    System.out.println("dequeue element :"+x);
  
}
    
}

