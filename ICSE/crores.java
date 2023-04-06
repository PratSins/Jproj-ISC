import java.io.*;
public class crores
{
    static InputStreamReader irs=new InputStreamReader(System.in);
    static BufferedReader stdin=new BufferedReader(irs);
    public static void main(String []args) throws IOException
    {
        int ans;String contd;int amt=0;int amt1=0;String c="";String s="n";String s1="y";int d;String c1;int d1=3;
        String e="YOUR LIFELINE ARE (1)AUDIANCE (2) 50/50";
        System.out.println("WELCOME TO KAUN BANEGA CROREPATI!!!");
        for(int i=1;i<=10;i++)
        {
            if(i==1)
        {
        System.out.println("YOUR FIRST QUESTION");
        System.out.println("     NAME THE COUNTRY HAVING LARGEST POPULATION");
        System.out.println("YOUR OPTIONS ARE-->");
        System.out.println("     (1)RUSSIA      (2)INDIA");
        System.out.println("     (3)CHINA       (4)AMERICA");
        System.out.println();
        System.out.println("do you want to use lifelines [Y/N])");
        c1=stdin.readLine();
        int z=c1.compareTo(s1);
        if(z==0)
        {
        d1=d1-1;
        if(d1<=0)
        System.out.println(" SORRY YOU HAVE USED YOUR LIFELINES");
        if(d1>0)
        {
            System.out.println(e);
            d=Integer.parseInt(stdin.readLine());
            if(d==1)
            {
            System.out.println("  30% AUDIANCE SAYS (1)   10% AUDIANCE SAYS (2)");
            System.out.println("  40% AUDIANCE SAYS (3)   20% AUDIANCE SAYS (4)");
            e="YOUR LIFELINE ARE (2) 50/50";
            }
            if(d==2)
            {
                System.out.println("YOUR NEW OPTIONS ARE-->");
                System.out.println("                    (2)INDIA");
                System.out.println("     (3)CHINA               ");
                e="YOUR LIFELINE ARE (1)AUDIANCE ";
            }
        }
    }
        ans=Integer.parseInt(stdin.readLine());
        if(ans==1)
        {
        System.out.println("sorry you lost  better luck next time");
        break;
        }
        if(ans==2)
        {
        System.out.println("sorry you lost  better luck next time");
        break;
        }
        if(ans==3)
        {
        System.out.println("CONGRATULATIONS!!! YOU HAVE GOT THE CORRECT ANSWER ");
        amt=amt+(500*2);
        amt1=amt;
        System.out.println("DO YOU WISH TO PLAY FURTHER[ Yes/No ]");
        contd=stdin.readLine();
        c=contd;
        int z1=c.compareTo(s);
        if(z1==0)
        {
            System.out.println("thank you");
            break;
        }
               
        }
        if(ans==4)
        {
        System.out.println("sorry you lost  better luck next time");
        break;
        }
        }
        if(i==2)
        {
        System.out.println("YOUR SECOND QUESTION");
        System.out.println("     WORLD'S FASTEST MAN");
        System.out.println("YOUR OPTIONS ARE-->");
        System.out.println("     (1)ASAFA POWELL      (2)JUSTIN GATLIN");
        System.out.println("     (3)BRET LEE       (4)NONE OF THEM");
        System.out.println();
        System.out.println("do you want to use lifelines [Y/N])");
        c1=stdin.readLine();
        int z=c1.compareTo(s1);
        if(z==0)
        {
        d1=d1-1;
        if(d1<=0)
        System.out.println(" SORRY YOU HAVE USED YOUR LIFELINES");
        if(d1>0)
        
        {
            System.out.println(e);
            d=Integer.parseInt(stdin.readLine());
            if(d==1)
            {
            System.out.println("  60% AUDIANCE SAYS (1)   10% AUDIANCE SAYS (2)");
            System.out.println("  10% AUDIANCE SAYS (3)   20% AUDIANCE SAYS (4)");
            e="YOUR LIFELINE ARE (2) 50/50";
            }
            if(d==2)
            {
                System.out.println("YOUR NEW OPTIONS ARE-->");
                System.out.println("     (1)ASAFA POWELL      (2)JUSTIN GATLIN");
                System.out.println("                                          ");
                e="YOUR LIFELINE ARE (1)AUDIANCE ";
            }
        }
    }
        ans=Integer.parseInt(stdin.readLine());
        if(ans==2)
        {
        System.out.println("sorry you lost  better luck next time");
        amt1=0;
        break;
        }
        if(ans==3)
        {
        System.out.println("sorry you lost  better luck next time");
        amt1=0;
        break;
        }
        if(ans==1)
        {
        System.out.println("CONGRATULATIONS!!! YOU HAVE GOT THE CORRECT ANSWER ");
        amt=amt+(amt*2);
        amt1=amt;
        System.out.println("DO YOU WISH TO PLAY FURTHER[ Yes/No ]");
        contd=stdin.readLine();
        c=contd;
        int z1=c.compareTo(s);
        if(z1==0)
        {
            System.out.println("thank you");
            break;
        }
        }
        if(ans==4)
        {
        System.out.println("sorry you lost  better luck next time");
        amt1=0;
        break;
        }
        }
        if(i==3)
        {
        System.out.println("YOUR THIRD QUESTION");
        System.out.println("     WHERE IS WORLD CUP 2008 GOING TO BE HELD?");
        System.out.println("YOUR OPTIONS ARE-->");
        System.out.println("     (1)RUSSIA      (2)AUSTRALIA");
        System.out.println("     (3)WEST INDIES       (4)AFRICA");
        System.out.println();
        System.out.println("do you want to use lifelines [Y/N])");
        c1=stdin.readLine();
        int z=c1.compareTo(s1);
        if(z==0)
        {
        d1=d1-1;
        if(d1<=0)
        System.out.println(" SORRY YOU HAVE USED YOUR LIFELINES");
        if(d1>0)
        {
            System.out.println(e);
            d=Integer.parseInt(stdin.readLine());
            if(d==1)
            {
            System.out.println("  30% AUDIANCE SAYS (1)   10% AUDIANCE SAYS (2)");
            System.out.println("  40% AUDIANCE SAYS (3)   20% AUDIANCE SAYS (4)");
            e="YOUR LIFELINE ARE (2) 50/50";
            }
            if(d==2)
            {
                System.out.println("YOUR NEW OPTIONS ARE-->");
                System.out.println("      ");
                System.out.println("      (3)WEST INDIES       (4)AFRICA ");
                e="YOUR LIFELINE ARE (1)AUDIANCE ";
            }
        }
    }
        ans=Integer.parseInt(stdin.readLine());
        if(ans==1)
        {
        System.out.println("sorry you lost  better luck next time");amt1=0;
        break;
        }
        if(ans==2)
        {
        System.out.println("sorry you lost  better luck next time");amt1=0;
        break;
        }
        if(ans==3)
        {
        System.out.println("CONGRATULATIONS!!! YOU HAVE GOT THE CORRECT ANSWER ");
        amt=amt+(amt*2);
        amt1=amt;
        System.out.println("DO YOU WISH TO PLAY FURTHER[ Yes/No ]");
        contd=stdin.readLine();
        c=contd;
        int z1=c.compareTo(s);
        if(z1<=0)
        {
            System.out.println("thank you");
            break;
        }
               
        }
        if(ans==4)
        {
        System.out.println("sorry you lost  better luck next time");amt1=0;
        break;
        }
        }
        if(i==4)
        {
        System.out.println("YOUR FORTH QUESTION");
        System.out.println("     NAME THE DIRECTOR OF MOVIE MANGAL PANDEY");
        System.out.println("YOUR OPTIONS ARE-->");
        System.out.println("     (1)RAM DAS GUPTA      (2)KETAN MEHTA");
        System.out.println("     (3)BOBBY BEDI       (4)SAMEERA C");
        System.out.println();
        System.out.println("do you want to use lifelines [Y/N])");
        c1=stdin.readLine();
        int z=c1.compareTo(s1);
        if(z==0)
        {
        d1=d1-1;
        if(d1<=0)
        System.out.println(" SORRY YOU HAVE USED YOUR LIFELINES");
        if(d1>0)
        {
            System.out.println(e);
            d=Integer.parseInt(stdin.readLine());
            if(d==1)
            {
            System.out.println("  10% AUDIANCE SAYS (1)   30% AUDIANCE SAYS (2)");
            System.out.println("  30% AUDIANCE SAYS (3)   30% AUDIANCE SAYS (4)");
            e="YOUR LIFELINE ARE (2) 50/50";
            }
            if(d==2)
            {
                System.out.println("YOUR NEW OPTIONS ARE-->");
                System.out.println("                    (2)KETAN MEHTA");
                System.out.println("     (3)BOBBY BEDI               ");
                e="YOUR LIFELINE ARE (1)AUDIANCE ";
            }
        }
    }
        ans=Integer.parseInt(stdin.readLine());
        if(ans==1)
        {
        System.out.println("sorry you lost  better luck next time");amt1=0;
        break;
        }
        if(ans==3)
        {
        System.out.println("sorry you lost  better luck next time");amt1=0;
        break;
        }
        if(ans==2)
        {
        System.out.println("CONGRATULATIONS!!! YOU HAVE GOT THE CORRECT ANSWER ");
        amt=amt+(amt*2);
        amt1=amt;
        System.out.println("DO YOU WISH TO PLAY FURTHER[ Yes/No ]");
        contd=stdin.readLine();
        c=contd;
        int z1=c.compareTo(s);
        if(z1==0)
        {
            System.out.println("thank you");
            break;
        }
               
        }
        if(ans==4)
        {
        System.out.println("sorry you lost  better luck next time");amt1=0;
        break;
        }
        }
        if(i==5)
        {
        System.out.println("YOUR FIFTH QUESTION");
        System.out.println("     NAME THE SECRATARY GENERAL OF U.N.O?");
        System.out.println("YOUR OPTIONS ARE-->");
        System.out.println("     (1)MS LOUISE FRECHETTE      (2)PAUL WOLFOWITZ");
        System.out.println("     (3)JACQUES DIOUF       (4)KOFI ANNAN");
        System.out.println();
        System.out.println("do you want to use lifelines [Y/N])");
        c1=stdin.readLine();
        int z=c1.compareTo(s1);
        if(z==0)
        {
        d1=d1-1;
        if(d1<=0)
        System.out.println(" SORRY YOU HAVE USED YOUR LIFELINES");
        if(d1>0)
        
        {
            System.out.println(e);
            d=Integer.parseInt(stdin.readLine());
            if(d==1)
            {
            System.out.println("  40% AUDIANCE SAYS (1)   10% AUDIANCE SAYS (2)");
            System.out.println("  10% AUDIANCE SAYS (3)   40% AUDIANCE SAYS (4)");
            e="YOUR LIFELINE ARE (2) 50/50";
            }
            if(d==2)
            {
                System.out.println("YOUR NEW OPTIONS ARE-->");
                System.out.println("     (1)MS LOUISE FRECHETTE      ");
                System.out.println("                               (4)KOFI ANNAN   ");
                e="YOUR LIFELINE ARE (1)AUDIANCE ";
            }
        }
    }
        ans=Integer.parseInt(stdin.readLine());
        if(ans==2)
        {
        System.out.println("sorry you lost  better luck next time");
        amt1=0;
        break;
        }
        if(ans==3)
        {
        System.out.println("sorry you lost  better luck next time");
        amt1=0;
        break;
        }
        if(ans==4)
        {
        System.out.println("CONGRATULATIONS!!! YOU HAVE GOT THE CORRECT ANSWER ");
        amt=amt+(amt*2);
        amt1=amt;
        System.out.println("DO YOU WISH TO PLAY FURTHER[ Yes/No ]");
        contd=stdin.readLine();
        c=contd;
        int z1=c.compareTo(s);
        if(z1==0)
        {
            System.out.println("thank you");
            break;
        }
        }
        if(ans==1)
        {
        System.out.println("sorry you lost  better luck next time");
        amt1=0;
        break;
        }
        }
         if(i==6)
        {
        System.out.println("YOUR SIXTH QUESTION");
        System.out.println("     NAME THE PLAYER TO TAKE 600 TEST WICKETS ");
        System.out.println("YOUR OPTIONS ARE-->");
        System.out.println("     (1)ANIL KUMBLE      (2)SHANE WARNE");
        System.out.println("     (3)ANDREW FLINTOFF  (4)WASIM AKRAM");
        System.out.println();
        System.out.println("do you want to use lifelines [Y/N])");
        c1=stdin.readLine();
        int z=c1.compareTo(s1);
        if(z==0)
        {
        d1=d1-1;
        if(d1<=0)
        System.out.println(" SORRY YOU HAVE USED YOUR LIFELINES");
        if(d1>0)
        
        {
            System.out.println(e);
            d=Integer.parseInt(stdin.readLine());
            if(d==1)
            {
            System.out.println(" 30% AUDIANCE SAYS (1)   40% AUDIANCE SAYS (2)");
            System.out.println("  10% AUDIANCE SAYS (3)   20% AUDIANCE SAYS (4)");
            e="YOUR LIFELINE ARE (2) 50/50";
            }
            if(d==2)
            {
                System.out.println("YOUR NEW OPTIONS ARE-->");
                System.out.println("                         (2)SHANE WARNE     ");
                System.out.println("    (3)ANDREW FLINTOFF                          ");
                e="YOUR LIFELINE ARE (1)AUDIANCE ";
            }
        }
    }
        ans=Integer.parseInt(stdin.readLine());
        if(ans==1)
        {
        System.out.println("sorry you lost  better luck next time");
        amt1=0;
        break;
        }
        if(ans==3)
        {
        System.out.println("sorry you lost  better luck next time");
        amt1=0;
        break;
        }
        if(ans==2)
        {
        System.out.println("CONGRATULATIONS!!! YOU HAVE GOT THE CORRECT ANSWER ");
        amt=amt+(amt*2);
        amt1=amt;
        System.out.println("DO YOU WISH TO PLAY FURTHER[ Yes/No ]");
        contd=stdin.readLine();
        c=contd;
        int z1=c.compareTo(s);
        if(z1==0)
        {
            System.out.println("thank you");
            break;
        }
        }
        if(ans==4)
        {
        System.out.println("sorry you lost  better luck next time");
        amt1=0;
        break;
        }
        }
        if(i==7)
        {
        System.out.println("YOUR SEVENTH QUESTION");
        System.out.println("     NAME THE PRIME MINISTER OF JAPAN? ");
        System.out.println("YOUR OPTIONS ARE-->");
        System.out.println("     (1)JUNICHIRO KOIZUMI      (2)VALADIMIR PUTIN");
        System.out.println("     (3)GEORGE BUSH            (4)TONY BLAIR");
        System.out.println();
        System.out.println("do you want to use lifelines [Y/N])");
        c1=stdin.readLine();
        int z=c1.compareTo(s1);
        if(z==0)
        {
        d1=d1-1;
        if(d1<=0)
        System.out.println(" SORRY YOU HAVE USED YOUR LIFELINES");
        if(d1>0)
        
        {
            System.out.println(e);
            d=Integer.parseInt(stdin.readLine());
            if(d==1)
            {
            System.out.println(" 40% AUDIANCE SAYS (1)   40% AUDIANCE SAYS (2)");
            System.out.println("  10% AUDIANCE SAYS (3)   10% AUDIANCE SAYS (4)");
            e="YOUR LIFELINE ARE (2) 50/50";
            }
            if(d==2)
            {
                System.out.println("YOUR NEW OPTIONS ARE-->");
                System.out.println("    (1)JUNICHIRO KOIZUMI      (2)VALADIMIR PUTIN   ");
                System.out.println("                              ");
                e="YOUR LIFELINE ARE (1)AUDIANCE ";
            }
        }
    }
        ans=Integer.parseInt(stdin.readLine());
        if(ans==2)
        {
        System.out.println("sorry you lost  better luck next time");
        amt1=0;
        break;
        }
        if(ans==3)
        {
        System.out.println("sorry you lost  better luck next time");
        amt1=0;
        break;
        }
        if(ans==1)
        {
        System.out.println("CONGRATULATIONS!!! YOU HAVE GOT THE CORRECT ANSWER ");
        amt=amt+(amt*2);
        amt1=amt;
        System.out.println("DO YOU WISH TO PLAY FURTHER[ Yes/No ]");
        contd=stdin.readLine();
        c=contd;
        int z1=c.compareTo(s);
        if(z1==0)
        {
            System.out.println("thank you");
            break;
        }
        }
        if(ans==4)
        {
        System.out.println("sorry you lost  better luck next time");
        amt1=0;
        break;
        }
        }
        if(i==8)
        {
        System.out.println("YOUR EIGTH QUESTION");
        System.out.println("     NAME THE DIRECTOR GENERAL OF UNESCO? ");
        System.out.println("YOUR OPTIONS ARE-->");
        System.out.println("     (1)KOICHIRO MATSUURA      (2)SHIGEO KATSU");
        System.out.println("     (3)JACQUES DIOUF            (4)JUAN SOMAVIA");
        System.out.println();
        System.out.println("do you want to use lifelines [Y/N])");
        c1=stdin.readLine();
        int z=c1.compareTo(s1);
        if(z==0)
        {
        d1=d1-1;
        if(d1<=0)
        System.out.println(" SORRY YOU HAVE USED YOUR LIFELINES");
        if(d1>0)
        
        {
            System.out.println(e);
            d=Integer.parseInt(stdin.readLine());
            if(d==1)
            {
            System.out.println(" 30% AUDIANCE SAYS (1)   10% AUDIANCE SAYS (2)");
            System.out.println("  10% AUDIANCE SAYS (3)   50% AUDIANCE SAYS (4)");
            e="YOUR LIFELINE ARE (2) 50/50";
            }
            if(d==2)
            {
                System.out.println("YOUR NEW OPTIONS ARE-->");
                System.out.println("    (1)KOICHIRO MATSUURA         ");
                System.out.println("                            (4)JUAN SOMAVIA       ");
                e="YOUR LIFELINE ARE (1)AUDIANCE ";
            }
        }
    }
        ans=Integer.parseInt(stdin.readLine());
        if(ans==2)
        {
        System.out.println("sorry you lost  better luck next time");
        amt1=0;
        break;
        }
        if(ans==3)
        {
        System.out.println("sorry you lost  better luck next time");
        amt1=0;
        break;
        }
        if(ans==1)
        {
        System.out.println("CONGRATULATIONS!!! YOU HAVE GOT THE CORRECT ANSWER ");
        amt=amt+(amt*2);
        amt1=amt;
        System.out.println("DO YOU WISH TO PLAY FURTHER[ Yes/No ]");
        contd=stdin.readLine();
        c=contd;
        int z1=c.compareTo(s);
        if(z1==0)
        {
            System.out.println("thank you");
            break;
        }
        }
        if(ans==4)
        {
        System.out.println("sorry you lost  better luck next time");
        amt1=0;
        break;
        }
        }
        if(i==9)
        {
        System.out.println("YOUR NINTH QUESTION");
        System.out.println("     NAME THE PRESIDENT OF INTERNATIONAL OLYMPIC COMMITEE? ");
        System.out.println("YOUR OPTIONS ARE-->");
        System.out.println("     (1)KOICHIRO MATSUURA      (2)MARK M BROWN");
        System.out.println("     (3)JACQUES DIOUF          (4)JACQUES ROGGE");
        System.out.println();
        System.out.println("do you want to use lifelines [Y/N])");
        c1=stdin.readLine();
        int z=c1.compareTo(s1);
        if(z==0)
        {
        d1=d1-1;
        if(d1<=0)
        System.out.println(" SORRY YOU HAVE USED YOUR LIFELINES");
        if(d1>0)
        
        {
            System.out.println(e);
            d=Integer.parseInt(stdin.readLine());
            if(d==1)
            {
            System.out.println("  10% AUDIANCE SAYS (1)   40% AUDIANCE SAYS (2)");
            System.out.println("  10% AUDIANCE SAYS (3)   40% AUDIANCE SAYS (4)");
            e="YOUR LIFELINE ARE (2) 50/50";
            }
            if(d==2)
            {
                System.out.println("YOUR NEW OPTIONS ARE-->");
                System.out.println("    (1)KOICHIRO MATSUURA         ");
                System.out.println("                            (4)JACQUES ROGGE       ");
                e="YOUR LIFELINE ARE (1)AUDIANCE ";
            }
        }
    }
        ans=Integer.parseInt(stdin.readLine());
        if(ans==2)
        {
        System.out.println("sorry you lost  better luck next time");
        amt1=0;
        break;
        }
        if(ans==3)
        {
        System.out.println("sorry you lost  better luck next time");
        amt1=0;
        break;
        }
        if(ans==4)
        {
        System.out.println("CONGRATULATIONS!!! YOU HAVE GOT THE CORRECT ANSWER ");
        amt=amt+(amt*2);
        amt1=amt;
        System.out.println("DO YOU WISH TO PLAY FURTHER[ Yes/No ]");
        contd=stdin.readLine();
        c=contd;
        int z1=c.compareTo(s);
        if(z1==0)
        {
            System.out.println("thank you");
            break;
        }
        }
        if(ans==1)
        {
        System.out.println("sorry you lost  better luck next time");
        amt1=0;
        break;
        }
        }
        
        
        if(i==10)
        {
        System.out.println();  
        System.out.println(); 
         for(int i1=1;i1<=20;i1++)
      {
          for(int j1=40-i1;j1>1;j1--)
          System.out.print(" ");
          for(int j1=1;j1<=(i1*2)-1;j1++)
          System.out.print("$");
          System.out.println();
      }
        System.out.println();  
        System.out.println(); 
        
        System.out.println("YOUR LAST QUESTION THIS WOULD FETCH YOU 1 CRORE RS");
        System.out.println("     WHO IS THE CHIEF OF NASA? ");
        System.out.println("YOUR OPTIONS ARE-->");
        System.out.println("     (1)BLAISE COMPAORE      (2)GILBERT GUILLUAME");
        System.out.println("     (3)MICHAEL GRAFFIN      (4)SAM NUJOMA");
        System.out.println();
        for(int j=1;j<=2;j++)
        {
        if(j==1)System.out.println("do you want to use lifelines [Y/N])");
        if(j==2)System.out.println("this is your last lifeline do you want to use it?[Y/N]");
        c1=stdin.readLine();
        int z=c1.compareTo(s1);
        if(z==0)
        {
        d1=d1-1;
        if(d1<=0)
        System.out.println(" SORRY YOU HAVE USED YOUR LIFELINES");
        if(d1>0)
        
        {
            System.out.println(e);
            d=Integer.parseInt(stdin.readLine());
            if(d==1)
            {
            System.out.println("  30% AUDIANCE SAYS (1)   10% AUDIANCE SAYS (2)");
            System.out.println("  40% AUDIANCE SAYS (3)   20% AUDIANCE SAYS (4)");
            e="YOUR LIFELINE ARE (2) 50/50";
            }
            if(d==2)
            {
                System.out.println("YOUR NEW OPTIONS ARE-->");
                System.out.println("    (1)BLAISE COMPAORE         ");
                System.out.println("    (3)MICHAEL GRAFFIN         ");
                e="YOUR LIFELINE ARE (1)AUDIANCE ";
            }
        }
    }
}
        ans=Integer.parseInt(stdin.readLine());
        if(ans==2)
        {
        System.out.println("sorry you lost  better luck next time");
        amt1=0;
        break;
        }
        if(ans==1)
        {
        System.out.println("sorry you lost  better luck next time");
        amt1=0;
        break;
        }
        if(ans==3)
        {
        System.out.println("CONGRATULATIONS!!! YOU HAVE WON 1 CRORE RS");
        amt=10000000;
        amt1=amt;
        
            System.out.println("thank you");
            
        }
        if(ans==4)
        {
        System.out.println("sorry you lost  better luck next time");
        amt1=0;
        break;
        }
        }
    
    }
        System.out.println("       YOU HAVE WON    rs"+amt1);
        
    }
}