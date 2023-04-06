import java.util.*;
class BinSearch
{
    String words[];
    BinSearch()
    {
        words=new String[10];
    }
    void acceptWords()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any 10 words:");
        for(int i=0;i<10;i++)
           words[i]=sc.next();
    }
    void BubSort()
    {
        int i;
        boolean flag;
        for(i=0;i<10;i++)
        {
            flag=false;
            for( int j=0;j<10-i-1;j++)
            {
                if(words[j].compareToIgnoreCase(words[j+1])>0)//Ascending order
                {
                    flag=true;
                    String t=words[j];
                    words[j]=words[j+1];
                    words[j+1]=t;
                }
            }
            if(!flag)
               break;
        }
    }
    boolean search(String sn)
    {
        int lb=0,ub=9,mid=0, pos=0;
        boolean flag=false;
        while(lb<=ub)
        {
            mid=(lb+ub)/2;
            if(words[mid].compareToIgnoreCase(sn)>0)
                ub=mid-1;
            else if(words[mid].compareToIgnoreCase(sn)<0)
                lb=mid+1;    
            else if(words[mid].equals(sn))
             {
                 flag=true;
                 pos=mid;
                 break;
             }
        }
        if(!flag)
           System.out.println("your searched word is not found");
        else
           System.out.println("Your searched word is found at "+(pos+1));
        return flag;
    }
    public static void main(String args[])
    {
        BinSearch obj=new BinSearch();
        obj.acceptWords();
        obj.BubSort();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any string:");
        String word=sc.next();
        boolean k=obj.search(word);
    }
}