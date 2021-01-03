//2

package homework2.arrays.homework3.calculator;

public class CalculatorWithOperator implements ICalculator {
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
        double result = 1;
        for (int i = 0; i < b; i++) {
            result *= a;
        }
        return result;
    }
    public double abs(double a){
        if(a >= 0){
            return a;
        } else {
            return -a;
        }
    }
    public double sqrt(double a) {
        return Math.sqrt(a);
    }
}
