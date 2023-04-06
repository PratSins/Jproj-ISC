import java.util.Scanner;
class NumToWord
{
    private int n;
    void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number: ");
        n = sc.nextInt();
        if ((n > 999999999) || (n < -999999999))
        {
           System.out.println("Out of Range");
           System.exit(0);
        }
        sc.close();
    }

    String toWord()
    {
        String numw = "";
        if (n == 0)
          return "ZERO";
        if (n < 0)
        {
           numw += "MINUS ";
           n *= -1;
        }
        if (n >= 10000000)
        {
           numw += (twoDigits(n/10000000) + "CRORE ");
           n = n % 10000000;
        }
        if (n >= 100000)
        {
           numw += (twoDigits(n/100000) + "LAKH ");
           n = n % 100000;
        }
        if (n >= 1000)
        {
           numw += (twoDigits(n/1000) + "THOUSAND ");
           n = n % 1000;
        }
        if (n >= 100)
        {
           numw += (ones(n / 100) + " HUNDRED ");
           n = n % 100;
        }
        numw += twoDigits(n);
        return numw;
    }

    String twoDigits(int num)
    {
        String numw = "";
        if (num >= 20)
        {
           numw += (tens(num / 10) + ones(num % 10));
           return numw;
        }
        if (num >= 10)
        {
           numw += onety(num);
           return numw;
        }
        numw += ones(num);
        return numw;
    }

    String ones(int num)
    {
        String[] ones = {" ", "ONE ", "TWO ", "THREE ", "FOUR ", "FIVE ", "SIX ", "SEVEN ", "EIGHT ", "NINE "};
        return ones[num];
    }

    String tens(int num)
    {
        String[] tens = {"", "", "TWENTY ", "THIRTY ", "FORTY ", "FIFTY ", "SIXTY ", "SEVENTY ", "EIGHTY ", "NINETY "};
        return tens[num];
    }

    String onety(int num)
    {
        switch(num)
        {
           case 10:
              return "TEN ";
           case 11:
             return "ELEVEN ";
           case 12:
             return "TWELVE ";
           case 13:
             return "THIRTEEN ";
           case 14:
             return "FOURTEEN ";
           case 15:
             return "FIFTEEN ";
           case 16:
             return "SIXTEEN ";
           case 17:
             return "SEVENTEEN ";
           case 18:
             return "EIGHTEEN ";
           case 19:
             return "NINETEEN ";
           default:
              return "";
        }
    }

    public static void main(String[] args)
    {
        NumToWord n2w=new NumToWord();
        n2w.accept();
        System.out.println(n2w.toWord());
    }

}
