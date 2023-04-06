import java.io.*;
public class Hangman
{
    String word,clue;
    int option;
    PrintWriter p = new PrintWriter(System.out,true);
    public void clearScreen()
    {
      System.out.print('\u000C');
    }
    public void Hang1()
    {
        p.println("      _______   ");
        p.println("     |       |");
        p.println("     |");
        p.println("     |");
        p.println("     |");
        p.println("     |");
        p.println("     |");
        p.println("_____|_____ ");
    }
    public void Hang2()
    {
        p.println("      _______ ");
        p.println("     |       |");
        p.println("     |      ( )");
        p.println("     |       ");
        p.println("     |");
        p.println("     |");
        p.println("     |");
        p.println("_____|_____ ");
    }
    public void Hang3()
    {
        p.println("      _______ ");
        p.println("     |       |");
        p.println("     |      ( )");
        p.println("     |       |");
        p.println("     |       |");
        p.println("     |       |");
        p.println("     |");
        p.println("_____|_____ ");
    }
    public void Hang4()
    {
        p.println("      _______ ");
        p.println("     |       |");
        p.println("     |      ( )");
        p.println("     |       |");
        p.println("     |       |");
        p.println("     |       |");
        p.println("     |      /");
        p.println("_____|_____ ");
    }
    public void Hang5()
    {
        p.println("      _______ ");
        p.println("     |       |");
        p.println("     |      ( )");
        p.println("     |       |");
        p.println("     |       |");
        p.println("     |       |");
        p.println("     |      / \\");
        p.println("_____|_____ ");
    }
    public void Hang6()
    {
        p.println("      _______ ");
        p.println("     |       |");
        p.println("     |      ( )");
        p.println("     |       |");
        p.println("     |      /|");
        p.println("     |       |");
        p.println("     |      / \\");
        p.println("_____|_____ ");
    }
    public void Hang7()
    {
        p.println("      _______ ");
        p.println("     |       |");
        p.println("     |      ( )");
        p.println("     |       |");
        p.println("     |      /|\\");
        p.println("     |       |");
        p.println("     |      / \\");
        p.println("_____|_____ ");
    }
    public String[] Sports()
    {
        option = (int)(Math.random()*10);
        switch(option)
        {
            case 0:
            {
                clue = "He is an Argentine footballer who plays for La Liga club FC Barcelona and is the captain of the Argentina national team, playing mainly as a forward.";
                word = "L I O N E L | M E S S I";
            }
            break;
            case 1:
            {
                clue = "First person to score 200 in ODIs";
                word = "S A C H I N | T E N D U L K A R";
            }
            break;
            case 2:
            {
                clue = "It is a South Asian team sport.";
                word = "K A B A D D I";
            }
            break;
            case 3:
            {
                clue = "It is a two-player board game";
                word = "C H E S S";
            }
            break;
            case 4:
            {
                clue = "It is a team sport in which two teams of six players are separated by a net.";
                word = "V O L L E Y B A L L";
            }
            break;
            case 5:
            {
                clue = "Known as 'The wall'";
                word = "R A H U L | D R A V I D";
            }
            break;
            case 6:
            {
                clue = "World Table Tennis Champion";
                word = "Z H A N G | J I K E";
            }
            break;
            case 7:
            {
                clue = "A famous sport";
                word = "F O O T B A L L";
            }
            break;
            case 8:
            {
                clue = "Played on a hard board divided by a net";
                word = "T A B L E | T E N N I S";
            }
            break;
            case 9:
            {
                clue = "Grandmaster of chess";
                word = "V I S H W A N A T A N | A N A N D";
            }
            break;
        }
        return new String[] {word,clue};
    }
    public String[] Movies()
    {
        option = (int)(Math.random()*10);
        switch(option)
        {
            case 0:
            {
                clue = "Movie in which Daniel Radcliffe has acted";
                word = "T H E | W O M A N | I N | B L A C K";
            }
            break;
            case 1:
            {
                clue = "It is a 2012 Indian satirical comedy film that satires organized religion directed by Umesh Shukla";
                word = "O H | M Y | G O D";
            }
            break;
            case 2:
            {
                clue = "Schwarzenegger plays the role of a cyborg assassin sent back in time from the year 2029 to 1984 to kill Sarah Connor";
                word = "T H E | T E R M I N A T O R";
            }
            break;
            case 3:
            {
                clue = "It is a movie about 2 kids who become sspies";
                word = "S P Y | K I D S";
            }
            break;
            case 4:
            {
                clue = "This film stars Jason Statham as Frank Martin, a driver for hire – a mercenary transporter who will deliver anything, anywhere – no questions asked – for the right price";
                word = "T H E | T R A N S P O R T E R";
            }
            break;
            case 5:
            {
                clue = "This film tells the story of Jamal Malik, a young man from the Juhu slums of Mumbai who appears on the Indian version of Who Wants to Be a Millionaire?";
                word = "S L U M D O G | M I L L I O N A R E";
            }
            break;
            case 6:
            {
                clue = "Set during the Sierra Leone Civil War in 1996–2001, the film shows a country torn apart by the struggle between government soldiers and rebel forces";
                word = "B L O O D | D I A M O N D";
            }
            break;
            case 7:
            {
                clue = "This film stars Macaulay Culkin as Kevin McCallister, an eight-year-old boy, who is mistakenly left behind when his family flies to Paris for their Christmas vacation";
                word = "H O M E | A L O N E";
            }
            break;
            case 8:
            {
                clue = "This film follows Dominic Toretto, Brian O'Conner and Mia Toretto as they plan a heist to steal $100 million from corrupt businessman Hernan Reyes";
                word = "F A S T | F I V E";
            }
            break;
            case 9:
            {
                clue = "This film consists of many superheroes";
                word = "T H E | A V E N G E R S";
            }
            break;
        }
        return new String[] {word,clue};        
    }
    public String[] Computers()
    {
        option = (int)(Math.random()*10);
        switch(option)
        {
            case 0:
            {
                clue = "The brain of the computer";
                word = "C E N T R A L | P R O C E S S I N G | U N I T";
            }
            break;
            case 1:
            {
                clue = "Stores a real world 2d object in the form of a digital image";
                word = "S C A N N E R";
            }
            break;
            case 2:
            {
                clue = "A screen that displays output from a computer";
                word = "M O N I T O R";
            }
            break;
            case 3:
            {
                clue = "It is a family of computer networking technologies for LANs";
                word = "E T H E R N E T";
            }
            break;
            case 4:
            {
                clue = "It is a computer network that uses Internet Protocol technology to share information, operational systems, or computing services within an organization";
                word = "I N T R A N E T";
            }
            break;
            case 5:
            {
                clue = "It is an IDE for Java";
                word = "B L U E J";
            }
            break;
            case 6:
            {
                clue = "It is an application developed by Microsoft that is used for playing audio, video and viewing images";
                word = "W I N D O W S | M E D I A | P L A Y E R";
            }
            break;
            case 7:
            {
                clue = "It is a software application that provides comprehensive facilities to computer programmers for software development";
                word = "I N T E G R A T E D | D E V E L O P M E N T | E N V I R O N M E N T";
            }
            break;
            case 8:
            {
                clue = "It is a temporary form of computer data storage";
                word = "R A N D O M | A C C E S S | M E M O R Y";
            }
            break;
            case 9:
            {
                clue = "It is a digital circuit that performs arithmetic and logical operations.";
                word = "A R I T H M E T I C | A N D | L O G I C | U N I T";
            }
            break;
        }
        return new String[] {word,clue};        
    }
    public String[] Food()
    {
        option = (int)(Math.random()*10);
        switch(option)
        {
            case 0:
            {
                clue = "It is an Indian food cited as top ten tasty foods of the world";
                word = "M A S A L A | D O S A";
            }
            break;
            case 1:
            {
                clue = "A fruit which has the same name as its colour";
                word = "O R A N G E";
            }
            break;
            case 2:
            {
                clue = "It is an oven-baked, flat, round bread typically topped with a tomato sauce, cheese and various toppings";
                word = "P I Z Z A";
            }
            break;
            case 3:
            {
                clue = "It is a type of staple food made from some type of unleavened dough which is rolled flat and cut into long thin strips";
                word = "N O O D L E S";
            }
            break;
            case 4:
            {
                clue = "Sorry. No clue for this one";
                word = "P I N E A P P L E";
            }
            break;
            case 5:
            {
                clue = "A bun between which a patty is kept";
                word = "B U R G E R";
            }
            break;
            case 6:
            {
                clue = "It is a chat";
                word = "P A N I | P U R I";
            }
            break;
            case 7:
            {
                clue = "Is perfect for completing the idiom - As cool as a ______________";
                word = "C U C U M B E R";
            }
            break;
            case 8:
            {
                clue = "Consists of two or more slices of bread with fillings between them";
                word = "S A N D W I C H";
            }
            break;
            case 9:
            {
                clue = "Sorry. No clue for this one";
                word = "P A S T A";
            }
            break;
        }
        return new String[] {word,clue};        
    }
    public String[] Countries()
    {
        option = (int)(Math.random()*10);
        switch(option)
        {
            case 0:
            {
                clue = "Means 'Rich Coast' in Spanish";
                word = "C O S T A | R I C A";
            }
            break;
            case 1:
            {
                clue = "Sorry. No clue for this one";
                word = "I N D I A";
            }
            break;
            case 2:
            {
                clue = "T&T";
                word = "T R I N I D A D | A N D | T O B A G O";
            }
            break;
            case 3:
            {
                clue = "Consists of nearly one thousand islands";
                word = "S O L O M O N | I S L A N D S";
            }
            break;
            case 4:
            {
                clue = "It's capital is Riyadh";
                word = "S A U D I | A R A B I A";
            }
            break;
            case 5:
            {
                clue = "Lucky guy : You're getting a free letter : P";
                word = "T H E | P H I L I P P I N E S";
            }
            break;
            case 6:
            {
                clue = "The fastest man on Earth is from this country";
                word = "J A M A I C A";
            }
            break;
            case 7:
            {
                clue = "3 movies have been filmed using this country's name";
                word = "M A D A G A S C A R";
            }
            break;
            case 8:
            {
                clue = "Greatest world power";
                word = "U N I T E D | S T A T E S | O F | A M E R I C A";
            }
            break;
            case 9:
            {
                clue = "Lucky guy : You're getting a free letter : Y";
                word = "M A L A Y S I A";
            }
            break;
        }
        return new String[] {word,clue};
    }
    public static void main(String args[])throws IOException
    {
        Hangman obj = new Hangman();
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        PrintWriter p = new PrintWriter(System.out,true);
        p.println("Let's play HANGMAN!                        -By Pratyush");
        p.println();
        p.println("Enter your choice according to the following options.\nNOTE: Words are related to the topics given below.\n\n1. Sports\n2. Movies\n3. Computer\n4. Food\n5. Countries");
        p.println();
        int choice = Integer.parseInt(br.readLine());
        obj.clearScreen();
        String bothwordandclue[] = new String[2];
        if(choice == 1)
        bothwordandclue = obj.Sports();
        else if(choice == 2)
        bothwordandclue = obj.Movies();
        else if(choice == 3)
        bothwordandclue = obj.Computers();
        else if(choice == 4)
        bothwordandclue = obj.Food();
        else if(choice == 5)
        bothwordandclue = obj.Countries();
        else
        p.println("Wrong choice");
        int counter = 6;
        String guessword = bothwordandclue[0];
        String wordclue = bothwordandclue[1];
        int lengthofword = (int)(Math.round(((double)guessword.length()/2)));
        int checkguess = 0;
        String a;
        String guesses[] = new String[50];
        StringBuffer guessit = new StringBuffer();
        for (int i = 0;i<lengthofword;i++)
        guessit = guessit.append("_ ");
        guessit.delete((2 * lengthofword)-1,(2 * lengthofword));
        int index = guessword.indexOf("|");
        while(index >= 0)
        {
            guessit.setCharAt(index, '|');
            index = guessword.indexOf("|", index+1);// Start searching for next "|" after this index
        }
        p.println(guessit + "\t\t\t\t\t\t\t\t\t The letters you have entered so far");
        do
        {
            p.println();
            if(counter == 6)
            obj.Hang1();
            else if(counter == 5)
            obj.Hang2();
            else if(counter == 4)
            obj.Hang3();
            else if(counter == 3)
            obj.Hang4();
            else if(counter == 2)
            obj.Hang5();
            else if(counter == 1)
            obj.Hang6();
            p.println();
            p.println("Enter your guess letter");
            String guessletter2 = br.readLine();
            String guessletter = guessletter2.toUpperCase();
            obj.clearScreen();
            for(int i = 0;i<lengthofword;i++)
            {
                if(guessletter.charAt(0) == guessword.charAt(2*i))
                {
                    guessit.setCharAt(2*i,guessletter.charAt(0));
                    checkguess=1;
                }                
            }
            if(checkguess == 1)
            {
                p.println("Correct Guess. You have " + counter + " incorrect guesses left\t\t\t\t\t\t\t The letters you have entered so far");
                p.println(guessit);
            }
            else
            {
                counter--;
                if(counter == 0)
                {
                    p.println("Wrong guess. You hanged the man :(");
                    p.println(guessit);
                    obj.Hang7();
                }
                else
                {
                    p.println("Wrong guess. You have " + counter + " incorrect guesses left\t\t\t\t\t\t\t\t\t The letters you have entered so far");
                    p.println(guessit);
                }
            }
            checkguess = 0;
            if(counter == 0)
            p.println("\nSorry you lost the game\n\nThe correct word is " + guessword);
            a = guessit.toString();
            if(a.equals(guessword))
            {
                p.println("You guessed the word!!!!!");
                counter=0;
            }        
        }while(counter>0);
    }
}

