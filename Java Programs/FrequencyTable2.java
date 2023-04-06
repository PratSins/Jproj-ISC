/*Count frequency each character
 *example: INDIAN
 *OUTPUT: 
 *CHARACTER FREQUENCY
 *  I           2
 *  N           2
 *  D           1
 *  A           1
 */
import java.io.*;
class FrequencyTable2
{
 public static void main(String args[])throws IOException

 {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your name in capital later:");
        String s=br.readLine();
        int l=s.length();
        int i,j,f;
        for(i=65;i<=90;i++)
        {
            f=0;
             for(j=0;j<l;j++)
             {
                 if(s.charAt(j)==i)
                 {
                     f++;
                 }
             }
        
        if(f>0)
        {
           System.out.println((char)i+"\t"+f); 
        }
    }
    }
}