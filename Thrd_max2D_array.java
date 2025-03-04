public class Thrd_max2D_array
{
    public static void main(String[] args)
    {
        int[][] arr = {
                    {5, 3, 8},
                    {1, 9, 4},
                    {6, 2, 7}
            };

        int size = arr.length * arr[0].length;
        int[] Array = new int[size];

            int k = 0;
            for (int[] row : arr)
            {
                for (int num : row)
                {
                    Array[k++] = num;
                }
            }

            for (int i = 0; i < size - 1; i++)
            {
                for (int j = i + 1; j < size; j++)
                {
                    if (Array[i] < Array[j])
                    {
                        int temp = Array[i];
                        Array[i] = Array[j];
                        Array[j] = temp;
                    }
                }
            }
            System.out.println("3rd Maximum: " + Array[2]);
        }
    }
