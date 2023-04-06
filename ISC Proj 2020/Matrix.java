import java.util.*;
class Matrix
{
    int mat[][];
    int m;
    Matrix()
    {
        m=0;
    }
    void accept()
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the size of matrix:");
        m=sc.nextInt();
        System.out.println("Enter the elements:");
        if(m<2 || m>20)
        {
            System.out.println("the size to be in range 2 to 20");
            System.exit(0);
        }
        mat =new int[m][m];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
            {
                mat[i][j]=sc.nextInt();
                if(mat[i][j]==-999)
                {  
                    j--;
                    System.out.println("Element not to be -999");
                }
            }
        }
        display(mat);
    }
    void mirrorImg()
    {
        int mat2[][]=mat;
        for (int i = 0; i < m; i++) 
        { 
            for (int j = 0; j <= m/2; j++) {
               int x = mat2[i][j];
               mat2[i][j] = mat2[i][m -1 - j];
               mat2[i][m -1 - j] = x;
            } 
        } 
        System.out.println("Mirror Image of matrix:");
        display(mat2);
    }
    void display(int k[][])
    {
        int n=k.length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(k[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        Matrix obj=new Matrix();
        obj.accept();
        obj.mirrorImg();
    }
}