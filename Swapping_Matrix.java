public class Swapping_Matrix
{
    public static void main(String[] args)
    {
            // Input 2D array
            int[][] arr = {
                    {5, 4, 7},
                    {1, 8, 3},
                    {9, 6, 2}
            };

            // Print Original Array
            System.out.println("Original Array:");
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }

            // Transform the Array
            for (int i = 1; i < arr.length; i++) {
                arr[i][0] = arr[i - 1][0];  // Copy first column value from the row above
                arr[i][arr[0].length - 1] = arr[i - 1][arr[0].length - 1]; // Copy last column from above row
            }

            // Print Transformed Array
            System.out.println("\nTransformed Array:");
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

