import java.util.Scanner;

public class BinaryASCIIConverter
{
    private static Scanner sc = new Scanner(System.in);

    public static void run()
    {
        System.out.println(
                """
                1. Text to binary
                2. Binary to text
                3. Quit      
                Enter choice:\s    
                """
        );
        int choice = sc.nextInt();
        sc.nextLine();

        if (choice == 1){
            textToBinary();
        }
        else if (choice == 2){
            binaryToText();
        }
    }

    private static void binaryToText() {
        System.out.println("Enter binary (8-bit): ");
        String message = sc.nextLine(); //Readline
        //sc.nextLine(); //Readline
        int counter = 7; //Variables
        int tallyUp = 0;
        String answer = ""; //Variables
        for (int i = 0; i < message.length()+1; i++)
        {
            if (counter == -1) {
                counter = 7;
                char c = (char)tallyUp;
                answer += c;
                tallyUp = 0;}
            else if (message.charAt(i) == '1') {
                tallyUp += Math.pow(2, counter);
                counter--;}
            else {
                counter--;}
        }
        System.out.println(answer);
    }

    private static void textToBinary() {
        System.out.println("Enter message: ");
        String choice = sc.nextLine();
        //sc.nextLine();

        String answer = "";

        for (int i = 0; i < choice.length(); i++)
        {
            int currentChar = choice.charAt(i);

            for (int j = 128; j >= 1; j /= 2)
            {
                if (currentChar - j < 0)
                {
                    answer += "0";
                }
                else{
                    answer += "1";
                    currentChar = currentChar - j;
                }
            }

                answer += " ";

        }
        System.out.println(answer);
        //String.charAt()
        //int ascii = String.charAt(i);
    }
}