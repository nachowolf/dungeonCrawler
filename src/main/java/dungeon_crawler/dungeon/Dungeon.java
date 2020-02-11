package dungeon_crawler.dungeon;

import java.util.*;

public class Dungeon {
    private Map<Direction, Dungeon> dungeons = new HashMap<>();

    public void setDungeon(Direction direction, Dungeon dungeon){
        dungeons.put(direction, dungeon);
    }

    public Dungeon getDungeon(Direction direction){
        return dungeons.get(direction);
   }

    public List<Direction> availableDirections(){
        List<Direction> dirs = new ArrayList<>();
       dungeons.keySet().forEach(dir -> {
           dirs.add((Direction) dir);
       });
       return dirs;
    }

    public Boolean availableDirections(Direction direction){
        return dungeons.containsKey(direction);
    }




}
