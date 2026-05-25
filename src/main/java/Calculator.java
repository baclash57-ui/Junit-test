public class Calculator {

    //addition operation
    public double add(double a, double b) {
        return a + b;
    }
    //Subtraction operation
    public double subtract(double a, double b) {
        return a - b;
    }
    //multiplication operation
    public double multiply(double a, double b) {
        return a * b;
    }
    //Divuision operation
    public double divide(double a, double b) {
        //The condition
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }
}
