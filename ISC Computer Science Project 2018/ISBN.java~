import java.util.*;
class ISBN
{
    String number;
    ISBN()
    {
        number="";
    }
    public void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a 10-digit number:");
        number=sc.nextLine();
    }
    private boolean isValid1(String str)
    {
        if(str.length()!=10)
           return false;
        else
        {
            char ch=str.charAt(str.length()-1);
            if(!(Character.isDigit(ch) || ch=='X'))
               return false;
            for(int i=0;i<str.length()-1;i++)
            {
                if(!Character.isDigit(str.charAt(i)))
                  return false;
            }
            return true;
        }
    }
    private boolean isValid2(String str)
    {
        int s=0, i;
        for(i=0;i<str.length()-1;i++)
        {
            s=s+(Integer.parseInt(""+str.charAt(i))*(10-i));
        }
        if(Character.isDigit(str.charAt(i)))
          s=s+Integer.parseInt(""+str.charAt(i));
        else if(str.charAt(i)=='X')
          s+=10;
        if(s%11==0)
         return true;
        else 
         return false;
    }
    public void display()
    {
        if(isValid1(number) && isValid2(number) )
           System.out.println("This is Valid ISBN");
        else
           System.out.println("This is not a Valid ISBN");
    }
    public static void main(String args[])
    {
        ISBN obj= new ISBN();
        obj.accept();
        obj.display();
    }
}