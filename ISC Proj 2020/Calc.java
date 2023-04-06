import java.util.Scanner;
class Calc
{
	private String inp;
	//private String[] digit = {"ZERO", "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE"};

	public Calc()
	{
		inp = "";
	}

	void accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Input: ");
		inp = sc.nextLine();
		sc.close();
	}

	int wordToNum(String num)
	{
		String[] digit = {"ZERO", "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE"};
		for (int i = 0; i < 10; i++)
		{
			//System.out.println(i + " " + digit[i] + " " + num);
			if (digit[i].equals(num))
				return i;
		}
		System.out.println("Invalid Number");
		System.exit(0);
		return -1;
	}

	int operation(String op, int n1, int n2)
	{
		switch(op)
		{
			case "PLUS":
				return n1 + n2;
			case "MINUS":
				return n1 - n2;
			case "TIMES":
				return n1 * n2;
			case "DIVIDED-BY":
				return n1 / n2;
			default:
			{
				System.out.println("Invalid Operator");
				System.exit(0);
			}
		}
		return -999999;
	}

	void getResult()
	{
		String[] exp = inp.split(" ");
		int n1 = wordToNum(exp[0]);
		int n2 = wordToNum(exp[2]);
		System.out.println(operation(exp[1].trim(), n1, n2));
	}

	public static void main()
	{
		Calc wc=new Calc();
		wc.accept();
		wc.getResult();
	}

}
