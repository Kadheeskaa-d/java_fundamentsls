public class Harshad_Num {
    public static void main(String[] args) {
        for (int i = 100; i <= 200; i++) {
            int num = i;
            int temp = num;
            int sum = 0;

            while (temp > 0) {
                int digits = temp % 10;
                sum = sum + digits;
                temp = temp / 10;
            }

            if ( num % sum == 0){
                System.out.println(num + " is a Harshad Number");
            }
        }
    }
}
