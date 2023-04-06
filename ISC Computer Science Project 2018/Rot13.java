import java.util.*;
public class Rot13 { 
    String s, ns;
    Rot13(){   s=ns="";  }
    public void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        s=sc.nextLine();
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
        System.out.println("Ouput is   " +ns);
        }
    public static void main(String[] args) {
        Rot13 ob=new Rot13();
        ob.accept();
        ob.getCipher();
        ob.display();
    }

}