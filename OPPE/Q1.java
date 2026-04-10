package OPPE;

import java.util.*;

class Player {
    String name;
    String[] games;

    // *****Define constructor(s) here
    public Player(String n, String[] arr) {
        name = n;
        games = arr;
    }

    public Player(Player p) {
        name = p.name;

        // DEEP COPY
        // 1) initialise the array
        // 2) iterate one by one and store
        games = new String[p.games.length];

        for (int i = 0; i < games.length; i++) {
            games[i] = p.games[i];
        }

        // games = p.games.clone(); // clone ensures it's a DEEP COPY

    }

    public void setName(String n) {
        name = n;
    }

    public void setGames(int indx, String g) {
        games[indx] = g;
    }

    public String getName() {
        return name;
    }

    public String getGames(int indx) {
        return games[indx];
    }
}

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] games = { "Throwball", "Javelin", "Volleyball" };
        Player p1 = new Player("Ranjit", games);
        Player p2 = new Player(p1);
        p2.setName(sc.next());
        p2.setGames(1, sc.next());
        System.out.println(p1.getName() + ": " + p1.getGames(1));
        System.out.println(p2.getName() + ": " + p2.getGames(1));
    }
}