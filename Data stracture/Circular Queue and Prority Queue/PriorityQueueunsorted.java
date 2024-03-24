//Highest number will get First Priority
//Unsorted Priority Queue 
public class PriorityQueueunsorted 
{
    public class Node 
    {
        int data;
        int priority;
        Node next;

        Node(int data , int priority)
        {
            this.data = data;
            this.priority = priority;
            this.next=null;
        }
    }
    Node head =null;
    Node rear = null;
    public boolean isempty()
    {
        if(head == null)
        {
            //System.out.println("");
            return true;
        }
        return false ;
    }
    public int peek()
    {
        if(head==null)
       { 
           //System.out.println("Queue is empty");
            return 0;
        }

        Node temp = head ;
        int x = temp.priority;
        int value = 0;
        while(temp.next !=null)
        {
            //System.out.println(x+" "+temp.next.priority);
            
            if( x > temp.next.priority ) 
            {
                value = temp.data;
                //System.out.println(value);
              }
              else 
              {  
                 x = temp.next.priority;
                 value= temp.next.data;
                // System.out.println("value: "+value);
                  
              }  
              temp=temp.next;
        }
        //System.out.println("value:"+value);
        return value ;
    }
    public void push(int data,int pri)
    {
        Node node = new Node(data,pri);
        if(head == null)
        {
            head = node;
        }
        else 
        {
            node.next =head.next ;
            head.next = node; 
        }

    }
    public void printlist()
    {
        Node temp = head ;
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    public int pop()
    {
        if(head==null)
        { 
            System.out.println("Queue is empty");
             return 0;
         }
 
         Node temp = head ;
         Node front = head ;
         int x = temp.priority;
         int value = 0;
         //find the node having highest priority
         while(temp.next !=null)
         {
             //after loop x will have highest priority
             if( x > temp.next.priority ) 
             {
                 value = temp.data;
               }
               else 
               {  
                  x = temp.next.priority;
                  value = temp.next.data;  
               }  
               temp=temp.next;
            }
             //if has at least two element,
           // int i = 0;
            if ( front.priority == x) 
            {
                int a = front.data;
                head = front.next; 
                return a;
            }

            while(front!=null && front.priority!=x)//unless we get the priority 
            {         
                point = front;
                front=front.next;
            }
            value = front.data;
            point.next =front.next; //point will be our next node 
             return value;
    }
    public static void main(String[] args) 
    {
        PriorityQueueunsorted pq = new PriorityQueueunsorted();
        pq.push(56, 6);
        pq.push(10, 15);
        pq.push(50, 27);
        pq.push(100, 1 );
        //System.out.println(pq.peek());
        System.out.println(pq.pop());
        pq.printlist();
    }
    
}
