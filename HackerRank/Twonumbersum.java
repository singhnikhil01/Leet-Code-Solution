/*
 * the problem is to find any two mumbers that sum to the target number in an array , the first approach we have used is the 
 * bruteforce approach that is solveable in O(n^2) but the better solution is to work with the hash table 
 */
import java.util.Hashtable;
public class Twonumbersum{
    public static void main(String[] args) {

        int[] array = {3,5,-4,8,11,1,-1,6};
        int sum = 10 ;
        //twonumbersum(array, sum);
        // usingHashtable(array, sum);
        sorting_solution(array, sum);
            
    }


    //solving the problem in the O(n^2), there is a better soluion to use hash tabel for this question 
    public static int[] twonumbersum(int[] arr, int sum){   
        int[] myArray = new int[20];
        for(int i = 0 ;i< arr.length;i++){

            for(int j= i+1 ;j< arr.length;j++){

                if(arr[i]+arr[j] == sum){

                    myArray[0]= arr[i];
                    myArray[1]= arr[j];
                    System.out.println(arr[i]);
                    System.out.println(arr[j]);
                    break;
                }
            }
        }

          return myArray;
    }

    //solving two sum problem using hashtable 
    public static int usingHashtable(int[] arr , int sum )
    {
        Hashtable<Integer,Boolean> table = new Hashtable<>();

        for(int x:arr){

           int temp = sum-x;
           if(table.containsKey(temp))
            {System.out.println(x+" "+temp);}
           else
            {
                table.put(x, true);}
        }

        return 0 ; 
    }





   public static void sorting_solution(int[] arr, int sum ) 
    {
         int N = arr.length;
         int left = 0 ;
         int right = N-1; 
         quickSort(arr, 0, N-1);

        for(int i = 0 ; i<N/2 ;i++)
        {
           int temp = arr[left]+arr[right];
            
           if (temp == sum)
           {
            System.out.println(arr[left]);
            System.out.println(arr[right]);
            break;
           }
           else if(temp < sum)
           {
             left++;
           }
           else
           {
            right--;
           }
        }
    
          
    }


    //implementing the sorting algorithm
    public static void swap(int[] arr,int i , int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j]= temp;
    }
    
    
   static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low -1;
       

        for (int j = low;j<=high-1;j++) {

            if( arr[j] < pivot)
            {
                i++;
                swap(arr,i,j);}
          }
        swap(arr, i+1, high );
        return (i+1);}


    static void quickSort(int[] arr , int low , int high)
    {
        if(low<high)
        {
            int pi =partition(arr, low, high);
            quickSort(arr, low, pi-1);
            quickSort(arr, pi+1, high);
        }
    }
 }
    


