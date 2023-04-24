package edu.guilford;

import java.util.Random;

/**
 * Hello world!
 *
 */
public class Rational {
    private int numerator;
    private int denominator;
    
    public Rational() {
        Random rand = new Random();
        numerator = rand.nextInt(201) - 100;  // random number in range [-100, 100]
        do {
            denominator = rand.nextInt(201) - 100;
        } while (denominator == 0);  // ensure denominator is not zero
        reduce();  // reduce the fraction to lowest terms
    }
    
    public Rational(int numerator, int denominator) {
        if (denominator == 0) {
            System.out.println("Warning: Denominator cannot be zero. Setting denominator to 1.");
            denominator = 1;
        }
        this.numerator = numerator;
        this.denominator = denominator;
        reduce();
    }
    
    public int getNumerator() {
        return numerator;
    }
    
    public int getDenominator() {
        return denominator;
    }
    
    
    public void negate() {
        numerator = -numerator;
    }
    
    public void invert() {
        int temp = numerator;
        numerator = denominator;
        denominator = temp;
    }
    public void reduce() {
        int gcd = findGcd(this.numerator, this.denominator);
        int reducedNum = this.numerator / gcd;
        int reducedDenom = this.denominator / gcd;
        System.out.printf("%d/%d can be reduced to %d/%d%n", this.numerator, this.denominator, reducedNum, reducedDenom);
    }
    
    private static int findGcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return findGcd(b, a % b);
        }
    }
    public Rational add(Rational other) {
        int newNum = this.numerator * other.denominator + this.denominator * other.numerator;
        int newDenom = this.denominator * other.denominator;
        Rational result = new Rational(newNum, newDenom);
        result.reduce();
        return result;
    }

    
    
    
    
    public Rational subtract(Rational other) {
        int newNumerator = numerator * other.denominator - other.numerator * denominator;
        int newDenominator = denominator * other.denominator;
        return new Rational(newNumerator, newDenominator);
    }
    
    public Rational multiply(Rational other) {
        int newNumerator = numerator * other.numerator;
        int newDenominator = denominator * other.denominator;
        return new Rational(newNumerator, newDenominator);
    }
    
    public Rational divide(Rational other) {
        int newNumerator = numerator * other.denominator;
        int newDenominator = denominator * other.numerator;
        return new Rational(newNumerator, newDenominator);
    }
    
    public double toDouble() {
        return (double) numerator / denominator;
    }
    
    public String toString() {
        return numerator + "/" + denominator;
    }
}
