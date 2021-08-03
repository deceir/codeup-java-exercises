import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean wantToTalk = true;
        System.out.println("Would you like to talk to Bob? (yes/no)");
        wantToTalk = scanner.next().equalsIgnoreCase("yes");
        System.out.println("You are now talking with Bob. Say bye to end conversation.");
        int counter = 0;
        while (wantToTalk) {
            String userInput = scanner.nextLine();
            if (userInput.endsWith("?")) {
                System.out.println("Bob: 'Sure.'");
                counter++;
            } else if (userInput.endsWith("!")) {
                System.out.println("Bob: 'Whoah, chill out!'");
                counter++;
            } else if (userInput.equalsIgnoreCase("bye")) {
                System.out.println("Bob: 'Later.'");
                wantToTalk = false;
            } else if (userInput.length() == 0 && counter > 0) {
                System.out.println("Bob: 'Fine! Be that way.'");
            } else if (userInput.length() > 0){
                System.out.println("Bob: 'Whatever.'");
                counter++;
            }
        }


    }
}
