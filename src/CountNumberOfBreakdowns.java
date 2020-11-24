import java.util.Scanner;

//Author:Mario Gliwa
//problem: 4
// Count expected number of breakdowns and cost from table
public class CountNumberOfBreakdowns {
    Scanner myInput = new Scanner(System.in);

    public void CountBreakdowns() {
        System.out.print(TextColor.BLUE_BACKGROUND + TextColor.BLACK_UNDERLINED + "---Number of breakdowns Calculator---\n");
        System.out.print(TextColor.RESET + "Enter how many breakdowns: ");
        int howManyBreakdowns = myInput.nextInt();
        double result = 0;
        int breakdowns[] = new int[howManyBreakdowns];
        for (int i = 0; i < howManyBreakdowns; i++) {
            System.out.print("Enter no." + (i + 1) + ":");
            breakdowns[i] = myInput.nextInt();
            result = result + (i * (breakdowns[i] * 0.1));

        }
        System.out.println(TextColor.RED + "Results:");
        //Expected number of breakdowns
        System.out.println(String.format("%.2f", result) + " breakdowns/day");
        //Expected breakdown cost
        System.out.println("$" + String.format("%.2f", result * 10) + "/day\n");

    }


}
