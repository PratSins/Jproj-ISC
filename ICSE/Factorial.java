class Factorial
{
    int fact(int n)
    {
        int f=1;
        if (n == 0)
         f=1;
        else
         f=n * fact(n-1);
         return f;
    }
}