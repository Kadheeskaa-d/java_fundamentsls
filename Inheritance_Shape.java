class Shape
{
    double area;
    public void area()
    {
        System.out.println("Area of shape");
    }
}

class Rectangle extends Shape
{
    double l,b;
    Rectangle(double l,double b)
    {
        this.l=l;
        this.b=b;
        System.out.println(l*b);
    }
    public void area(double l , double b)
    {
        double area = l * b;
        super.area();
        System.out.println(area);
    }

}



public class Inheritance_Shape
{
    public static void main(String[] args)
    {
        Rectangle obj = new Rectangle(12.0,13.0);
        obj.area(12.0,13.0);
    }
}
