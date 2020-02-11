package dungeon_crawler.commands.movement;

import dungeon_crawler.commands.Command;
import dungeon_crawler.dungeon.Direction;
import dungeon_crawler.player.Player;

public class MoveSouthCommand implements Command {

    private Player player;

    public MoveSouthCommand(Player player) {
        this.player = player;
    }

    @Override
    public boolean execute() {
        return player.moveDungeon(Direction.S);
    }
}
