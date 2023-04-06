class TriangleS
{
    void check(int a , int b, int c)
    {
        int ch=(a+b>c)&&(a+c>b)&&(b+c>a)?1:2;
        String ch2=(ch==1)?((a==b&&b==c&&c==a)?"Equilateral":(a==b||b==c||c==a)?"Isoceles":"Scalene"):"Triagle not possible";
        System.out.println(ch2);
    }
}