class CarModel
{
    String model;
    CarModel()
    {
        model = "Unknown";
        System.out.print("Default Constructor called : ");
    }
    void display()
    {
        System.out.print("Models " + model);
    }
    public static void main ( String [] args)
    {
        CarModel c = new CarModel();
        c.display();
    }
}
