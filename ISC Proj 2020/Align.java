import java.util.Scanner;
class Align
{

    public void display(String txt, int width)
    {
        // SPLIT WORDS
        String[] words = txt.split(" ");
        int initial_idx = 0;
        int final_idx = 0;

        while (final_idx < words.length)
        {
            System.out.println();

            // FIND WORDS IN 1 LINE
            int linelength = 0;
            while (linelength - 1 <= width)
            {
                if (final_idx >= words.length)
                    break;
                linelength += words[final_idx++].length(); // Length of words
                linelength++; // Mandatory space after a word
            }
            if (linelength > width)
                final_idx--;

            // COUNT SPACES REQUIRED
            int total_letters = 0;
            int total_spaces = 0;
            int even_spaces = 0;

            for(int i = initial_idx; i < final_idx; i++)
                total_letters += words[i].length();

            total_spaces = width - total_letters;

			int space_blocks = final_idx - initial_idx - 1;
			if (space_blocks <= 0)
				space_blocks = 1;

            even_spaces = total_spaces / space_blocks;

            //PRINT LINE
            for (int i = initial_idx; i < final_idx; i++)
            {
                System.out.print(words[i]);
                if (total_spaces % space_blocks != 0)
                {
                    for (int j = 0; j <= even_spaces; j++)
                        System.out.print(" ");
                    total_spaces -= 1;
                }
                else
                {
                    for (int j = 0; j < even_spaces; j++)
                        System.out.print(" ");
                }
            }

            // FOR NEXT ITERATION
            initial_idx = final_idx;
        }

    }

    public static void main(String[] args)
	{
        Align a2=new Align();
        String inp = "A great discovery solves a great problem but there is a grain of discovery in the solution of any problem";
        Scanner sc=new Scanner(System.in);
        System.out.print("\n Width? ");
        a2.display(inp, sc.nextInt());
    }
}
