package Collections.AdventureGames.AdventureGameChallenges;

import java.util.HashMap;
import java.util.Map;

public class Locations {
    private final int locationId;
    private final String Directions;
    private final Map<String, Integer> exits;

    public Locations(int locationId, String directions, Map<String, Integer> maps) {
        this.locationId = locationId;
        this.Directions = directions;
        if (maps == null) {
            this.exits = new HashMap<>();
        } else
            this.exits = new HashMap<>(maps);

    }

//    public void addExit(String directions, int locationId) {
//        this.exits.put(directions, locationId);
//    }

    public int getLocationId() {
        return locationId;
    }

    public String getDirections() {
        return Directions;
    }

    public Map<String, Integer> getExits() {
        return new HashMap<>(exits);
    }
}
