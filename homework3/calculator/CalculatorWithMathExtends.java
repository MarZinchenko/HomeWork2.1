//4

package homework2.arrays.homework3.calculator;

public class CalculatorWithMathExtends extends CalculatorWithOperator implements ICalculator {
    @Override
    public double pow(double a, int b){
        return Math.pow(a, b);
    }
    @Override
    public double abs(double a){
        return Math.abs(a);
    }
    @Override
    public double sqrt(double a){
        return Math.sqrt(a);
    }
}
