class Area
  {
    static double area(double radius)
    {
        double pi = 3.14;
        return pi * radius * radius;
    }

    static int area(int side) 
    {
        return side * side;
    }

    static int area(int length, int width)
    {
        return length * width;
    }

    public static void main(String[] args) 
    {
        System.out.println("Area of Circle: " + area(4));
        System.out.println("Area of Square: " + area(4));
        System.out.println("Area of Rectangle: " + area(10, 3));
    }
}
