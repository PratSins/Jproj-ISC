import java.util.*;
public class CaesarCipher { 
    String s, ns;
    CaesarCipher(){   s=ns="";  }
    public void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        s=sc.nextLine();
        if( s.length() <= 2 || s.length() >= 101 )
        {
            System.out.println("INVALID ENTRY");
            System.exit(0);
        }
    }
    public void getCipher(){
        char c;
        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            if(c >= 'a' && c <= 'm')
               c += 13;
            else if(c >= 'A' && c <= 'M') 
               c += 13;
            else if(c >= 'n' && c <= 'z') 
               c -= 13;
            else if(c >= 'N' && c <= 'Z') 
               c -= 13;
            ns=ns+c;
        }
    }
    public void display()
    {
        System.out.println("Output is   " +ns);
    }
    public static void main(String[] args) {
        CaesarCipher ob=new CaesarCipher();
        ob.accept();
        ob.getCipher();
        ob.display();
    }
}