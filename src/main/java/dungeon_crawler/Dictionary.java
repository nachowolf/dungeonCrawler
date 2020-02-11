package dungeon_crawler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Dictionary {

    private static List<String> moveWords = new ArrayList<>(Arrays.asList("move", "go", "run"));
    private static List<String> lookWords = new ArrayList<>(Arrays.asList("look", "see"));

    public static List<String> getMoveWords() {
        return moveWords;
    }

    public static List<String> getLookWords() {
        return lookWords;
    }
}
