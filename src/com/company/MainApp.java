package com.company;

//Author:Mario Gliwa, Karol Skwierawski
public class MainApp {

    public static void main(String[] args) {
        FailureRateCalculator failureRateCalculator = new FailureRateCalculator();
        ConvertToMonths convertToMonths = new ConvertToMonths();
        CountNumberOfBreakdowns countNumberOfBreakdowns = new CountNumberOfBreakdowns();

        failureRateCalculator.CalculateFailure();
        convertToMonths.Convert(failureRateCalculator);
        countNumberOfBreakdowns.CountBreakdowns();


        //MOJE KAROL
        Formulas objectForExercise41 = new Formulas(100000, 0.95, 0.6, 6, 2);
        Formulas objectForExercise43 = new Formulas(1500,0.9,0.8,10,2);

        Double exercise41Result = exercise41(objectForExercise41);
        Double exercise43Result = exercise43(objectForExercise43);

        System.out.println(exercise41Result);
        System.out.println(exercise43Result);
    }

    public static double exercise41(Formulas object) {
        double pom1 = (1 / object.getSamples() * (Math.log10(1 / (1 - object.getC()))));
        double pom2 = Math.log10(1 / (1 - (1 - object.getR())));
        double pom3 = Math.pow((pom1 / pom2), (1 / object.getWeibull()));
        return object.getT() * pom3;
    }

    public static double exercise43(Formulas object) {
        double pom1 = (1 / object.getSamples() * (Math.log10(1 / (1 - object.getC()))));
        double pom2 = Math.log10(1 / (1 - (1 - object.getR())));
        double pom3 = Math.pow((pom1 / pom2), (1 / object.getWeibull()));
        return object.getT() * pom3*1.5;
    }
}

