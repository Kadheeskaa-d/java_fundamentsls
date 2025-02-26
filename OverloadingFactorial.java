class OverloadingFactorial
{
    static int fact = 1;
    
    static void calc(int n)
    {
        for ( int i = 1 ; i <= n ; i++)
        {
            fact*=i;
        }
        System.out.println("Factorial : " + fact);
    }
    
    static void calc(float l)
    {
        for (int i = 1 ; i <=l ; i++)
        {
            fact*=i;
        }
        System.out.println("Factorial of " + l + " is " + fact);
    }
    public static void main ( String [] args)
    {
        calc(5);
        calc(10f);
    }
}