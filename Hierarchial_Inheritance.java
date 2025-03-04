class Shape1
{
    public void area()
    {
        System.out.println("Calculated Area : ");
    }
}

class Rectangle1 extends Shape1
{
    public void area(double l,double b)
    {
        super.area();
        double area=l*b;
        System.out.println("Area of Rectangle : "+area);
    }
}

class Triangle1 extends Shape1
{
    public void area(int l , int b)
    {
        double area = 0.5*l*b;
        System.out.println("Area of Triangle : "+area);
    }
}

class Circle1 extends Shape1
{
    public void area(double r)
    {
        final double pi=3.14;
        double area = pi*r*r;
        System.out.println("Area of Circle : "+area);
    }
}

class Square1 extends Shape1
{
    public void area(int a)
    {
        double area = a*a;
        System.out.println("Area of Square : "+area);
    }
}

public class Hierarchial_Inheritance
{
    public static void main(String[] args)
    {
        Rectangle1 r = new Rectangle1();
        r.area(10,2);

        Triangle1 t = new Triangle1();
        t.area(10,2);

        Circle1 c = new Circle1();
        c.area(10);

        Square1 s = new Square1();
        s.area(10);
    }
}
