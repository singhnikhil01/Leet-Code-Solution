package Queque;

public class Queue_usingLinkList 
{
    Node  front , rear ;
   // int size ;
   public  class Node
    {
    
        int data ;
        Node link;
    
    public Node(int data)
    { 
        this.data = data;
        this.link = null;

    }
}
public Queue_usingLinkList()
{ 
    this.front = this.rear = null;
}

// Meathods to implement diffrent operation in the queue 
public void Enqueue( int x)
{
    Node node = new Node(x);
    if(this.rear== null)
    {
        this.front = this.rear = node;
        //System.out.println("The queue is full");
    }
    // add the 
    this.rear.link = node;
    this.rear = node;
    

}
public void Dequeue()
{
    if(this.front == null )
    return;

    Node  node = this.front;
    this.front = this.front.link;

    if(this.front == null)
    this.rear= null;

}

}