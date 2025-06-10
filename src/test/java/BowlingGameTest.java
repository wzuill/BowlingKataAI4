import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BowlingGameTest {

    @Test
    public void constructor_shouldCreateBowlingGameInstance_whenCalled() {
        BowlingGame game = new BowlingGame();
        assertNotNull(game);
    }

    @Test
    public void score_shouldReturnZero_whenAllRollsAreGutterBalls() {
        BowlingGame game = new BowlingGame();
        for (int i = 0; i < 20; i++) {
            game.roll(0);
        }
        assertEquals(0, game.score());
    }
}
