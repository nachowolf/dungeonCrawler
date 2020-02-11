package dungeon_crawler.commands.look;

import dungeon_crawler.commands.Command;
import dungeon_crawler.dungeon.Direction;
import dungeon_crawler.player.Player;

public class LookEastCommand implements Command {

    private Player player;

    public LookEastCommand(Player player){
        this.player = player;
    }

    @Override
    public boolean execute() {
        if(this.player.getCurrentDungeon().availableDirections(Direction.E)){
            System.out.println("You look east and see another dungeon_crawler.dungeon.");
        }
        else{
            System.out.println("You look east and see a wall.");
        }
        System.out.println();
        return false;
    }
}
