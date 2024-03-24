import java.util.Enumeration;
import java.util.Hashtable;
public class TounamentWinner {

    public static void main(String[] args) 
    {
        String[][] competations  = {{"HTML","C#"},{"C#","python"},{"python","HTML"}};
        int [] result = {0,0,1};
        System.out.println(winner(competations, result));;
        
    }

    static String maximumvalue(Hashtable<String,Integer> table)
    {
        int max = 0 ;
        String team = " " ; 
        Enumeration<String> keys = table.keys(); //get all the keys from the hash table 
        while(keys.hasMoreElements())
        {
            String key = keys.nextElement();
            if(table.get(key)>max)
            {
                max = table.get(key);
                team = key;}

        }
        return team;
    }

     static String winner(String[][] arr, int[] result)
    {
        Hashtable<String,Integer> scores = new Hashtable<>(); 
        int i = 0 ; 

        for(String[] tems: arr)
        {
            if( result[i]==0)
            {
                if(!scores.containsKey(tems[1])) {
                      scores.put(tems[1],3);}

                else  {
                    int temp = scores.get(tems[1]);
                    scores.put(tems[1],3+temp);} }

            else{

                if(!scores.containsKey(tems[0])) {
                      scores.put(tems[0],3);}
               else  {
                    int temp = scores.get(tems[0]);
                    scores.put(tems[0],3+temp);}
            }
        }

        //iterate through the hashtable to get the maximum values 
        String winner = maximumvalue(scores);  
        return winner;
    }
    
}
