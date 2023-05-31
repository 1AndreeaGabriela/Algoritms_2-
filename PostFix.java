import java.util.Stack;
import java.lang.Character;
public class PostFix {
    static int evaluatePostfix(String expresie)
    {

        Stack<Integer> mystack=new Stack<>();


        for(int i=0;i<expresie.length();i++)
        {
            char c=expresie.charAt(i);


            if(Character.isDigit(c))
                mystack.push(c - '0');


            else
            {
                int val1 = mystack.pop();
                int val2 = mystack.pop();

                switch(c)
                {
                    case '+':
                        mystack.push(val2+val1);
                        break;

                    case '-':
                        mystack.push(val2- val1);
                        break;

                    case '/':
                        mystack.push(val2/val1);
                        break;

                    case '*':
                        mystack.push(val2*val1);
                        break;
                }
            }
        }
        return mystack.pop();
    }

}
