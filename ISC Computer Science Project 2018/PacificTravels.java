import java.util.*;// to get access to Scanner class to get inputs
class PacificTravels
{
    int dist;
    public PacificTravels()
    {
        dist=0;
    }
    public void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the distance travelled (in km):");
        dist=Math.abs(sc.nextInt());
        /* Math.abs() is used with the input because if the user enters 
         * a negative value then it will automatically become postive*/
    }
    public void display()
    {
        float netFare=getFare();// getting the net fare
          // Displaying the details of the traveller
        System.out.println("Distance Travelled by the traveller = "+dist+"km");
        System.out.println("Amount to be paid by the him = Rs."+netFare);
    }
    public float getFare()
    {
        float nfare=0.00f;
        if(dist<=20)
          nfare=dist*15; // upto 20km     Rs.15 per km
        else if(dist<=50)
          nfare=20*15 + (dist-20)*20;  // next 30km     Rs.20 per km
        else if(dist<=100)
          nfare=20*15 + 30*20 + (dist-50)*25;   // next 50km     Rs.25 per km
        else if(dist<=180)
          nfare=20*15 + 30*20 + 50*25 + (dist-100)*35;// next 80km     Rs.35 per km
        else
          nfare=20*15 + 30*20 + 50*25 + 80*35 + (dist-180)*45;  // above 180km     Rs.45 per km
        nfare+=(nfare*14/100) ;     /* addition of GST to the fare*/
        return nfare;
    }
    public static void main(String args[])
    {
        PacificTravels obj=new PacificTravels();
        obj.accept();
        obj.display();
    }
}