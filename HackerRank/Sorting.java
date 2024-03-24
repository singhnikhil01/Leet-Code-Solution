public class Sorting
{
    public static void main(String[] args) {
        
        int[] arr = {3,5,-4,8,11,1,-1,6};
         int N = arr.length;
         quickSort(arr, 0, N-1);
         printarray(arr);
    }

    static void printarray(int[] arr)
    {
        for(int x: arr)
        {
            System.out.print(x+" ");
        }
    }

    static void swap(int[] arr, int i , int j ){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp ; }

    static void quickSort(int[] arr, int low , int high )
    {
        if(low<high)
        {
            int mid = partition(arr, low,high);
            quickSort(arr, 0, mid - 1);
            quickSort(arr, mid + 1, high);
        }
    }

    static int partition(int[] arr, int low, int high)
    {
        int pivot = arr[high];
        int i = low -1 ; 

        for(int j = low;j<=high-1;j++)
        {
            if(arr[j]<pivot)
            {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i+1, high);
        return i+1;
    }
}