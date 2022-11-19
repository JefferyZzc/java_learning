package calculator;

public class Mul extends CalcuUnit {
    public double calc(double x,double y)
    {
        return x*y;
    }

    public boolean fit(String operator)
    {
        return operator.equals("*");
    }

    @Override
    public String to_string() {
        return "*";
    }
}