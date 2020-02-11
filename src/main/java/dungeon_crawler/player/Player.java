package dungeon_crawler.player;

import dungeon_crawler.dungeon.Direction;
import dungeon_crawler.dungeon.Dungeon;

public class Player {
    private String playerName;
    private Dungeon currentDungeon;


    public Player(String playerName, Dungeon startDungeon){
        this.playerName = playerName;
        this.currentDungeon = startDungeon;
    }

    public void setCurrentDungeon(Dungeon currentDungeon) {
        this.currentDungeon = currentDungeon;
    }

    public String getPlayerName() {
        return playerName;
    }

    public Dungeon getCurrentDungeon() {
        return currentDungeon;
    }

    public boolean moveDungeon(Direction direction){
        if(this.currentDungeon.availableDirections(direction)){
            currentDungeon = currentDungeon.getDungeon(direction);
            return true;
        }
        else return false;
    }
}
