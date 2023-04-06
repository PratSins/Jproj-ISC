import java.util.Scanner;

class RPN
{
    public RPN()
    {
    }

    public byte menu()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("\n 1.Postfix To Infix");
        System.out.print("\n 2.Infix To Postfix");
        System.out.print("\n Enter Choice:");

        return sc.nextByte();
    }

    int prec(char ch)
    {
        switch (ch)
        {
            case '+':
            case '-':
                return 1;

            case '*':
            case '/':
                return 2;

            case '^':
                return 3;
        }
        return -1;
    }

    boolean isOperand(char x)
    {
        return (x >= 'a' && x <= 'z') ||
                (x >= 'A' && x <= 'Z');
    }

    String infixToPostfix(String inf)
    {
        // initializing empty String for postfix
        String postf = "";

        // initializing empty stack
        MyStack stack = new MyStack(inf.length());

        for (int i = 0; i<inf.length(); ++i)
        {
            char c = inf.charAt(i);

             // If the scanned character is an operand, add it to output.
            if (Character.isLetterOrDigit(c))
                postf += c;

            // If the scanned character is an '(', push it to the stack.
            else if (c == '(')
                stack.push(c);

            //  If the scanned character is an ')', pop and output from the stack
            // until an '(' is encountered.
            else if (c == ')')
            {
                while (!stack.isEmpty() && stack.peek() != '(')
                    postf += stack.pop();

                if (!stack.isEmpty() && stack.peek() != '(')
                    return "Invalid Expression"; // invalid Expression
                else
                    stack.pop();
            }
            else // an operator is encountered
            {
                while (!stack.isEmpty() && prec(c) <= prec(stack.peek())){
                    if(stack.peek() == '(')
                        return "Invalid Expression";
                    postf += stack.pop();
             }
                stack.push(c);
            }

        }

        // pop all the operators from the stack
        while (!stack.isEmpty()){
            if(stack.peek() == '(')
                return "Invalid Expression";
            postf += stack.pop();
         }
        return postf;
    }

    String postfixToInfix(String postf)
    {
        MyStackString stack = new MyStackString(postf.length());
        for (int i = 0; i < postf.length(); i++)
        {
            // Push operands
            if (isOperand(postf.charAt(i)))
            {
            stack.push(postf.charAt(i) + "");
            }

            // We assume that input is
            // a valid postfix and expect
            // an operator.
            else
            {
                String op1 = stack.peek();
                stack.pop();
                String op2 = stack.peek();
                stack.pop();
                stack.push("(" + op2 + postf.charAt(i) + op1 + ")");
            }
        }

        // There must be a single element
        // in stack now which is the required
        // infix.
        return stack.peek();
    }
    // Driver method
    public static void main(String[] args)
    {
        RPN rpn=new RPN();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Expression: ");
		String exp = sc.nextLine();
        if(rpn.menu() == 1)
			System.out.print("\n" +rpn.postfixToInfix(exp));
		else
			System.out.print("\n" +rpn.infixToPostfix(exp));
	System.out.println();
		System.exit(0);
    }
}
