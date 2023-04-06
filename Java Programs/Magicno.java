import java.util.*;
class Magicno
{
    int magic(int n)
    {
        if(n/10==0)
         return n;
        else
         return (n%10)+(n/10);   
         // recursive function that gives last digit for every recursion and adds the returned number to previous value.
    }
    public static void main(String args[])throws Exception
    {
        System.out.print('\u000C');    
        int i,j;
        Magicno obj=new Magicno();
        //creating an object for the class to access the function magic.
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number :");
        i=sc.nextInt();  
        // Accept a number from user to check if it is a magic number or not
        while((j=obj.magic(i))/10!=0)       
        //   You have to check the sum of all digits until a single digit is achieved i.e. sum=1,2,3,..9
        {
            i=j;				
            // If sum of digits= 19 it then again goes to 1+9 =10 and again 1+0= '1' a single digit to check 1 or not
        }
        if ( j==1)        
        // check if the single digit is 1 then a magic number else not
         System.out.println("It is a magic number ");
        else
         System.out.println("Not a magic number");
    }
}