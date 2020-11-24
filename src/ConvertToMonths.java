//Author:Mario Gliwa s18866
/* Problem: 2
If 300 of these chips are used in building a mainframe computer,
how many failures of the computer can be expected per month?*/
//Converting from failures/hour to failures/month


public class ConvertToMonths {
    public void Convert(FailureRateCalculator failureRateCalculator) {
        System.out.print(TextColor.BLUE_BACKGROUND + TextColor.BLACK_UNDERLINED + "---Converter failures/hour to failures/month---\n");
        double howManyTested = failureRateCalculator.getHowManyTested();
        double failuresDuringOperationPerMonth = failureRateCalculator.getFailuresDuringOperationPerHour() * 24 * 30;
        double MTBF = 1 / failuresDuringOperationPerMonth * 30;
        System.out.println(TextColor.RESET + TextColor.RED + "Results:");
        System.out.println("FR(N) = " + String.format("%.5f", failuresDuringOperationPerMonth) + " failures/month");
        System.out.println("FR(N) for: " + howManyTested + " units = " + String.format("%.5f", failuresDuringOperationPerMonth * howManyTested) + " failures/month");
        System.out.println("MTBF = " + String.format("%.5f", MTBF) + " days");
    }
}
