import java.io.*;
 public class Buffer
{
    public static void main (String args[]) throws IOException
    {
        System.out.print('\u000C');
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        System.out.println("Integer:");
        int n = Integer.parseInt(in.readLine());
        System.out.println("long:");
        long m = Long.parseLong(in.readLine());
        System.out.println("Float:");
        float o = Float.parseFloat(in.readLine());
        System.out.println("Double:");
        double p = Double.parseDouble(in.readLine());
    }
}    