package dungeon_crawler;

import dungeon_crawler.dungeon.Direction;
import dungeon_crawler.dungeon.Dungeon;
import dungeon_crawler.player.Player;

public class Narrator {

    private Player currentPlayer;
    private Dungeon dungeon;

    public Narrator(Player currentPlayer){
        this.currentPlayer = currentPlayer;
    }

    public void read(){
        StringBuilder sb = new StringBuilder();
        sb.append(TerminalColor.ANSI_RESET);
        sb.append("You are currently exploring a dungeon_crawler.dungeon.\n");
        for(Direction direction : currentPlayer.getCurrentDungeon().availableDirections()){
            sb.append(String.format("You see a path to the %s%s.%s\n", TerminalColor.ANSI_BLUE,direction.toString(), TerminalColor.ANSI_RESET));
        }

        sb.append(TerminalColor.ANSI_PURPLE);
        sb.append("What would you like to do?");
        sb.append(TerminalColor.ANSI_GREEN);
        System.out.println(sb.toString());
    }



}
