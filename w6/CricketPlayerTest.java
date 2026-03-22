package w6;
import java.util.*;

class CricketPlayer {
    int jerseyNo;
    String name;
    
    CricketPlayer(int j, String n) {
        jerseyNo = j;
        name = n;
    }

    public String toString() {
        return jerseyNo + " " + name;
    }

    // override equals
    public boolean equals(Object o) {

        // early exit
        if(this == o) {
            return true;
        }

        if(!(o instanceof CricketPlayer) ) {
            return false;
        }
        CricketPlayer p = (CricketPlayer) o;

        return jerseyNo == p.jerseyNo && name.equals(p.name);
    }

    // overriding int hashCode() --> hashcode for 2 jersey and name --> unique
    public int hashCode() {

        // we are genrate new hash codes wrt whatever makes it unique
        return Objects.hash(name, jerseyNo);

        // Objects.hash(password, 40);

        // --> 6789 --> for 18 and virat
        // 18 and virat --> 6789
    }
}

public class CricketPlayerTest {
    public static void main(String[] args) {
        HashSet<CricketPlayer> hash = new HashSet<>();


        // hash function --> different
        hash.add(new CricketPlayer(18, "Virat"));
        hash.add(new CricketPlayer(7, "Dhoni"));
        hash.add(new CricketPlayer(18, "Virat"));
        hash.add(new CricketPlayer(7, "Dhoni"));

        for(CricketPlayer i : hash) {
            System.out.println(i);
        }
    }
}
