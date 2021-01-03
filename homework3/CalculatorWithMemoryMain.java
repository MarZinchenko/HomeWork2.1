//7.6

package homework2.arrays.homework3;

import homework2.arrays.homework3.calculator.CalculatorWithMemory;

public class CalculatorWithMemoryMain {
    public static void main(String[] args) {
        CalculatorWithMemory calculator = new CalculatorWithMemory();
        calculator.write();
        calculator.getFromMemory();
        System.out.println(calculator.count());
    }
}