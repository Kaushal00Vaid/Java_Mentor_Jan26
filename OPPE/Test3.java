package OPPE;

import java.util.*;

class Team {
    private Map<String, ArrayList<Integer>> playerMap;

    public Team(Map<String, ArrayList<Integer>> m) {
        playerMap = m;
    }

    public Map<String, ArrayList<Integer>> getPlayerMap() {
        return playerMap;
    }
}

public class Test3 {

    // Map
    // {
    // "Ravi": [76, 76, 76],
    // "sonu": [80, 80, 89],
    // "viral": [98, 47, 99]
    // }

    // keySet --> [Ravi, sonu, viral]

    // Define the method getFinalList() here
    public static ArrayList<String> getFinalList(Team t) {
        Map<String, ArrayList<Integer>> map = t.getPlayerMap();

        // ans data structure
        ArrayList<String> ans = new ArrayList<>();

        // Iterate in a hashmap
        for (String i : map.keySet()) {
            // get the value -- arrayList
            ArrayList<Integer> temp = map.get(i);

            // all >= 80 or not
            boolean flag = true;
            for (Integer j : temp) {
                if (j < 80) {
                    flag = false;
                }
            }

            if (flag) {
                ans.add(i);
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, ArrayList<Integer>> pmap = new LinkedHashMap<String, ArrayList<Integer>>();

        for (int i = 0; i < 3; i++) {
            ArrayList<Integer> pruns = new ArrayList<Integer>();
            String name = sc.next();
            for (int j = 0; j < 3; j++) {
                pruns.add(sc.nextInt());
            }
            pmap.put(name, pruns);
        }
        Team t = new Team(pmap);
        System.out.println(getFinalList(t));
    }
}