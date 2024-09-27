package az.edu.turing.module01.lesson2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Player player1 = new Player(3, "Kamran", 25, 55, false);
        Player player2 = new Player(1, "Lale", 23, 59, true);
        Player player3 = new Player(2, "Aynur", 25, 55, true);

        Player[] players = {player1, player2, player3};

        Arrays.sort(players, new PlayerComparator());

        for (Player player : players) {
            System.out.println(player.getId() + " " + player.getName() + " " + player.getAge() + " " + player.getScore() + " " + player.isFemale());
        }
    }
}

