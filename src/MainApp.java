

//Author:Mario Gliwa, Karol Skwierawski
public class MainApp {

    public static void main(String[] args) {
        FailureRateCalculator failureRateCalculator = new FailureRateCalculator();
        ConvertToMonths convertToMonths = new ConvertToMonths();
        CountNumberOfBreakdowns countNumberOfBreakdowns = new CountNumberOfBreakdowns();

        failureRateCalculator.CalculateFailure();
        convertToMonths.Convert(failureRateCalculator);
        countNumberOfBreakdowns.CountBreakdowns();


    }
}
