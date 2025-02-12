class Relational_short_circuit_operator
{
	public static void main(String[] args) 
	{
	    int a = 100;
	    int b = 50;
	    int c = 90;
	    
	    if ( a>b && a>c)
	    {
	        System.out.println("a is greater than b");
	    }
	    else if (b<c){
	        System.out.println("b is greater than c");
	    }
	    else{
	        System.out.println("c is greater");
	    }
	}
}