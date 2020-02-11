import dungeon_crawler.CommandExecutor;
import dungeon_crawler.CommandExtractor;
import dungeon_crawler.Narrator;
import dungeon_crawler.dungeon.Direction;
import dungeon_crawler.dungeon.Dungeon;
import dungeon_crawler.dungeon.DungeonBuilder;
import dungeon_crawler.player.Player;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        DungeonBuilder dungeonBuilder = new DungeonBuilder();
        dungeonBuilder.build();

        Player player = new Player("Nath", dungeonBuilder.getStartDungeon());
        Narrator narrator = new Narrator(player);

        CommandExecutor executor = new CommandExecutor(player);
        Scanner scanner = new Scanner(System.in);
        while (true) {

            narrator.read();
            String userInput = scanner.nextLine();
            if(executor.execute(new CommandExtractor(userInput))){
                System.out.println(String.format("You %s\n", userInput));
            }
        }
    }
}
