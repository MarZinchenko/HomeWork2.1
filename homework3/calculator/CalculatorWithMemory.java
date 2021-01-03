//7

package homework2.arrays.homework3.calculator;

public class CalculatorWithMemory {
    private double memory;

    public double plus(double a, double b){
        return a + b;
    }
    public double minus(double a, double b){
        return a - b;
    }
    public int mult(int a, int b){
        return a * b;
    }
    public double div(double a, double b){
        return a / b;
    }
    public double pow(double a, double b){
        return Math.pow(a, b);
    }
    public double abs(double a){
        return Math.abs(a);
    }
    public double sqrt(double a){
        return Math.sqrt(a);
    }

    public double write(){
        double div = div (28, 5);
        double pow = pow (div,2);
        double mult = mult(15, 7);
        double plus = plus (4.1, mult);
        double result = plus(plus, pow);
        return result;
    }

    public double getFromMemory(){
        write();
        memory = 0;
        memory = write();
        return memory;
    }

    public double count() {
        return memory;
    }
}
