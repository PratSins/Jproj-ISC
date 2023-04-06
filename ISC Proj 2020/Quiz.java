import java.io.*;
class Quiz{
    public static void main(String args[])throws IOException
    {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);
        System.out.print("Number of participants: ");
        int n = Integer.parseInt(br.readLine());
        int highest = 0;
        if(n < 4 || n > 10){
            System.out.println("INPUT SIZE OUT OF RANGE.");
            return;
        }
        
        char q[][] = new char[n][5];
        char a[] = new char[5];
        int score[] = new int[n];
        
        System.out.println("Key to the questions:");
        for(int i = 0; i < a.length; i++)
            a[i] = br.readLine().charAt(0);
            
        System.out.println("Answers by participants:");
        for(int i = 0; i < n; i++){
            System.out.println("Participant " + (i + 1));
            for(int j = 0; j < 5; j++){
                q[i][j] = br.readLine().charAt(0);
                if(q[i][j] == a[j])
                    score[i]++;
            }
            if(highest < score[i])
                highest = score[i];
        }
        
        for(int i = 0; i < n; i++)
            System.out.println("Participant " + (i + 1) + " = " + score[i]);
            
        System.out.println("Highest score(s):");
        for(int i = 0; i < n; i++)
        {
            if(score[i] == highest)
                System.out.println("Participant " + (i + 1));
        }
    }
}