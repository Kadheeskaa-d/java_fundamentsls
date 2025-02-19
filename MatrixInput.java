import java.util.Scanner;
class MatrixInput
{
    public static void main(String[] args) 
    {
        Scanner scn = new Scanner(System.in);
        
        System.out.print("Enter the number of rows :");
        int r = scn.nextInt();
        
        System.out.print("Enter the number of columns :");
        int c = scn.nextInt();
        
        int matrix[][] = new int [r][c];
        
        System.out.println("Enter the matrix elements:");
        for(int i = 0; i<r ; i++)
        {
            for (int j=0;j<c;j++)
            {
                matrix[i][j]=scn.nextInt();
            }
        }
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

