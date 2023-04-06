class Retire extends Personal
{
    protected int Yrs;
    protected float Pf, Grat;

    Retire(String n, String p, float bp, int an, int y, float pf, float gr)
    {
        super(n, p, bp, an);
        Yrs = y;
        Pf = pf;
        Grat = gr;
    }

    void provident()
    {
        Pf = super.basic_pay * 0.02f * Yrs;
    }

    void gratituity()
    {
        if (Yrs >= 10)
            Grat = 12 * basic_pay;
        else
            Grat = 0;
    }

    void display()
    {
        System.out.println("Name: " +Name);
        System.out.println("PAN Number: " +Pan);
        System.out.println("Basic Pay: " +basic_pay);
        System.out.println("Account Number: " +acc_no);
        System.out.println("Provident Fund: " +Pf);
        System.out.println("Gratuity Amount: " +Grat);
    }

}
