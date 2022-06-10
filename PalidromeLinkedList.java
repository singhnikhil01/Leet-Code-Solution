import java.util.Stack;

//if we put any anthing in the any instance head final head will also change 
public class PalidromeLinkedList 
{

  public class ListNode {
      int val;
      ListNode next;
      ListNode(){ }

      ListNode(int val,ListNode y)
       { 
            this.val = val; 
            this.next = y; 
    }
  }
  
  //Copying a linked list 
    public  ListNode copylinkedlist(ListNode list)
    {
        ListNode current= list;
        ListNode tail = null;
        ListNode newList=null;
        while (current != null)
        {
            if (newList == null)
            {
                newList = new ListNode(current.val, null);
                tail = newList;
                current = current.next;
            }
            
                tail.next = new ListNode(); //adding a node after tail
                tail = tail.next;   //maving tail to the next node 
                tail.val = current.val;//tail value to the current value 
                tail.next = null;   //tail's next null
                current = current.next; //moving the current value 
            
        }
        return newList;
  }
  //reversing a linked list
   ListNode reverse(ListNode node)
  {
        ListNode current = node; 
        ListNode temp = null;
        ListNode prev = null;
        while (current !=null)
        {
         temp = current.next;
         current.next = prev ;
         prev = current;
         current = temp;
        }
        
        return prev;
  }

    public boolean isPalindrome()//ListNode head)
    {
        PalidromeLinkedList pd = new PalidromeLinkedList();
        ListNode point = head;
        ListNode temp = pd.copylinkedlist(head);
        ListNode prev = reverse(temp); 

        //compararision with reverse linked list to chcek the palidrome number 
        while(point != null )
        {
            //System.out.println(point.val);
            //System.out.println(prev.val);
            //System.out.println("----------------------------------------");

            if(point.val != prev.val)
                return false;

            point = point.next;
            prev = prev.next;
        }
        
        return true ;
    }

     ListNode head = null;
     ListNode tail = null;

    public  void add(int data)
    {
        ListNode node =new ListNode(data,null); 
        if (head==null)
        {
            head = node;
            tail=node;
            return;
        }
        tail.next = node;
        tail=node;
    }

    public  void println()
    {
        ListNode temp = head;
        while(temp!= null)
        {
            System.out.println(temp.val);
            temp = temp.next;
        }
    }
    //check self palidrome using reversing techinique to reduce the time complexicity 
    // boolean  checkselfpalidrome(ListNode head)
    // {
    //     ListNode temp = head;
    //     ListNode slow = head;
    //     ListNode fast = head;
    //     while(slow.next!=null && fast.next.next!=null)
    //     {
    //         slow = slow.next;
    //         fast = fast.next.next;
    //     }
    //    ListNode first_half_node =  slow ;

    //   return false;
    // }

    //using stack , stack is last in first out so 
  boolean usingstack()
    {
        Stack<Integer> stack= new Stack<Integer>();
        ListNode temp = head ;
        while(temp!=null)
        {
            stack.push(temp.val);
            temp = temp.next;
        }
        while(head!=null)
        {
            int x = stack.pop();
            if(head.val!=x)
            {
                return false;
            }

            head = head.next;
        }
        return true;
    }

    public static void main(String[] args) {
        PalidromeLinkedList pd = new PalidromeLinkedList();
        pd.add(30);
        pd.add(2);
        pd.add(1);
        pd.add(30);
        System.out.println(pd.usingstack());
        //pd.println();
}
}
    
