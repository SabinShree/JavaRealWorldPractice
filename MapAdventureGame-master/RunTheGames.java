package Collections.AdventureGames.AdventureGameChallenges;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RunTheGames {
    private static Map<Integer, Locations> exits = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> maps = new HashMap<>();

        exits.put(4, new Locations(0, "Going south", null));

        maps.put("W", 2);
        maps.put("N", 3);
        maps.put("S", 4);
        exits.put(1, new Locations(1, "Going east", maps));

        maps = new HashMap<>();
        maps.put("E", 1);
        maps.put("N", 3);
        maps.put("S", 4);
        exits.put(2, new Locations(2, "Going West", maps));
        // System.out.println("Demo " + exits.get(2).getExits());

        maps = new HashMap<>();
        maps.put("E", 1);
        maps.put("W", 2);
        maps.put("S", 4);
        exits.put(3, new Locations(3, "Going north", maps));
        // System.out.println("Demo " + exits.get(3).getExits());

        maps = new HashMap<>();
        maps.put("E", 1);
        maps.put("W", 2);
        maps.put("N", 3);
        exits.put(5, new Locations(4, "Going south", maps));

     //   exits.put(6, new Locations(5, "Going NorthEast", null));

        Map<String, String> newMap = new HashMap<>();
        newMap.put("EAST", "E");
        newMap.put("WEST", "W");
        newMap.put("NORTH", "N");
        newMap.put("SOUTH", "S");
        boolean quit = false;
        int loc = 1;
        while (!quit) {
            System.out.println(exits.get(loc).getDirections());
            Map<String, Integer> dir = exits.get(loc).getExits();
            if (loc == 0) {
                break;
            }
            //  System.out.println(dir);
            System.out.println("Remaining way are : ");
            for (String s : dir.keySet()) {
                System.out.print(s + ", ");
            }
            String crs = scanner.nextLine().toUpperCase();
           /* if (crs.equalsIgnoreCase("bye") || crs.equalsIgnoreCase("Exit")) {
                System.out.println("Oki bye");
                break;
            }*/

            if (crs.length() > 1) {
                String[] splitWord = crs.split(" ");
                for (String a : splitWord) {
                    if (newMap.containsKey(a)) {
                        crs = newMap.get(a);
                        break;
                    }
                }
            }

            if (dir.containsKey(crs)) {
                loc = dir.get(crs);
            } else {
                System.out.println("Not in the list");
            }
        }


    }

}
