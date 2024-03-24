public class DoubleEndedQueue 
{
    int max = 1000;
    int front;
    int rear;
    int size;
    int arr[] = new int[max];
    DoubleEndedQueue(int size)
    {
        this.size = size;
        this.rear = 0;
        this.front = -1;
    }
    //check if the double ended queue is 
    boolean isempty()
    {
        if(front == -1)
            return true;
        else
            return false; 
    }
    //check if the doubleended queue is full or not 
    boolean isfull()
    {
        if(rear == size-1 && front == 0 || front == rear+1)
         return true;
        else 
        return false;
    }
    public void insertAtFront(int data)
    {
        if(isfull())
          System.out.println("Queue front is full");
        
        else if(front== -1 )
        {
            front = 0;
            rear = 0;
        }
        else if(front == 0)
            front = size-1;
        else
            front = front +1;

        arr[front]=data;
        
    }

    public void insertAtRear(int data)
    {
        if(isfull())
            System.out.println("The queue is full");
        if (front == -1)
        {
            //fgetting error 
            front = 0;
            rear = 0;
        }
        else if(rear==size-1 )
            {
                rear = 0;
            }
        else
        {
            rear = rear+1;
        } 
        arr[rear]=data;
    
    }

    public void deletefromFront()
    {
        if(isempty())
            System.out.println("Queue is empty");
        //if queue has only one element 
        else if(front == rear)  
        {
           front = -1 ;
           rear = -1 ;
        }
        else if(front == size-1)
            front = 0;
        else 
            front = front + 1 ;
    }
    public void deletefromRear()
    {
        if(isempty())
        {
            System.out.println("Queue is empty");
        }
        else if(rear == front)
        {
            rear = -1 ;
            front = -1 ;     
        }
        else if(rear == 0)
            rear = size -1;
        
        else
            rear = rear-1;  
    }
    public int getfront()
    {
        if(isempty())
        {System.out.println("Queue is empty");
    
        return -1 ;
    }
       
        return arr[front];
       
        
    }
    public int getrear()
    {
        //System.out.println("Queue is empty");
        if(isempty()|| rear < 0)
        {
            System.out.println("Queue is empty");
            return -1 ;
        }
        return arr[rear];
    }

    public static void main(String[] args)
     {
        DoubleEndedQueue dq = new DoubleEndedQueue(5);
          
        System.out.println("Insert element at rear : 5 ");
        dq.insertAtRear(5);
         
        
        dq.insertAtRear(10);
        System.out.println("insert element at rear end : 10 ");
         
        System.out.println("get rear element : "+ dq.getrear());
         
        dq.deletefromRear();
        System.out.println("After delete rear element new rear become : " +
                               dq.getrear());
         
        System.out.println("inserting element at front end");
        dq.insertAtFront(15);
         
        System.out.println("get front element: " +dq.getfront());
        dq.deletefromFront();
         
        System.out.println("After delete front element new front become : " +
                                   +  dq.getfront());
        
        
    }
}
