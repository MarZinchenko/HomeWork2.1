//3

package homework2.arrays.homework3.calculator;

public class CalculatorWithMathCopy implements ICalculator {
    public double plus(double a, double b) {
        return a + b;
    }
    public double minus(double a, double b) {
        return a - b;
    }
    public double mult(double a, double b) {
        return a * b;
    }
    public double div(double a, double b) {
        return a / b;
    }
    public double pow(double a, int b) {
        return Math.pow(a, b);
    }
    public double abs(double a){
        return Math.abs(a);
    }
    public double sqrt(double a){
        return Math.sqrt(a);
    }
}



