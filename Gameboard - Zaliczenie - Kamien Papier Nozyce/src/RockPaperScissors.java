public class RockPaperScissors extends Game {
    private int playerScore;
    private int computerScore;

    @Override
    public void start() {
        playerScore = 0;
        computerScore = 0;
        setFinished(false);
        System.out.println("Gra rozpoczęta. Kamień, papier, nożyce!");
    }

    @Override
    public void finish() {
        setFinished(true);
        System.out.println("Gra zakończona. Wynik: Gracz " + playerScore + " - Komputer " + computerScore);
    }
	public int getPlayerScore() {
		return playerScore;
	}

	public int getComputerScore() {
		return computerScore;
	}

    @Override
    public void updateScore(String result) {
        switch (result) {
            case "wygrana":
                playerScore++;
                break;
            case "przegrana":
                computerScore++;
                break;
            case "remis":
                // No score update needed for a tie
                break;
            default:
                System.out.println("Nieznany wynik: " + result);
                break;
        }
    }
}