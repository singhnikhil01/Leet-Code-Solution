public class Sortedsquare {

    public static void main(String[] args) {

        int[] arr ={ -9,-7,1,2,3,4,5,6}; 
        /*//simply sorting with return  error because result will not be sorted 
            Either need to short again
        */
        int[] arr2 = sortedsquare(arr);
        printarray(arr2);
        
    }

    public static void printarray(int[] arr) {
        
        for(int x : arr){
            System.out.print(x+" ");
        }
        System.out.println();
    }

    static int[] sortedsquare(int [] arr)
    {
        
        int[] arr2 = new int[arr.length];
        int count = arr.length-1;
        int left =0; 
        int right = arr.length-1;

        while (left<=right)
         {
            if(Math.abs(arr[left])<Math.abs(arr[right])){
                arr2[count] = arr[right]*arr[right];
                right--;}
            else{
                    arr2[count] = arr[left]*arr[left];
                    left++;}   
                count--;}       
        return arr2;
    }
    
}
