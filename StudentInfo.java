import java.util.Scanner;
class StudentInfo
{
    String name;
    int id;
    
	public static void main(String[] args)
	{
	    Scanner scn = new Scanner (System.in);
	    System.out.println("Enter the name:");
	    String name = scn.next();
	    
		System.out.println("Enter the roll number:");
		int id = scn.nextInt();
		
		System.out.println("Student name : " + name);
		System.out.println("Register number:" + id);
	}
}
