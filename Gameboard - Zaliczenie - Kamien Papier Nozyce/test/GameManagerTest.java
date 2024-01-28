import org.junit.Test;
import static org.junit.Assert.*;

public class RockPaperScissorsTest {

    @Test
    public void testGameStart() {
        RockPaperScissors rps = new RockPaperScissors();
        rps.start();
        assertFalse("Game should not be finished after start", rps.isFinished());
    }

    @Test
    public void testGameFinish() {
        RockPaperScissors rps = new RockPaperScissors();
        rps.start();
        rps.finish();
        assertTrue("Game should be finished after calling finish", rps.isFinished());
    }

    @Test
    public void testScoreUpdateWin() {
        RockPaperScissors rps = new RockPaperScissors();
        rps.start();
        rps.updateScore("wygrana");
        assertEquals("Player score should be 1 after winning", 1, rps.getPlayerScore());
    }

    @Test
    public void testScoreUpdateLoss() {
        RockPaperScissors rps = new RockPaperScissors();
        rps.start();
        rps.updateScore("przegrana");
        assertEquals("Computer score should be 1 after player loss", 1, rps.getComputerScore());
    }

    @Test
    public void testScoreUpdateTie() {
        RockPaperScissors rps = new RockPaperScissors();
        rps.start();
        rps.updateScore("remis");
        assertEquals("Player score should remain 0 after a tie", 0, rps.getPlayerScore());
        assertEquals("Computer score should remain 0 after a tie", 0, rps.getComputerScore());
    }
}