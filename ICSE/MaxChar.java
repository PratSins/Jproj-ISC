import java.util.*;
class MaxChar
{
    String str;
    char mc;
    int oc;
    MaxChar()
    {
        str="";
        oc=0;
        mc='\u0000';
    }
    void getSentence()
    {
        Scanner sc=sc=new Scanner(System.in);
        System.out.println("Enter a sentence:");
        str=sc.nextLine().toLowerCase();
    }
    void getMaxChar()
    {
        
    }
}