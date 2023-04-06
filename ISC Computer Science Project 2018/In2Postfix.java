import java.io.*;
import java.util.*;
public class In2Postfix
{
    private String input, output;
    private Stack theStack;
    public In2Postfix(String inp)
    {
        input=inp;
        theStack = new Stack();
    }
    public String doTrans()
    {
        char ch;
        for(int i=0; i<input.length() ; i++)
        {
            ch=input.charAt(i);
            switch(ch)
            {
                case '+':
                case '-':
                   getOper(ch,1);
                   break;
                case '*':
                case '/':
                    getOper(ch,2);
                    break;
                case '^':
                    getOper(ch,3);
                    break;
                case '(':
                     theStack.push(ch);
                     break;
                case ')':
                     theStack.push(ch);
                     break;
                default:
                     output+=ch;
                     break;
            }
        }
    }
}
