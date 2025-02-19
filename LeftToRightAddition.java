class LeftToRightAddition
{
    public static void main(String[] args) 
    {
        int A[] = {5, 1, 3};
        int B[] = {9, 7, 7, 7};

        int n = A.length;
        int result[] = new int[n + 1];
        int carry = 0;

        for (int i = 0; i < n; i++) 
        {
            int sum = A[i] + B[i] + carry;
            result[i] = sum % 10;
            carry = sum / 10;    
        }

        result[n] = carry;

        System.out.print("Result: ");
        boolean started = false;

        for (int i = 0; i <= n; i++) {
            if (result[i] != 0 || started) 
            {
                System.out.print(result[i] + " ");
                started = true;
            }
        }
    }
}

