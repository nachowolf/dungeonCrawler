package dungeon_crawler.commands.look;

import dungeon_crawler.commands.Command;
import dungeon_crawler.dungeon.Direction;
import dungeon_crawler.player.Player;

public class LookNorthCommand implements Command {

    private Player player;

    public LookNorthCommand(Player player){
        this.player = player;
    }

    @Override
    public boolean execute() {
        if(this.player.getCurrentDungeon().availableDirections(Direction.N)){
            System.out.println("You look north and see another dungeon_crawler.dungeon.");
        }
        else{
            System.out.println("You look north and see a wall.");
        }
        System.out.println();
        return false;
    }
}
