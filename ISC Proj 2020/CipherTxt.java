import java.util.*;
public class CipherTxt
{
    public String code;
    private String key;
    CipherTxt()
    {
        accept();
    }
    private void accept()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the ciphertext :");
        code = sc.nextLine().toUpperCase();
        System.out.println("Enter the key :");
        key = sc.next().toUpperCase();
        if(key.length() != 4)
        {
            System.out.println("INVALID INPUT");
            System.exit(0);
        }
    }
    public void decode()
    {
        String ns = "";
        int k = 0 , d;
        char ch;
        for(int i = 0 ; i < code.length() ; i++)
        {
            ch = code.charAt(i);
            if(Character.isLetter(ch))
            {
                d = (ch - 64) + key.charAt(k%4) ;
                d = (d > 90) ? (d-26) : d;
                ch = (char)d;
                k++;
            }
            ns += ch;
        }
        System.out.println("Plaintext:  " + ns);
    }
    public static void main(String args[])
    {
        CipherTxt obj = new CipherTxt();
        obj.decode();
    }
}