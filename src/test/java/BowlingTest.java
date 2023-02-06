import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BowlingTest {

    @ParameterizedTest
    @CsvSource(value = {"Yatas Del Lana 3 5 3 5 7 2 3 0 10 4 3:45", "Eve Stojbs 3 7 3 3 9 1 6 4 2 3 1 0:42"}, delimiter = ':')
    public void testScoreSum(String row, int expected) {
        // when the phrase is capitalized
        int score = Bowling.getScore(row);
        System.out.println("row: " + row);
        System.out.println("expected: " + expected);

        // then it should equal the expected phrase
        assertEquals(expected, score);
    }

    @Test
    public void getWinnerName() {
        // given file with input
        String filename = "";

        String winner = Bowling.getWinnerName();

        assertEquals("Yatas Del Lana", winner);
    }
    @Test
    public void getWinnerScore() {
        // given file with input
        String filename = "";

        int score = Bowling.getWinnerScore();

        assertEquals(45, score);
    }

}
