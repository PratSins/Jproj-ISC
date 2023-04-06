class Personal
{
    protected String Name, Pan;
    protected float basic_pay;
    protected int acc_no;

    Personal(String n, String p, float bp, int an)
    {
        Name = n;
        Pan =p;
        basic_pay = bp;
        acc_no = an;
    }

    void display()
    {
        System.out.println("Name: " +Name);
        System.out.println("PAN Number: " +Pan);
        System.out.println("Basic Pay: " +basic_pay);
        System.out.println("Account Number: " +acc_no);
    }
}
