public class GameManager {
    private Game currentGame;

    public void startGame(Game game) {
        if (currentGame != null && !currentGame.isFinished()) {
            System.out.println("Nie można rozpocząć nowej gry, ponieważ inna gra jest w toku.");
            return;
        }
        currentGame = game;
        currentGame.start();
    }

    public void finishGame() {
        if (currentGame == null || currentGame.isFinished()) {
            System.out.println("Nie ma rozpoczętej gry do zakończenia.");
            return;
        }
        currentGame.finish();
    }

    public void updateScore(String result) {
        if (currentGame == null || currentGame.isFinished()) {
            System.out.println("Nie można aktualizować wyniku, ponieważ gra nie jest w toku.");
            return;
        }
        currentGame.updateScore(result);
    }

    public Game getCurrentGame() {
        return currentGame;
    }
}