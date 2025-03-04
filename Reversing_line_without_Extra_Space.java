import java.util.Scanner;
    public class Reversing_line_without_Extra_Space
    {
        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the sentence:");
            String input = sc.nextLine();
            String result = "";
            String word = "";

            input += " ";

            for (int i = 0; i < input.length(); i++)
            {
                char ch = input.charAt(i);
                if (ch != ' ')
                {
                    word += ch;
                }
                else if (word != "")
                {
                    result = word + " " + result;
                    word = "";
                }
            }

            System.out.println("Output:" + result);
        }
    }

