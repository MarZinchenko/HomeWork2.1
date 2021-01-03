//2.5

package homework2.arrays.homework3;

import homework2.arrays.homework3.calculator.CalculatorWithOperator;

public class CalculatorWithOperatorMain {
    public static void main(String[] args) {
        CalculatorWithOperator calculator = new CalculatorWithOperator();

        double mult = calculator.mult(15, 7);
        double div = calculator.div(28, 5);
        double pow = calculator.pow(div, 2);
        double plus = calculator.plus(4.1, mult);
        double result = calculator.plus(plus, pow);

        System.out.println(result);
    }
}