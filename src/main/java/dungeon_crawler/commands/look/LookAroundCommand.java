package dungeon_crawler.commands.look;

import dungeon_crawler.TerminalColor;
import dungeon_crawler.commands.Command;
import dungeon_crawler.dungeon.Direction;
import dungeon_crawler.player.Player;

public class LookAroundCommand implements Command {

    private Player player;

    public LookAroundCommand(Player player) {
        this.player = player;
    }

    @Override
    public boolean execute() {
        for (Direction direction : player.getCurrentDungeon().availableDirections()) {
            System.out.println(String.format("You see a path to the %s%s.%s\n", TerminalColor.ANSI_BLUE, direction.toString(), TerminalColor.ANSI_RESET));
        }
        return false;
    }
}
