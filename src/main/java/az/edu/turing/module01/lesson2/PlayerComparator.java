package az.edu.turing.module01.lesson2;

import java.util.Comparator;

public class PlayerComparator implements Comparator<Player> {
    @Override
    public int compare(Player p1, Player p2) {
        int scoreComparison = Integer.compare(p2.getScore(), p1.getScore());
        if (scoreComparison != 0) {
            return scoreComparison;
        }

        int ageComparison = Integer.compare(p1.getAge(), p2.getAge());
        if (ageComparison != 0) {
            return ageComparison;
        }

        return p1.isFemale() ? -1 : 1;
    }
}

