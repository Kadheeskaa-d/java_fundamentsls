class Parents
{
    int age=45;
    public void display()
    {
        System.out.println(age);
    }
}

class Child extends Parents
{
    int count = 2;
    public void show()
    {
        System.out.println(count);
    }
}

public class Single_Inheritance
{
    public static void main(String[] args)
    {
        Child obj = new Child();
        obj.display();
        obj.show();
    }
}
