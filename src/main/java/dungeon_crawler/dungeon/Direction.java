package dungeon_crawler.dungeon;

public enum Direction {
    N("North"),
    W("West"),
    S("South"),
    E("East");

    private String direction;

    Direction(String direction){
        this.direction = direction;
    }

    @Override
    public String toString() {
        return direction;
    }

    public static Direction getDirection(String value){
        for(Direction direction : Direction.values()){
            if(direction.toString().equalsIgnoreCase(value) || direction.toString().toLowerCase().startsWith(value.toLowerCase())){
                return direction;
            }
        }
        throw new IllegalArgumentException("Not A direction");
    }
}
