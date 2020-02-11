package dungeon_crawler.commands;

public class NoCommand implements Command {

    @Override
    public boolean execute() {
        System.out.println("No such command.\n");
        return false;
    }
}
