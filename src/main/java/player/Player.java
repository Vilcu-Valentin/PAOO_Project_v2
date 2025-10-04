package player;

import items.*;

import java.util.EnumMap;
import java.util.Map;

public class Player {
    private Inventory inventory;
    private Stats stats;
    private Map<GearType, Gear> equippedGear;

    // player.Player Singleton pattern
    private static Player instance = new Player();

    private Player() {
        this.inventory = new Inventory(30, this);
        this.stats = new Stats(50, 20, 1, 0, 5, 5,5,5,5);
        this.equippedGear = new EnumMap<>(GearType.class);
    }

    public static Player getInstance() {
        return instance;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public Stats getStats() {
        return stats;
    }

    public Map<GearType, Gear> getEquippedGear() {
        return equippedGear;
    }
}
