//8

package homework2.arrays.homework3.calculator;

public class CalculatorWithCounterDecorator implements ICalculator{
    private long countOperation = 0;

    private final ICalculator calculator;

    public CalculatorWithCounterDecorator(ICalculator calculator){
        this.calculator = calculator;
    }

    public double plus(double a, double b){
        this.countOperation++;
        return this.calculator.plus(a, b);
    }

    public double minus(double a, double b){
        this.countOperation++;
        return this.calculator.minus(a, b);
    }

    public double div(double a, double b){
        this.countOperation++;
        return this.calculator.div(a, b);
    }

    public double mult(double a, double b){
        this.countOperation++;
        return this.calculator.mult(a, b);
    }

    public double pow(double a, int b){
        this.countOperation++;
        return this.calculator.pow(a, b);
    }

    public double abs(double a){
        this.countOperation++;
        return this.calculator.abs(a);
    }

    public double sqrt(double a){
        this.countOperation++;
        return this.calculator.sqrt(a);
    }

    public long getCountOperation() {
        return countOperation;
    }
}
