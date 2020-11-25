package com.company;

import com.company.*;

import javax.xml.crypto.Data;
import java.util.Scanner;

//Author:Mario Gliwa, Karol Skwierawski
public class MainApp {

    public static void main(String[] args) {
        FailureRateCalculator failureRateCalculator = new FailureRateCalculator();
        ConvertToMonths convertToMonths = new ConvertToMonths();
        CountNumberOfBreakdowns countNumberOfBreakdowns = new CountNumberOfBreakdowns();
        TestLifeCalculator testLifeCalculator = new TestLifeCalculator();
        TimeOfTestingCalculator timeOfTestingCalculator = new TimeOfTestingCalculator();
        int swValue;

        // Display menu graphics
        System.out.println(TextColor.BLUE + "=====================================================");
        System.out.println("|         BSI-Project-Calculator                    |");
        System.out.println("=====================================================");
        System.out.println("| Options:                                          |");
        System.out.println("|        1. failure Rate Calculator                 |");
        System.out.println("|        2. failure Rate Calculator with convert    |");
        System.out.println("|        3. count number of breakdowns              |");
        System.out.println("|        4. Test Life calculator                    |");
        System.out.println("|        5. Time of Testing calculator              |");
        System.out.println("|        6. EXIT                                    |");
        System.out.println("=====================================================");
        swValue = Keyin.inInt(TextColor.GREEN + " Select option: ");

        // Switch construct
        switch (swValue) {
            case 1:
                failureRateCalculator.CalculateFailure();
                break;
            case 2:
                failureRateCalculator.CalculateFailure();
                convertToMonths.Convert(failureRateCalculator);
                break;
            case 3:
                countNumberOfBreakdowns.CountBreakdowns();
                break;
            case 4:
                testLifeCalculator.testLifeCalulator();
                break;
            case 5:
                timeOfTestingCalculator.timeOfTestingCalculator();
                break;
            default:
                System.out.println("Invalid selection");
                break; // This break is not really necessary
        }


    }

}