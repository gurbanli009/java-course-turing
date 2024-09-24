package ModuleProblems;

import java.util.Scanner;

public class WeekPlanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[][] schedule = new String[7][2];
        schedule[0][0] = "Sunday";
        schedule[0][1] = "do home work";
        schedule[1][0] = "Monday";
        schedule[1][1] = "go to courses; watch a film";
        schedule[2][0] = "Tuesday";
        schedule[2][1] = "go to the gym";
        schedule[3][0] = "Wednesday";
        schedule[3][1] = "go swimming";
        schedule[4][0] = "Thursday";
        schedule[4][1] = "shopping, go to a course";
        schedule[5][0] = "Friday";
        schedule[5][1] = "walking";
        schedule[6][0] = "Saturday";
        schedule[6][1] = "just sleeping";

        while (true) {
            System.out.print("Please, input the day of the week: ");
            String inputDay = scanner.nextLine();

            if (inputDay.equals("exit")) {
                break;
            }

            boolean validDay = false;

            for (int i = 0; i < schedule.length; i++) {
                if (schedule[i][0].equalsIgnoreCase(inputDay)) {
                    System.out.println("Your tasks for " + schedule[i][0] + ": " + schedule[i][1]);
                    validDay = true;
                    break;
                }
            }

            if (!validDay) {
                System.out.println("Sorry, I don't understand you, please try again.");
            }
        }
    }
}

