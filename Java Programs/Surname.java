import java.io.*;
class Surname
{
 public static void main(String args[])throws IOException

 {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your name");
        String s=br.readLine();
        int l=s.length();
        char ch,chr;
        int pos=0;
        for(int i=0;i<l;i++)
        {
            ch=s.charAt(i);
            if(ch==' ')
            {
                pos=i;
            }
        }
        System.out.print(s.charAt(0));
         for(int j=0;j<pos;j++)
        {
            chr=s.charAt(j);
            if(chr==' ')
            {
                System.out.print("."+s.charAt(j+1));
            }
        }
        System.out.print("."+s.substring((pos+1),(l)));
    }
}