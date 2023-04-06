import java.util.*;
class EncryptMe
{
    String s, estr;
    EncryptMe()
    {
        estr=s="";
    }
    void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence:");
        s=sc.nextLine().trim()+ " ";
    }
    void encrypt()
    {
        String w,eW;
        eW=w="";
        char ch;
        int wlen;
        for(int i=0;i<s.length();i++)
        {
            w+=s.charAt(i);
            if(s.charAt(i)==' ')
            {
                w=w.trim();
                wlen=w.length();
                for(int j=0;j<wlen;j++)
                {
                    ch=w.charAt(j);
                    if(Character.isLowerCase(ch))
                    {
                        if(ch+wlen>122)
                            ch=(char)(96+(ch+wlen-122));
                        else
                            ch+=wlen;
                    }
                    else
                    {
                        if(ch+wlen>90)
                            ch=(char)(64+(ch+wlen-90));
                        else
                            ch+=wlen;
                    }
                    eW+=ch;
                }
                estr=estr+eW+" ";
                wlen=0;
                w=eW="";
            }
        }
    }
    void display()
    {
        estr=estr.trim();
        System.out.println("Original sentence= "+ s);
        System.out.println("Encrypted sentence= "+ estr);
    }
    public static void main(String args[])
    {
        EncryptMe obj=new EncryptMe();
        obj.accept();
        obj.encrypt();
        obj.display();
    }
}