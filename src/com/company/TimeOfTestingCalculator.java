package com.company;

import java.util.Scanner;

//Author Karol Skwierawski s18497
/* Exercise 4.1:
Design a test to demonstrate 100,000 miles life at 95% reliability and 60% confidence.
The available sample size is 6.(Assume b=2)

Exercise 4.3:
How long should you test 10 samples of a component which is designed to have 1500
hours at 80 % confidence and 90% reliability? Assume b = 2
 */
public class TimeOfTestingCalculator {
    double reliability;
    double sample;
    double confidenceLevel;
    double weibull;
    double magnitudeOfLife;
    Scanner scanner = new Scanner(System.in);

    public void timeOfTestingCalculator() {
        System.out.print(TextColor.BLUE_BACKGROUND + TextColor.BLACK_UNDERLINED + "---Test life Calculator---\n");
        System.out.print(TextColor.RESET + "Enter magnitude of life: ");
        magnitudeOfLife = scanner.nextDouble();
        System.out.print("Enter reliability: ");
        reliability = scanner.nextDouble();
        System.out.print("Enter confidence: ");
        confidenceLevel = scanner.nextDouble();
        System.out.print("Enter sample size ");
        sample = scanner.nextDouble();
        System.out.print("Enter Weibull: ");
        weibull = scanner.nextDouble();

        double pom = (1 / sample * (Math.log10(1 / (1 - confidenceLevel)))) / (Math.log10(1 / (1 - (1 - reliability))));
        double result = Math.pow((pom), (1 / weibull)) * magnitudeOfLife * 1.5;

        System.out.println( TextColor.RED + String.format("%.0f", result) + " hours/miles");

    }

    public double getReliability() {
        return reliability;
    }

    public void setReliability(double reliability) {
        this.reliability = reliability;
    }

    public double getSample() {
        return sample;
    }

    public void setSample(double sample) {
        this.sample = sample;
    }

    public double getConfidenceLevel() {
        return confidenceLevel;
    }

    public void setConfidenceLevel(double confidenceLevel) {
        this.confidenceLevel = confidenceLevel;
    }

    public double getWeibull() {
        return weibull;
    }

    public void setWeibull(double weibull) {
        this.weibull = weibull;
    }

    public double getMagnitudeOfLife() {
        return magnitudeOfLife;
    }

    public void setMagnitudeOfLife(double magnitudeOfLife) {
        this.magnitudeOfLife = magnitudeOfLife;
    }
}
