class Parameterized_constructor
{
    String model;
    Parameterized_constructor ( String model)
    {
        model = m ;
    }
    void display()
    {
        System.out.println("Model" + model);
    }
    public static void main ( String [] args)
    {
        Parameterized_constructor c = new Parameterized_constructor ("Toyato");
        c.display();
    }
}
