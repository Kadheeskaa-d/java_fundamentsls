class OverloadingCalc
{
    int x = 5;
    int y = 10;
    
    public void add()
    {
        int sum = x+y;
        System.out.println("Sum : " + sum);
    }
    void sub(int a , int b)
    {
        int sub = b - a;
        System.out.println("Sub : " + sub);
    }
    void mul()
    {
        int mul = x*y;
        System.out.println("Mul : " + mul);
    }
    void div()
    {
        int div = y/x;
        System.out.println("Div : " +div);
    }
    public static void main ( String [] args)
    {
        OverloadingCalc obj = new OverloadingCalc();
        obj.add();
        obj.sub(10,20);
        obj.mul();
        obj.div();
    }
}