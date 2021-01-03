//8

package homework2.arrays.homework3.calculator;

public class CalculatorWithMemoryDecorator implements ICalculator {
    private double memory;
    private double lastValue;
    ICalculator calculator;

    public CalculatorWithMemoryDecorator(ICalculator calculator){
        this.calculator = calculator;
    }

    public ICalculator getCalculator(){
        return this.calculator;
    }

    public void bringToMemory(double a){
        this.memory = a;
    }

    public double getFromMemory(){
        this.lastValue = this.memory;
        this.memory = 0;
        return lastValue ;
    }

    public double getLastValue(){
        return this.lastValue;
    }

    public double div(double a, double b){
        return this.calculator.div(a, b);
    }

    public double mult(double a, double b){
        return this.calculator.mult(a, b);
    }

    public double plus(double a, double b){
        return this.calculator.plus(a, b);
    }

    public double minus(double a, double b){
        return this.calculator.minus(a, b);
    }

    public double pow(double a, int b){
        return this.calculator.pow(a, b);
    }

    public double abs(double a){
        return this.calculator.abs(a);
    }

    public double sqrt(double a){
        return this.calculator.sqrt(a);
    }
}
