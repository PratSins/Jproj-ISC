class Node
{
    private int info;
    private Node next;
    public Node()
    {
        info=0;
        next=null;
    }
    public Node(int x)
    {
        info=x;
        next=null;
    }
    public Node(Node n)
    {
        info=n.getInfo();
        next=n.getNext();
    }
    public void setInfo(int x)
    {
        info=x;
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