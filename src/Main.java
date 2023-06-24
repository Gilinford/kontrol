import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] questions = {
                "1. What is the possessive pronoun for 'he'?\n a) his\n b) her\n c) its\n d) their",
                "2. What is the possessive pronoun for 'she'?\n a) his\n b) her\n c) its\n d) their",
                "3. What is the possessive pronoun for 'it'?\n a) his\n b) her\n c) its\n d) their",
                "4. What is the possessive pronoun for 'we'?\n a) his\n b) her\n c) our\n d) their",
                "5. What is the possessive pronoun for 'they'?\n a) his\n b) her\n c) its\n d) their"
        };

        String[] answers = {
                "a",
                "b",
                "c",
                "c",
                "d"
        };

        int score = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Розробив курсант 203 н.г. Стецюк Максим Дмитрович");
        System.out.println("Are you an admin or a regular user?");
        System.out.println("Enter 'admin' for admin mode or any other key to continue as a user:");
        String userType = scanner.nextLine();

        if (userType.equalsIgnoreCase("admin")) {
            System.out.println("Enter the password:");
            String password = scanner.nextLine();

            if (password.equals("1111")) {
                System.out.println("Admin mode activated.");
                System.out.println("Correct answers:");
                for (int i = 0; i < questions.length; i++) {
                    System.out.println(questions[i]);
                    System.out.println("Correct answer: " + answers[i]);
                    System.out.println();
                }
            } else {
                System.out.println("Incorrect password. Exiting...");
            }
        } else {
            for (int i = 0; i < questions.length; i++) {
                System.out.println(questions[i]);

                String userAnswer = scanner.nextLine();

                if (userAnswer.equalsIgnoreCase(answers[i])) {
                    score++;
                    System.out.println("Correct!");
                } else if (userAnswer.equalsIgnoreCase("q")) {
                    System.out.println("Test terminated.");
                    return;
                } else if (!userAnswer.equalsIgnoreCase("a") && !userAnswer.equalsIgnoreCase("b") &&
                        !userAnswer.equalsIgnoreCase("c") && !userAnswer.equalsIgnoreCase("d")) {
                    System.out.println("Invalid answer! Please choose from options a, b, c, d.");
                    i--; // Repeat the current question
                } else {
                    System.out.println("Incorrect! The correct answer is: " + answers[i]);
                }

                System.out.println();
            }

            int percentage = (score * 100) / questions.length;
            System.out.println("Test completed! Your score is: " + percentage + "%");
        }
    }
}
