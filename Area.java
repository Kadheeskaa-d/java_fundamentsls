class Area{
    int side;
    int length;
    int area;
    
    void get ( int s , int l)
    {
        side = s;
        length = l;
    }
    
    void calculateArea()
    {
    area = side * length;
    System.out.println("Area : " + area);
    }
    
    public static void main ( String [] args)
    {
        Area a = new Area();
        a.get(10,3);
        a.calculateArea();
    }
}