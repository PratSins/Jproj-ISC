class LinkedList
{
    private Node root;
    
    public LinkedList()
    {
        root=null;
    }
    
    public void addAtBeg(int val)
    {
        Node n=new Node();
        n.setInfo(val);
        if(root==null)
        {
            root=n;
        }
        else
        {
            n.setNext(root);
            root=n;
        }
        System.out.print("\n Contents of list after adding the node \n");
        display();
    }
    
    public void addAtEnd(int val)
    {
        Node n=new Node();
        n.setInfo(val);
        if(root==null)
        {
            root=n;
        }
        else
        {
            Node p=root;
            while(p.getNext()!=null)
            p=p.getNext();
            p.setNext(n);
        }
        System.out.print("\n Contents of list after adding the node \n");
        display();
    }
    
    
    public void removefromBeg()
    {
        if(root==null)
        {
            System.out.print("\n List is empty ");
            return;
        }
        else
        {
            Node p=root;
            root=p.getNext();
            System.out.print("\n Deleted Node is :"+p.getInfo());
        }
        System.out.print("\n Contents of list after deleting the node \n");
        display();
    }
    
    public void removefromEnd()
    {
        if(root==null)
        {
            System.out.print("\n List is empty ");
            return;
        }
        else
        {
            Node p=root,q=null;
            while(p.getNext()!=null)
            {
                q=p;
                p=p.getNext();
            }
            q.setNext(null);
            System.out.print("\n Deleted Value :"+p.getInfo());
        }
        display();
    }
    
    
    public void display()
    {
        if(root==null)
        {
            System.out.print("\n List is empty ");
            return;
        }
        else
        {
            Node p=root;
            while(p!=null)
            {
                System.out.print("\n Node value :"+p.getInfo());
                p=p.getNext();
            }
        }
    }
}
        
