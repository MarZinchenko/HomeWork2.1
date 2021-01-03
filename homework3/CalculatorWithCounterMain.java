//5.7

package homework2.arrays.homework3;

import homework2.arrays.homework3.calculator.CalculatorWithCounter;
import homework2.arrays.homework3.calculator.CalculatorWithMathExtends;
import homework2.arrays.homework3.calculator.CalculatorWithOperator;

public class CalculatorWithCounterMain {
    public static void main(String[] args) {
        CalculatorWithCounter calculator = new CalculatorWithCounter(new CalculatorWithOperator());
        double mult = calculator.mult(15, 7);
        double div = calculator.div(28, 5);
        double pow = calculator.pow(div, 2);
        double plus = calculator.plus(4.1, mult);
        double result = calculator.plus(plus, pow);

        System.out.println(result);
        System.out.println(calculator.getCountOperation());

        CalculatorWithCounter calculator2 = new CalculatorWithCounter(new CalculatorWithMathExtends());
        calculator2.plus(1,1);

        System.out.println("Калькулятор 1 " + calculator.getCountOperation());
        System.out.println("Калькулятор 2 " + calculator2.getCountOperation());
    }
}
