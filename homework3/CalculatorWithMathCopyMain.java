//3.3

package homework2.arrays.homework3;

import homework2.arrays.homework3.calculator.CalculatorWithMathCopy;

public class CalculatorWithMathCopyMain {
    public static void main(String[] args) {
        CalculatorWithMathCopy calculator = new CalculatorWithMathCopy();
        double mult = calculator.mult(15, 7);
        double div = calculator.div(28, 5);
        double pow = calculator.pow(div, 2);
        double plus = calculator.plus(4.1, mult);
        double result = calculator.plus(plus, pow);

        System.out.println(result);
    }
}

