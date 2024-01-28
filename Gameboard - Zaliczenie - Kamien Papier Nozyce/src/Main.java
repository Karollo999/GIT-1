import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        GameManager gameManager = new GameManager();
        RockPaperScissors rps = new RockPaperScissors();

        // Start the game
        gameManager.startGame(rps);

        String playerChoice;
        String[] choices = {"kamień", "papier", "nożyce"};
        String computerChoice;
        String result;

        System.out.println("Zagrajmy w Kamień, Papier, Nożyce!");
        System.out.println("Aby zagrać wpisz: kamień, papier lub nożyce. Aby zakończyć wpisz: koniec");

        while (true) {
            System.out.print("Twój wybór: ");
            playerChoice = scanner.nextLine().toLowerCase();

            if (playerChoice.equals("koniec")) {
                break;
            }

            if (!playerChoice.equals("kamień") && !playerChoice.equals("papier") && !playerChoice.equals("nożyce")) {
                System.out.println("Nieprawidłowy wybór. Spróbuj ponownie.");
                continue;
            }

            computerChoice = choices[random.nextInt(choices.length)];
            System.out.println("Komputer wybrał: " + computerChoice);

            result = determineWinner(playerChoice, computerChoice);
            gameManager.updateScore(result);
            System.out.println("Wynik rundy: " + result);
            // Show current score
            showScore(rps);
        }

        // Finish the game and show final score
        gameManager.finishGame();
        scanner.close();
    }

    private static String determineWinner(String playerChoice, String computerChoice) {
        if (playerChoice.equals(computerChoice)) {
            return "remis";
        } else if (playerChoice.equals("kamień") && computerChoice.equals("nożyce") ||
                   playerChoice.equals("papier") && computerChoice.equals("kamień") ||
                   playerChoice.equals("nożyce") && computerChoice.equals("papier")) {
            return "wygrana";
        } else {
            return "przegrana";
        }
    }

    private static void showScore(RockPaperScissors rps) {
        System.out.println("Aktualny wynik: Gracz " + rps.getPlayerScore() + " - Komputer " + rps.getComputerScore());
    }
}