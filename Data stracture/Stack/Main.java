package Stack;
public class Main {
    public static void main(String[] args) {
        

        //getting error while printing the elements of the stack 
        Stack<Integer> st = new Stack<Integer>(4); 
        System.out.println(st.isEmpty());
        st.push(10);
        st.push(20);
        System.out.println(st.isEmpty());
        //System.out.println(st.top());
        st.pop();
        //System.out.println(st.top());
        st.push(100);
        //System.out.println(st.top());
        st.pop();
        st.push(3);
        System.out.println(st.toString());
    }
    
}
