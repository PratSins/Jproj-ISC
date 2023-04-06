import java.io.*;
class AlphaFrequency
{
    InputStreamReader read=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(read);
    int j, p, c;
    char i, ch;
    String str;
    AlphaFrequency()
    {
        j=p=c=0;
        str="";
    }
    void getData()
    {
        System.out.println("Enter a String IN UPPERCASE:");
        try
        {
            str=br.readLine().toUpperCase();
        }catch(Exception e){  System.out.println(e);}
        p=str.length();
    }
    void getFrequency()
    {
        System.out.println("The Frequency Of Alphabets in order are:");
        System.out.println("Alphabets\t:\tFrequency");
        for(i='A';i<='Z';i++)
        {
            ch=0;
            c=0;
            for(j=0;j<p;j++)
            {
                ch=str.charAt(j);
                if(ch==i)
                 c++;
            }
            if(c>0)
             System.out.println(i+"\t\t\t"+c);
        }
    }
    public static void main(String args[])
    {
        AlphaFrequency obj=new AlphaFrequency();
        obj.getData();
        obj.getFrequency();
    }
}