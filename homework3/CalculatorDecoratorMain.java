package homework2.arrays.homework3;

import homework2.arrays.homework3.calculator.CalculatorWithCounterDecorator;
import homework2.arrays.homework3.calculator.CalculatorWithMathExtends;
import homework2.arrays.homework3.calculator.CalculatorWithMemoryDecorator;

public class CalculatorDecoratorMain {
    public static void main(String[] args) {
        CalculatorWithCounterDecorator calcNumberOfUses = new CalculatorWithCounterDecorator(new CalculatorWithMathExtends());
        CalculatorWithMemoryDecorator calculator = new CalculatorWithMemoryDecorator(calcNumberOfUses);

        calculator.bringToMemory(calculator.div(28.0, 5.0));
        calculator.bringToMemory(calculator.pow(calculator.getFromMemory(), 2));
        calculator.bringToMemory(calculator.plus(calculator.getFromMemory(), calculator.mult(15.0, 7.0)));
        double result = calculator.plus(4.1, calculator.getFromMemory());

        System.out.println(result);
        System.out.println("Количество использований калькулятора: " + calcNumberOfUses.getCountOperation());
        System.out.println("Последнее сохраненное значение в памяти: " + calculator.getLastValue());
    }
}
