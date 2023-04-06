class Nodew
{
    private int info, visits;
    private Nodew next;
    public Nodew()
    {
        visits = info = 0;
        next = null;
    }
    public Nodew(int x)
    {
        info = x;
        visits = 0;
        next = null;
    }
    public Nodew(Nodew n)
    {
        visits = 0;
        info = n.getInfo();
        next = n.getNext();
    }
    public void setInfo(int x)
    {
        info = x;
    }
    public void setNext(Nodew n)
    {
        next = n;
    }
    public void incrementVisits()
    {
        ++visits;
    }
    public int getInfo()
    {
        return info;
    }
    public Nodew getNext()
    {
        return next;
    }
    public int getVisits()
    {
        return visits;
    }
}