import java.util.Scanner;

public class number_conversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter a decimal number: ");
        int decimal = scanner.nextInt();


        int tempDecimal = decimal;
        String binary = "";
        while (tempDecimal > 0) {
            binary = (tempDecimal % 2) + binary;
            tempDecimal /= 2;
        }


        tempDecimal = decimal;
        String octal = "";
        while (tempDecimal > 0) {
            octal = (tempDecimal % 8) + octal;
            tempDecimal /= 8;
        }


        tempDecimal = decimal;
        String hexDigits = "0123456789ABCDEF";
        String hexadecimal = "";
        while (tempDecimal > 0) {
            hexadecimal = hexDigits.charAt(tempDecimal % 16) + hexadecimal;
            tempDecimal /= 16;
        }

       
        System.out.println("Binary: " +  binary);
        System.out.println("Octal: " +  octal);
        System.out.println("Hexadecimal: " +  hexadecimal);

        scanner.close();
    }
}
