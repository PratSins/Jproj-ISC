import java.util.Scanner;
class InitBinTree
{
    private static BinTree bt;
    public static void main(String[] args)
    {
        bt=new BinTree();
        Scanner sc=new Scanner(System.in);
        int val = 0;
        char ch = ' ';

        //Test add value
        do
        {
            System.out.print("\n Enter a number: ");
            val = sc.nextInt();
            bt.add(val);
            System.out.print("\n Want to add more values? (Y/N)");
            ch = sc.next().charAt(0);
        } while (ch == 'y' || ch == 'Y');

        //Test traversal
        System.out.println("\n postorder: \n");
        bt.postorder();
        System.out.println("\n preorder: ");
        bt.preorder();
        System.out.println("\n inorder: ");
        bt.inorder();

        //Test modify
        int old = 0, mod = 0;
        do {
            System.out.print("\n Enter existing value: ");
            old = sc.nextInt();
            System.out.print("\n Enter new value: ");
            mod = sc.nextInt();
            bt.modify(old, mod);
            System.out.print("\n Modified Binary Tree (Inorder): \n");
            bt.inorder();
            System.out.print("\n Want to modify more values? (Y/N)");
            ch = sc.next().charAt(0);
        } while (ch == 'y' || ch == 'Y');

        //Test delete
        do
        {
            System.out.print("\n Enter a number to delete: ");
            val = sc.nextInt();
            bt.dele(val);
            System.out.print("\n Modified Binary Tree (Inorder): \n");
            bt.inorder();
            System.out.print("\n Want to delete more values? (Y/N)");
            ch = sc.next().charAt(0);
        } while (ch == 'y' || ch == 'Y');
    }

}
