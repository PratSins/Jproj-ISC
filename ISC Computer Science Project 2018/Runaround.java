import java.util.*;
class Runaround
{
    Runaround()
    {}
    public void menu()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input:");
        int num = 1;
        int idx = 1;
        String output = "\n";
        while(true)
        {
            num = sc.nextInt();
            
            //DISPLAYS OUTPUT
            if (num == 0)
            {
                System.out.print(output);
                break;
            }

            //CHECKS FOR VALIDITY
            if ((num < 10) || (num > 999999))
            {
                System.out.println("Number must have between 2 and 7 digits");
                continue;
            }

            //FINDS RUNAROUND NUMBER AND MAKES OUTPUT
            while (true)
            {
                if (isRunaround(num++))
                {
                    output += "Case " +idx++ +": " +(--num) +"\n";
                    break;
                }
            }

            
        }
    }

    public boolean isRunaround(int n)
    {
        int cn = n;

        // COUNTING DIGITS TO DETERMINE ARRAY SIZE
        int dc = 0;
        for (int i = 0;;i++)
        {
            if (n / (int)Math.pow(10, i) == 0)
            {
                dc = i;
                break;
            }
        }
        int[] dig=new int[dc];

        //POPULATING ARRAY
        for (int i = dc - 1; i >= 0; i--)
        {
            dig[i] = n % 10;
            n = n / 10;
        }

        //CHECKING FOR REPEATING DIGITS
        for (int i = 0; i < dc; i++)
        {
            for (int j = 0; j < dc; j++)
            {
                if ((j != i) && (dig[i] == dig[j]))
                    return false;
            }
        }

        //DOING A RUNAROUND
        int pointer = 0;
        int[] cp=new int[dc];//check pointer
        for (int i = 0; i < dc; i++)
            cp[i] = 0;
        for(int i = 0; i < dc; i++)
        {   
            pointer += dig[pointer];
            while (pointer >= dc)
                pointer = pointer - dc;
            cp[pointer] += 1;
        }

        if (pointer == 0)
        {
            for (int i = 0; i < dc; i++)
            {
                if (cp[i] != 1)
                    return false;
            }
            return true;
        }
        return false;
    }
    public static void main(String[] args) 
    {
        Runaround r=new Runaround();
        r.menu();
    }
}