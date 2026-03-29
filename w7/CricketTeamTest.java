package w7;

class NotValidTeamException extends Exception {
    NotValidTeamException(String msg) {
        super(msg);
    }
}

class SizeNotValidException extends Exception {
    SizeNotValidException(String msg) {
        super(msg);
    }
}

class CricketTeam {
    int[] team;

    CricketTeam(int[] arr) {
        team = arr;
    }

    public boolean isValidTeam() throws NotValidTeamException, SizeNotValidException {
        if (team.length != 11) {
            throw new SizeNotValidException("Team size should be 11");
        }

        for (int i = 0; i < team.length; i++) {
            if (team[i] < 50) {
                throw new NotValidTeamException("This team is not valid. Change the team!");
            }
        }

        return true;
    }
}

public class CricketTeamTest {
    public static void main(String[] args) {
        int[] arr = new int[] { 60, 60, 70, 80 };

        CricketTeam ob = new CricketTeam(arr);

        try {
            if (ob.isValidTeam()) {
                System.out.println("Good to go!");
            }
        } catch (NotValidTeamException e) {
            System.out.println(e.getMessage());
        } catch (SizeNotValidException e) {
            System.out.println(e.getMessage());
        }

    }
}
