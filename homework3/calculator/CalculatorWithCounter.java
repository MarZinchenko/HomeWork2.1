//5

package homework2.arrays.homework3.calculator;

public class CalculatorWithCounter {
    private long countOperation = 0;

    private final CalculatorWithOperator calculator1;
    private final CalculatorWithMathCopy calculator2;
    private final CalculatorWithMathExtends calculator3;

    public CalculatorWithCounter(CalculatorWithOperator calculator){
        this.calculator1 = calculator;
        this.calculator2 = null;
        this.calculator3 = null;
    }

    public CalculatorWithCounter(CalculatorWithMathCopy calculator){
        this.calculator1 = null;
        this.calculator2 = calculator;
        this.calculator3 = null;
    }

    public CalculatorWithCounter(CalculatorWithMathExtends calculator){
        this.calculator1 = null;
        this.calculator2 = null;
        this.calculator3 = calculator;
    }

    public double plus(double a, double b){
        this.countOperation++;
        if(this.calculator1 != null){
            return this.calculator1.plus(a, b);
        } else if(this.calculator2 != null){
            return this.calculator2.plus(a, b);
        } else {
            return this.calculator3.plus(a, b);
        }
    }

    public double minus(double a, double b){
        this.countOperation++;
        if(this.calculator1 != null){
            return this.calculator1.minus(a, b);
        } else if(this.calculator2 != null){
            return this.calculator2.minus(a, b);
        } else {
            return this.calculator3.minus(a, b);
        }
    }

    public double div(double a, double b){
        this.countOperation++;
        if(this.calculator1 != null){
            return this.calculator1.div(a, b);
        } else if(this.calculator2 != null){
            return this.calculator2.div(a, b);
        } else {
            return this.calculator3.div(a, b);
        }
    }

    public double mult(double a, double b){
        this.countOperation++;
        if(this.calculator1 != null){
            return this.calculator1.mult(a, b);
        } else if(this.calculator2 != null){
            return this.calculator2.mult(a, b);
        } else {
            return this.calculator3.mult(a, b);
        }
    }

    public double pow(double a, int b){
        this.countOperation++;
        if(this.calculator1 != null){
            return this.calculator1.pow(a, b);
        } else if(this.calculator2 != null){
            return this.calculator2.pow(a, b);
        } else {
            return this.calculator3.pow(a, b);
        }
    }

    public double abs(double a){
        this.countOperation++;
        if(this.calculator1 != null){
            return this.calculator1.abs(a);
        } else if(this.calculator2 != null){
            return this.calculator2.abs(a);
        } else {
            return this.calculator3.abs(a);
        }
    }

    public double sqrt(double a){
        this.countOperation++;
        if(this.calculator1 != null){
            return this.calculator1.sqrt(a);
        } else if(this.calculator2 != null){
            return this.calculator2.sqrt(a);
        } else {
            return this.calculator3.sqrt(a);
        }
    }

    public long getCountOperation() {
        return countOperation;
    }
}

