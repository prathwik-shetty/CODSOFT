import java.util.Scanner;

public class Chatbot {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("ChatBot: Hello! I'm your simple rule-based chatbot.");
        System.out.println("Type 'exit' to end the chat.\n");

        while (true) {

            System.out.print("You: ");
            String input = scanner.nextLine().toLowerCase();

            if (input.equals("exit")) {
                System.out.println("ChatBot: Goodbye! Take care.");
                break;
            }

            else if (input.contains("hello") || input.contains("hi")) {
                System.out.println("ChatBot: Hi there! How can I assist you today?");
            }

            else if (input.contains("how are you")) {
                System.out.println("ChatBot: I'm just code, but I'm doing great! 🙂");
            }

            else if (input.contains("your name")) {
                System.out.println("ChatBot: I'm a simple rule-based chatbot created for the CodSoft internship.");
            }

            else if (input.contains("help")) {
                System.out.println("ChatBot: I can chat with you! Try asking 'how are you', 'your name', or say 'bye'.");
            }

            else if (input.contains("thank you")) {
                System.out.println("ChatBot: You're welcome! 😊");
            }

            else {
                System.out.println("ChatBot: Sorry, I didn't understand that.");
            }
        }

        scanner.close();
    }
}

