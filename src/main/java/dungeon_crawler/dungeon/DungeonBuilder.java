package dungeon_crawler.dungeon;
import static dungeon_crawler.dungeon.Direction.*;

public class DungeonBuilder {

    private Dungeon startDungeon;

    private Direction oppositeDirection(Direction direction){
        switch (direction){
            case N:
                return Direction.S;
            case W:
                return Direction.E;
            case S:
                return Direction.N;
            case E:
                return Direction.W;
        }
        return null;
    }
    private void linkDungeons (Dungeon currentDungeon, Direction directionToOtherDungeon, Dungeon otherDungeon){
        currentDungeon.setDungeon(directionToOtherDungeon, otherDungeon);
        otherDungeon.setDungeon(oppositeDirection(directionToOtherDungeon), currentDungeon);
    }

    public void build(){
        startDungeon = new Dungeon();

        Dungeon eastRM1 = new Dungeon();
        Dungeon westRM1 = new Dungeon();
        Dungeon northRM1 = new Dungeon();

        linkDungeons(startDungeon, E, eastRM1);
        linkDungeons(startDungeon, W, westRM1);
        linkDungeons(startDungeon, N, northRM1);
    }

    public Dungeon getStartDungeon(){
        return startDungeon;
    }
}
