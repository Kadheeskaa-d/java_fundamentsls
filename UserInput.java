import java.util.Scanner;
class UserInput
{
    public static void main(String[] args) 
    {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        System.out.println(N);
        
        char A = scn.next().charAt(0);
        System.out.println(A);
        
        String word = scn.next();
        System.out.println(word);
        
        scn.nextLine();
        String sentence = scn.nextLine();
        System.out.println(sentence);
        
        double num = scn.nextDouble();
        System.out.println(num);
    }
}

