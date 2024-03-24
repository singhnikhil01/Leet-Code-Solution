package ReverseStack;
public class Main {
    public static void main(String[] args) {
        

        Stack<Integer> st = new Stack<Integer>(5);
        st.push(10);
        st.push(20);
        st.pop();
        st.push(100);
        st.pop();
        st.push(3);
        st.toString();
    }
    
}
