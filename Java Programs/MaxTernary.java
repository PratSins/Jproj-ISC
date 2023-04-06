public class MaxTernary
{
    public static void display(int a,int b,int c)
    {
       String max;
       max=a>b?(a>c?("a is greater"):("c is greater")):(b>c?("b is greater"):("c is greater"));
       System.out.println(max);
    }
}    