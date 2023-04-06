import java.util.*;
class Anagrams
{
    String word;
    int c;
    Anagrams()
    {   
        word="";
        c=0;
    }
    public void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a word:");
        word=sc.next();
    }
    private void getAnagrams(String str, int sI, int eI)
    {
        if (sI != eI)
        {
            for (int i = sI; i <= eI; i++)
            {
                str = swapChars(str,sI,i);
                getAnagrams(str, sI+1, eI);
                str = swapChars(str,sI,i);
            }
        }
        else
        {    
            System.out.println(str);
            c++;
        }
    }
    private String swapChars(String s, int x, int y)
    {
        if(x==y)
            return s;
        else
        {
            char arr[] = new char[s.length()];
            for(int i=0;i<s.length();i++)
              arr[i]=s.charAt(i);
            char t= arr[x] ;
            arr[x] = arr[y];
            arr[y] = t;
            return String.valueOf(arr);
        }
    }    
    void display()
    {
        int len = word.length();
        getAnagrams(word, 0, len-1);
        System.out.println("Total no. of Anagrams:"+c);
    }
    public static void main(String args[])
    {
        Anagrams obj=new Anagrams();
        obj.accept();
        obj.display();
    }
}