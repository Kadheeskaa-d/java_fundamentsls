class Nested_loop1_2_3
{
    public static void main( String[] args)
    {
        int n=5;
        int i,j;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(i+ " ");
            }
            System.out.println();
        }
    }
}
