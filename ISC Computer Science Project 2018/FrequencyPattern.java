import java.util.*;
public class FrequencyPattern
{
    int freq[];
    String str;
    FrequencyPattern()
    {
        str="";
        freq=new int[26];
    }
    void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String (IN UPPERCASE):");
        str=(sc.nextLine().trim()).toUpperCase();
    }
    static void getFreq()
    {
        double n=Math.rint(12.5);
        long m=Math.round(12.5);
        System.out.println(n+"\n"+m);
    }
}