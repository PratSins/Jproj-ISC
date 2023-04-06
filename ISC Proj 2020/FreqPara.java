import java.util.*;
public class FreqPara
{ 
    String para;
    FreqPara()
    {
        System.out.println();
        accept();
    }
    private int num()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of sentences :");
        int n = sc.nextInt();
        if( n<1 || n>3 )
        {
            System.out.println("INVALID ENTRY");
            System.exit(0);
        }
        return n;
    }
    private void accept()
    {
        Scanner sc = new Scanner (System.in);
        int n = num();
        System.out.println("Enter a paragraph:");
        para = sc.nextLine().toUpperCase();
        int c = 0;
        for(int i=0;i<para.length();i++)
        {
            if("?.".indexOf(para.charAt(i))!=(-1))
                  c++;
        }
        if( c!=n )
        {
            System.out.println("INVALID ENTRY");
            System.exit(0);
        }
    }
    private int countUnique(String w[])
    {
        int c=0; boolean flag = false;
        for(int i=0;i<w.length;i++)
        {
            flag=false;
            for(int x=0; x<i ; x++)
            {
                if(w[i].equals(w[x]))
                {
                    flag = true;
                    break;
                }
            }
            if(!flag)
              c++;
        }
        return c;
    }
    public void displayFreq()
    {
        // getting words.
        StringTokenizer st = new StringTokenizer(para,"!@#'\",.? ");
        int cnt = st.countTokens();
        System.out.println("No. of words in the paragraph = "+cnt);
        String w[] = new String[cnt];
        for(int i = 0 ; i < cnt ; i++ )
          w[i] = st.nextToken();
        int c = 0;
        // getting unique words and their count in the sentence.
        cnt = countUnique(w);
        String words[] = new String[cnt];
        int count[] = new int[cnt];
        cnt = 0;
        for( int i=0 ; i<w.length ; i++ )
        {
            boolean flag = false;
            c = 0;
            for( int x = 0 ; x < i ; x++ )
            {
                if( w[i].equals(w[x]) )
                {
                    flag = true;
                    break;
                }
            }
            if( flag )
              continue;
            for( int j = i ; j <w.length ; j++ )
            {
                if( w[i].equals(w[j]) )
                {
                    c++;
                }
            }
            words[cnt] = w[i];
            count[cnt] = c;
            cnt++;
        }
        // sorting them in acsending order of their occurence
        for( int i = 0 ; i < cnt ; i++ )
        {
            boolean flag = false;
            for( int j= 0 ; j < cnt-1-i ; j++ )
            {
                if( count[j] > count[j+1] )
                {
                    flag = true;
                    String t = words[j];
                    words[j] = words[j+1];
                    words[j+1] = t;
                    int temp = count[j];
                    count[j] = count[j+1];
                    count[j+1] = temp;
                }
            }
            if( !flag )
               break;
        }
        //Displaying them
        System.out.println("WORDS \t FREQUENCY");
        for( int i = 0 ; i < cnt ; i++ )
        {
            System.out.println(words[i]+" -> "+count[i]);
        }
    }
    public static void main(String args[])
    {
        FreqPara obj = new FreqPara();
        obj.displayFreq();
    }
}