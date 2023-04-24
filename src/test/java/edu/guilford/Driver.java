package edu.guilford;



/**
 * Unit test for simple App.
 */
public class Driver 
{
   
        public static void main(String[] args) {
            //Rational r = new Rational();  // r = 0/1
            //System.out.println(r.getNumerator());    // output: 0
            //System.out.println(r.getDenominator());  // output: 1
            //Rational r1 = new Rational();
            //System.out.println("r1 = " + r1);   // output: 0/1
            
            // Test constructor with zero denominator
            //Rational r4 = new Rational(3, 0);
            //System.out.println("r4 = " + r4);  
        
            // Test constructor with two arguments
            //Rational r2 = new Rational(3, 4);
            //System.out.println("r2 = " + r2);   // output: 3/4
        
            // Test negate method
            //r2.negate();
            //System.out.println("r2.negate() = " + r2);   // output: -3/4
            
            // Test invert method
            //r2.invert();
            //System.out.println("r2.invert() = " + r2);   // output: -4/3

            //Test the toDouble instance method
            //double d = r2.toDouble();
            //System.out.println("r2.toDouble() = " + d); 
            // Test add method
            //Rational r3 = r2.add(new Rational(1, 2));
            //System.out.println("r2 + 1/2 = " + r3);   // output: 5/8
        
            // Test reduce method
            //r3.reduce();
            //System.out.println("Reduced result: " + r3);
            //Rational r1 = new Rational();
        Rational r1 = new Rational();
        System.out.println("r1 = " + r1);   // output: a random Rational number in range [-100, 100]
        
        // Test constructor with two arguments
        //Rational r2 = new Rational(3, 0);
        //System.out.println("r2 = " + r2);   // output: Warning: Denominator cannot be zero. Setting denominator to 1.
                                            //         r2 = 3/1
        
        // Test constructor with two arguments
        //Rational r3 = new Rational(3, 4);
        //System.out.println("r3 = " + r3);
                
    }
        }
    
    

