package dungeon_crawler;

import dungeon_crawler.commands.Command;
import dungeon_crawler.commands.NoCommand;
import dungeon_crawler.commands.Option;
import dungeon_crawler.commands.look.*;
import dungeon_crawler.commands.movement.MoveEastCommand;
import dungeon_crawler.commands.movement.MoveNorthCommand;
import dungeon_crawler.commands.movement.MoveSouthCommand;
import dungeon_crawler.commands.movement.MoveWestCommand;
import dungeon_crawler.player.Player;

import java.util.HashMap;
import java.util.Map;

public class CommandExecutor {

    private Map<Option, Command> commands = new HashMap<>();
    private Player player;

    public CommandExecutor(Player player) {
        this.player = player;
        commands.put(Option.MOVE_NORTH, new MoveNorthCommand(this.player));
        commands.put(Option.MOVE_WEST, new MoveWestCommand(this.player));
        commands.put(Option.MOVE_SOUTH, new MoveSouthCommand(this.player));
        commands.put(Option.MOVE_EAST , new MoveEastCommand(this.player));
        commands.put(Option.NO_COMMAND, new NoCommand());
        commands.put(Option.LOOK_AROUND, new LookAroundCommand(this.player));
        commands.put(Option.LOOK_NORTH, new LookNorthCommand(this.player));
        commands.put(Option.LOOK_WEST, new LookWestCommand(this.player));
        commands.put(Option.LOOK_SOUTH, new LookSouthCommand(this.player));
        commands.put(Option.LOOK_EAST, new LookEastCommand(this.player));
    }

    public boolean execute(CommandExtractor extract){
        Option commandExtract = extract.getCommand();
        Command command = commands.get(commandExtract);
        return command.execute();
    }
}
