class Node
{
    private int info;
    
    private Node next;
    
    public Node()
    {
        info=0;
        next=null;
    }
    
    public void setInfo(int val)
    {
        info=val;
    }
    
    public void setNext(Node n)
    {
        next=n;
    }
    
    public int getInfo()
    {
        return info;
    }
    
    public Node getNext()
    {
        return next;
    }
}
