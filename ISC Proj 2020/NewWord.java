import java.util.*;
class NewWord
{
    String word;
    NewWord(){ word="";  }
    void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a word:");
        word = sc.next();
        if(!isWord(word))
        {
            System.out.println("Error .. not a word.");
            System.exit(0);
        }
        
        for (int i=0;i<word.length();i++)
        {
            if(Character.isUpperCase(word.charAt(i)))
            {
                System.out.println("Error .. Uppercase characters not allowed.");
                System.exit(0);
            }
        }
    }
    private boolean isWord(String w)
    {
        for(int i=0;i<w.length();i++)
        {
            if(" \"'\\.;:!@#$%^&*()0123456789".indexOf(w.charAt(i))!=(-1))
            {
                return false;
            }
        }
        return true;
    }
    void displayNew()
    {
        String w=word;
        while(w.length()!=1)
        {
            w=getNext(w);
            System.out.println(w);
        }
    }
    String getNext(String s)
    {
        int k=0;
        char ch;
        String ns="";
        for(int i=0; i<s.length();i++)
        {
            if(i>s.length()-1)
              break;
            else if(i+1 > s.length()-1)
             {
                 ns+=s.charAt(i);
                 break;
                }
            else{
                k=sumChar((int)(s.charAt(i))-96, (int)(s.charAt(i+1))-96);
                ch=(char)(k+96);
                ns+=ch;
            }
            i++;
        }
        return ns;
    }
    int sumChar(int n1, int n2)
    {
        if(n1+n2<=26)
          return n1+n2;
        else
          return Math.abs(n1-n2)+1;
    }
    public static void main(String args[])
    {
        NewWord obj=new NewWord();
        obj.accept();
        obj.displayNew();
    }
}