import java.util.*;
class SweetPlay
{
    int m, n;
    Node root;
    SweetPlay()
    {
        root=null;
        init();
    }
    private void init()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("N=");
        n = sc.nextInt();
        System.out.print("M=");
        m = sc.nextInt();
        Node k = new Node(1);
        root = k;
        Node p=root;
        for(int i=2;i<=n;i++)
        {
            k = new Node(i);
            p.setNext(k);
            p=p.getNext();
        }
        p.setNext(root);
    }
    public void findWinner()
    {
        Node p=root, q=null;
        while(p.getNext()!=p)
        {
            for(int i=1;i<=m;i++)
            {
                q=p;
                p=p.getNext();
            }
            if(p==root)
            {
                root=p.getNext();;
            }
            q.setNext(p.getNext());
            p.setNext(null);
            p=q.getNext();
        }
        System.out.println("Child on the position "+p.getInfo()+" gets the sweet");
    }
    public static void main(String args[])
    {
        SweetPlay obj = new SweetPlay();
        obj.findWinner();
    }
}