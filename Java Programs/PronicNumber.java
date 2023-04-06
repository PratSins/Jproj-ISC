import java.io.*;
class PronicNumber
{
    public static void main(String args[])throws IOException
    {
        System.out.print('\u000c');
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        System.out.print("Enter a number : ");
        int n = Integer.parseInt(in.readLine());
        int flag = 0;
    
        for(int i=1; i<=n; i++)
        {
            if(i*(i+1) == n)
            {
                flag = 1;
                break;
            }
        }
         if(flag == 1)
            System.out.println(n+" is a Pronic Number.");
        else
            System.out.println(n+" is not a Pronic Number.");      
    }
}