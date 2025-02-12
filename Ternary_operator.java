class Ternary_operator
{
	public static void main(String[] args) 
	{
	    int a = 100;
	    int b = 50;
	    int c = 120;
	    
	    int max = (a>b && a>c) ? a: (b>c)? b:c;
	    System.out.println (max);
	}
}