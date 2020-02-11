package dungeon_crawler.items.weapons;

import dungeon_crawler.items.Item;

import java.text.DecimalFormat;
import java.util.Random;

public class Sword implements Item, Weapon {


    @Override
    public double attack() {
        Random random = new Random();
        return Math.round(random.nextInt(5) + random.nextDouble() * 10d);
    }
}
