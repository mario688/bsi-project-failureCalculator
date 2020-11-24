
import java.util.Scanner;

/*   Problem 1:
       California Instruments, Inc., produces 3,000 computer chips per day.
       Three hundred are tested for a period of 500 operating hours each.
       During the test, six failed: two after 50 hours, two at 100 hours,
       one at 300 hours, and one at 400 hours.*/
//Author:Mario Gliwa s18866
public class FailureRateCalculator {
    Scanner myInput = new Scanner(System.in);
    private double howManyTested;
    private double howManyFailedTests;
    private double totalTime;
    private double failuresRate;
    private double downTime;
    private double workingTime;
    private double failuresDuringOperationPerHour;

    public void CalculateFailure() {

        System.out.print(TextColor.BLUE_BACKGROUND + TextColor.BLACK_UNDERLINED + "---Failure Calculator---\n");
        System.out.print(TextColor.RESET + "how many tests were performed: ");
        howManyTested = myInput.nextInt();
        System.out.print("Enter how many failed tests: ");
        howManyFailedTests = myInput.nextInt();
        System.out.print("Enter the time duration of test : ");
        totalTime = myInput.nextInt() * howManyTested;
        failuresRate = (howManyFailedTests / howManyTested) * 100;
        System.out.print("Enter the downtime (sum of hours) ");
        downTime = myInput.nextInt();
        workingTime = totalTime - downTime;
        failuresDuringOperationPerHour = howManyFailedTests / workingTime;
        double MTBF = 1 / failuresRate;
        System.out.println(TextColor.RED + "Results:");
        System.out.print(TextColor.RESET + TextColor.RED + "FR(%) = " + failuresRate + "%\n");
        System.out.print(TextColor.RED + "FR(N) = " + String.format("%.5f", failuresDuringOperationPerHour) + " failures/hour\n");
        System.out.print(TextColor.RED + "MTBF = " + String.format("%.5f", MTBF) + " hours\n");

    }

    public Scanner getMyInput() {
        return myInput;
    }

    public void setMyInput(Scanner myInput) {
        this.myInput = myInput;
    }

    public double getHowManyTested() {
        return howManyTested;
    }

    public void setHowManyTested(double howManyTested) {
        this.howManyTested = howManyTested;
    }

    public double getHowManyFailedTests() {
        return howManyFailedTests;
    }

    public void setHowManyFailedTests(double howManyFailedTests) {
        this.howManyFailedTests = howManyFailedTests;
    }

    public double getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(double totalTime) {
        this.totalTime = totalTime;
    }

    public double getFailuresRate() {
        return failuresRate;
    }

    public void setFailuresRate(double failuresRate) {
        this.failuresRate = failuresRate;
    }

    public double getDownTime() {
        return downTime;
    }

    public void setDownTime(double downTime) {
        this.downTime = downTime;
    }

    public double getWorkingTime() {
        return workingTime;
    }

    public void setWorkingTime(double workingTime) {
        this.workingTime = workingTime;
    }

    public double getFailuresDuringOperationPerHour() {
        return failuresDuringOperationPerHour;
    }

    public void setFailuresDuringOperationPerHour(double failuresDuringOperationPerHour) {
        this.failuresDuringOperationPerHour = failuresDuringOperationPerHour;
    }
}
