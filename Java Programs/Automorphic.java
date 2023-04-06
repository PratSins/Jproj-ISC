import java.io.*;
class Automorphic
{
  public static void main(String args[]) throws IOException
  {
    System.out.print('\u000c');
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Enter a Number : "); // Inputting the number
    int n = Integer.parseInt(br.readLine());
    int sq = n*n; // Finding the square
 
    String num = Integer.toString(n); // Converting the number to String
    String square = Integer.toString(sq); // Converting the square to String
 
    if(square.endsWith(num)) // If the square ends with the number then it is Automorphic
        System.out.print(n+" is an Automorphic Number.");
    else
        System.out.print(n+" is not an Automorphic Number.");
    }
}