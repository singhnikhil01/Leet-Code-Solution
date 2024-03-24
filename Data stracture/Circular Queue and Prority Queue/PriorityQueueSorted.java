//Priority Queue using sorted Linked List 
//Priority in the accending order 
public class PriorityQueueSorted 
{
    public class Node
    {
        int data;
        int priority;
        Node next;
        public Node(int data, int priority)
    {
        this.data = data;
        this.priority = priority;
    }
    }
    
    Node head = null;
    public int peek()
    {
        if(head == null)
        {
            System.out.println("The Queue is Empty");
            return 0;
        }
        else 
        return head.data;
    }
    public int pop()
    {
        if(head == null)
        {
            System.out.println("The Queue is Empty");
            return 0;
        }
        else 
        {
            int temp = head.data ;
            head = head.next;
            return temp;

        }
       
    }
    
    public int isempty()
    {
        if(head == null)
        return 1 ;
        return 0;
    }
    public  void push(int data, int pri)
    {
        Node node = new Node(data,pri);
       if(head == null)
       {
           head = node;
           return;
       }
       Node temp = head ;
       Node rear= null;

       //if number with higher Priority exists
       while(temp!=null && temp.priority>pri)
       {
           rear = temp;
           temp=temp.next; 
       }
       //if head is null
       if(temp==null)
       {
           rear.next = node;
       }
       else 
       {
           //if  rear is null(rear's next is head )
        if (rear == null) {
          
            node.next = head;
            head = node;
        } 
        else {
            node.next = temp;
            rear.next = node;
        }
    }
        
    }
    public static void main(String[] args) 
    {
        PriorityQueueSorted pq = new PriorityQueueSorted();
        pq.push(5, 2);
        pq.push(1, 3);
        System.out.println(pq.peek());
        pq.push(7, 5);
        pq.push(9, 1);
        System.out.println(pq.pop());
        System.out.println(pq.pop());
        System.out.println(pq.peek());
    
}}

