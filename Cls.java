import java.util.Scanner;
class Cls
{
    public int a,b,c;
    
    public void sum()
    {
        System.out.println("Sum = " + c);
    }
    public static void main ( String [] args)
    {
        Cls obj = new Cls();
        Scanner scn = new Scanner ( System.in);
        obj.a = scn.nextInt();
        obj.b = scn.nextInt();
        obj.c = obj.a + obj.b;
        obj.sum();
    }
}
