class Grand_Parents
{
    int age = 98;
    public void show()
    {
        System.out.println(age);
    }
}

class Parent extends Grand_Parents
{
    String name = "Kaviya";
    public void display()
    {
        System.out.println(name);
    }
}

class Children extends Parent
{
    int count = 300;
    public void output()
    {
        System.out.println(count);
    }
}
public class Multilevel_Inheritance
{
    public static void main(String[] args)
    {
        Children obj = new Children();
        obj.show();
        obj.display();
        obj.output();
    }

}
