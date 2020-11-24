package com.company;

public class Formulas {


    double T; //Magnitude of life (Miles, hours, Cycles, etc)
    double CFF; //Cumulative Fault Frequency
    double MTBF; // Mean Time Between failure
    double lambda; // Fail Rate (% of failure per unit life)
    double R; // Reliability (say .95 for 95% reliability)
    double n; //Sample size
    double C; //Confidence level
    double samples;
    double weibull;

    public Formulas(double T, double R, double C, double samples, double weibull){
        this.T = T;
        this.R = R;
        this.C = C;
        this.samples = samples;
        this. weibull = weibull;
    }

    public Formulas() {}


    public double getSamples() {
        return samples;
    }

    public void setSamples(double samples) {
        this.samples = samples;
    }

    public double getWeibull() {
        return weibull;
    }

    public void setWeibull(double weibull) {
        this.weibull = weibull;
    }

    final double euler = 2.718281828459;

    public double getN() {
        return n;
    }

    public void setN(double n) {
        this.n = n;
    }

    public double getC() {
        return C;
    }

    public void setC(double c) {
        C = c;
    }

    public double getEuler() {
        return euler;
    }

    public double setLambdaWithCFFAndT(double CFF, double T) {
        return CFF/T;
    }
    public double findCFFWithLambdaAndT(double lambda, double T) {
        return lambda*T;
    }
    public double findCFFWithTAndMTBF(double T, double MTBF) {
        return T/MTBF;
    }
    public double findRWithFixedLambdaAndT(double lambda, double T) {   //Only with fixed lambda
        double x = (-lambda)*T;
        return Math.pow(euler,x);
    }
    public double findRWithFixedCFF(double CFF) {   //Only with fixed lambda
        return Math.pow(euler,-CFF);
    }
    public double findMTBFWithTAndCFF(double T, double CFF) {
        return T/CFF;
    }

    public double getT() {
        return T;
    }

    public void setT(double t) {
        T = t;
    }

    public double getCFF() {
        return CFF;
    }

    public void setCFF(double CFF) {
        this.CFF = CFF;
    }

    public double getMTBF() {
        return MTBF;
    }

    public void setMTBF(double MTBF) {
        this.MTBF = MTBF;
    }

    public double getLambda() {
        return lambda;
    }

    public void setLambda(double lambda) {
        this.lambda = lambda;
    }

    public double getR() {
        return R;
    }

    public void setR(double r) {
        R = r;
    }

}
