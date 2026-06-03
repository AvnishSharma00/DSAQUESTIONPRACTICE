import java.util.Stack;

public class PostFixExpressionEvolution {
    public static void main(String[] args) {
        String[] tokens={"1","2","+","3","*","4","-"};
        Stack<Integer> st=new Stack<>();
           for(String str:tokens){
               switch(str){
                     case "+":
                      st.push(st.pop()+st.pop());
                      break;
                      case "-":
                      int b=st.pop();
                      int a=st.pop();
                      st.push(a-b);
                      break;
                      case "*":
                      st.push(st.pop()*st.pop());
                      break;
                      case "/":
                      b=st.pop();
                      a=st.pop();
                      st.push(a/b);
                      break;

                      default:
                      st.push(Integer.parseInt(str));
               }
                    
           }
           System.out.println(st.peek());
    }
}
