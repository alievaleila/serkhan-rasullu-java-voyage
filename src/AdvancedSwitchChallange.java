import java.util.Scanner;

public class AdvancedSwitchChallange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("-----Smart Text Processor-----");
            System.out.println("Enter your sentence: ");
            String text = sc.nextLine();

            System.out.println("\n1.Invert Case (Upper <-> Lower)");
            System.out.println("2.Count vowels");
            System.out.println("3.Encryption (Enigma Lite)");
            System.out.println("4. Exit program");
            System.out.print("Select an option (1-4): ");
            int choice = sc.nextInt();
            sc.nextLine();


            if (choice == 4) {
                System.out.println("Exiting..Have a good night Java Developer :)");
                break;
            }

            switch (choice) {
                case 1:
                    String invertedResult = "";
                    for (int i = 0; i < text.length(); i++) {
                        char ch = text.charAt(i);
                        if (ch >= 'a' && ch <= 'z') {
                            invertedResult += (char) (ch - 32);
                        } else if (ch >= 'A' && ch <= 'Z') {
                            invertedResult += (char) (ch + 32);
                        } else {
                            invertedResult += ch;
                        }
                    }
                    System.out.println("Result: " + invertedResult);
                    break;
                case 2:
                    int vovelCount = 0;
                    String lowerText = text.toLowerCase();
                    for (int i = 0; i < lowerText.length(); i++) {
                        char ch = lowerText.charAt(i);
                        switch (ch) {
                            case 'a':
                            case 'o':
                            case 'e':
                            case 'u':
                            case 'i':
                                vovelCount++;
                                break;
                        }
                    }
                    System.out.println("Total vowels: " + vovelCount);
                    break;
                case 3:
                    String encryptedText = "";
                    for (int i = 0; i < text.length(); i++) {
                        char ch = text.charAt(i);
                        if (Character.isLetter(ch)) {
                            encryptedText += (char) (ch + 1);
                        } else {
                            encryptedText += ch;
                        }
                        System.out.println("Encrypted message: " + encryptedText);
                    }
                    break;
                default:
                    System.out.println("Invalid choice. System self-destructing..");
                    break;
            }
        }
        sc.close();
    }
}
