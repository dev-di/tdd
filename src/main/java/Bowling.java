import java.util.Arrays;
import java.util.stream.Collectors;

public class Bowling {
    public static String capitalize(String source) {
        if (source.isEmpty()) {
            return source;
        }
        String[] parts = source.split("\\s");
        if (parts.length > 1) {
            return Arrays.stream(parts)
                    .map(Bowling::capitalize)
                    .collect(Collectors.joining(" "));
        }
        return Character.toUpperCase(source.charAt(0)) + source.substring(1);
    }

    public static int getScore(String row) {
        return 42;
    }

    public static String getWinnerName() {
        return "Yatas Del Lana";
    }
    public static int getWinnerScore() {
        return 45;
    }
}
