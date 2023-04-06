import java.io.*;
class movieMagic
    {
     int year;
     String title;
     float rating;

movieMagic() // default constructor
    {
     year = 0;
     rating = 0.0f; // notice the 'f'
     title = "";
    }

void accept() throws IOException
    {
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     System.out.print("Enter the title of the movie : ");
     title = br.readLine();
     System.out.print("Enter the year of its release : ");
     year = Integer.parseInt(br.readLine());
     System.out.print("Enter the movie rating : ");
     rating = Float.parseFloat(br.readLine());
    }

void display()
    {
     System.out.println("The title of the movie is : "+title);
     if( rating >= 0.0 && rating <= 2.0 ) {
	  System.out.println("The movie was a Flop");
     }  else if( rating >= 2.1 && rating <= 3.4 ) {
	  System.out.println("The movie was a Semi-hit");
     }  else if( rating >= 3.5 && rating <= 4.5 ) {
	  System.out.println("The movie was a Hit");
     }  else if( rating >= 4.6 && rating <= 5.0 )  {
	  System.out.println("The movie was a Super Hit");
     }  else  {
	  System.out.println("Enter a valid movie rating in between 0.0 and 5.0");
    }
    }

public static void main(String args[]) throws IOException
    {
     movieMagic ob = new movieMagic(); // creating object of the class movieMagic
     ob.accept();
     ob.display();
    }
    }
