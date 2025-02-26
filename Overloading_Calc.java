class Overloading_Calc
{
    static int a , b ,c;
    static void calc()
    {
        c = a + b;
        System.out.println("Sum " + c);
    }
    
    static void calc(int x , int y)
    {
        int diff = y - x;
        System.out.println("Diff " + diff);
    }
    
    static void calc(float a , float b)
    {
        float c = a*b;
        System.out.println("Mul " + c);
    }
    
    static void calc(double a , double b)
    {
        double c = b/a;
        System.out.println("Div " + c);
    }
    
    public static void main (String [] args)
    {
        calc(5,10);
        calc(20,40);
        calc(2f,5f);
        calc(30.0,3.0);
    }
}