package dungeon_crawler;

import dungeon_crawler.commands.Option;
import dungeon_crawler.dungeon.Direction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommandExtractor {

    private Option command;


    public CommandExtractor(String input){
        List<String> data = Arrays.<String>asList(input.toLowerCase().split(" "));

        for(String word : Dictionary.getMoveWords()){
            if(data.contains(word)){
                Direction dir = Direction.getDirection(data.get(data.indexOf(word)+1));
                switch (dir){
                    case N:
                        this.command = Option.MOVE_NORTH;
                        return;
                    case W:
                        this.command = Option.MOVE_WEST;
                        return;
                    case S:
                        this.command = Option.MOVE_SOUTH;
                        return;
                    case E:
                        this.command = Option.MOVE_EAST;
                        return;
                    default:
                        this.command = Option.NO_COMMAND;
                        return;
                }
            }


        }

        for(String word : Dictionary.getLookWords()){
            if(data.contains(word)){
                if(data.contains("around")){
                    command = Option.LOOK_AROUND;
                    return;
                }

               else{
                    switch(Direction.getDirection(data.get(data.indexOf(word)+1))){
                        case N:
                            command = Option.LOOK_NORTH;
                            return;
                        case W:
                            command = Option.LOOK_WEST;
                            return;
                        case S:
                            command = Option.LOOK_SOUTH;
                            return;
                        case E:
                            command = Option.LOOK_EAST;
                            return;
                        default:
                            this.command = Option.NO_COMMAND;
                            return;
                    }
                }

            }
        }


        this.command = Option.NO_COMMAND;
    }


    public Option getCommand() {
        return command;
    }
}
